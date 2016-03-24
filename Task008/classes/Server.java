package ru.kpfu.itis.alina.classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         008
 */

@Component
public class Server {
    public static ArrayList<Connection> connections;
    JFrame frame = new JFrame();
    JTextField field = new JTextField();

    public Server(){}

    public Server(ServerSocket s) throws IOException {
        frame.setBounds(20, 20, 200, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        connections = new ArrayList<>();
        int count = 1;
        s = new ServerSocket(9900);
        frame.setTitle("Started...");
        frame.add(field);
        try {
            while (count < 4) {
                Socket client = s.accept();
                field.setText("     Client number " + count + " connected!    ");
                Connection c = new Connection(client, count++);
                connections.add(c);
            }
            for (Connection connection : connections) {
                connection.start();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        Server server = ac.getBean(Server.class);
    }
}