package ru.kpfu.itis.alina.classes;

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         008
 */

public class Connection extends Thread {
    private static ArrayList<String> names = new ArrayList<>();
    private static HashSet<PrintWriter> writers = new HashSet<>();
    private String clientname;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    int count;

    public static ArrayList<String> getNames() {
        return names;
    }

    public static HashSet<PrintWriter> getWriters() {
        return writers;
    }

    public String getClientname() {
        return clientname;
    }

    public Socket getSocket() {
        return socket;
    }

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getOut() {
        return out;
    }

    public int getCount() {
        return count;
    }

    public Connection(Socket socket, int count) throws InterruptedException {
        this.socket = socket;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                out.println("subname");
                clientname = in.readLine();
                synchronized (names) {
                    if (!names.contains(clientname)) {
                        names.add(clientname);
                        break;
                    }
                }
            }

            out.println("nameaccesed");
            writers.add(out);

            if (names.size() == 3) {
                printOrder();
            }

            while (true) {
                String input = in.readLine();
                if (input.matches("[0-9]{4}") ||
                        input.matches("[0-4].+  [0-4].+") || input.startsWith("Я загадал(а)")
                        || input.contains("покинул(а) нас")) {
                    for (PrintWriter writer : writers) {
                        writer.println("messagemade " + clientname + ": " + input);
                    }
                    for (PrintWriter writer : writers) {
                        writer.println("win " + clientname + ": " + input);
                    }
                }
            }
        } catch (SocketException e) {
            for (PrintWriter writer : writers) {
                writer.println("conreset " + clientname + " покинул(а) нас :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (clientname != null) {
                names.remove(clientname);
            }
            if (out != null) {
                writers.remove(out);
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void printOrder() {
        for (PrintWriter writer : writers) {
            for (String name : names) {
                writer.println("order " + name + "\n");
            }
        }
    }
}
