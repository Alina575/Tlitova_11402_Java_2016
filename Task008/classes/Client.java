package ru.kpfu.itis.alina.classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         008
 */

@Component
public class Client {
    private String s;
    private BufferedReader in;
    private PrintWriter out;

    JFrame frame = new JFrame("Быки и коровы ™");
    JTextField display = new JTextField();
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton seven = new JButton("7");
    JButton four = new JButton("4");
    JButton six = new JButton("6");
    JButton five = new JButton("5");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton clean = new JButton("C");
    JButton numOk = new JButton("✔");
    JButton zero = new JButton("0");
    JLabel image = new JLabel("Picture");
    JButton rules = new JButton("Правила");
    JScrollPane jScrollPane1 = new JScrollPane();
    JButton B = new JButton();
    JButton K = new JButton();
    JTextArea history = new JTextArea();
    JScrollPane jScrollPane3 = new JScrollPane();
    JTextField number = new JTextField();
    JButton makenumber = new JButton("Загадать число! ✵");
    String n;
    String[] options = {"Играть снова", "Выйти"};
    private JFrame win;


    public Client() {
        frame.setBounds(1, 1, 650, 250);
        history.setColumns(20);
        history.setRows(5);
        jScrollPane3.setViewportView(history);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        image.setIcon(new ImageIcon(getClass().getResource("/ru/kpfu/itis/alina/resourses/mainIMG.jpg")));
        jScrollPane1.setToolTipText("");

        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "Б  ");
            }
        });

        K.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "К  ");
            }
        });

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "5");

            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "9");
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText(display.getText() + "0");
            }
        });

        clean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                display.setText("");
                s = "";
            }
        });

        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Самый первый игрок в списке загадывает \n" +
                        "число, введя его предварительно \n" +
                        "в поле рядом с кнопкой 'Загадать число!'. \n" +
                        "После нажатия другие по выстроенной \n" +
                        "очереди делают попытки отгадать число. \n" +
                        "Попытка — это 4-значное число с \n" +
                        "неповторяющимися цифрами, сообщаемое \n" +
                        "противнику. Загадавший число игрок \n" +
                        "сообщает в ответ, сколько цифр угадано \n" +
                        "в формате '3Б 0К'. Если совпадает цифра и \n" +
                        "её позиция в тайном числе - это 1Б (один бык), \n" +
                        "а если только цифра - 1К (одна корова). \n" +
                        "Побеждает тот, кто угадает число первым. \n");
            }
        });

        B.setText("Б");
        K.setText("К");

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rules, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(B, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(K, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(1, 1, 1))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(clean, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                                        .addComponent(seven, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                                        .addComponent(four, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                                        .addComponent(one, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(five, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(six, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(two, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(three, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                        .addComponent(eight, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(nine, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                        .addComponent(zero, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(numOk, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))))))
                                                        .addComponent(display, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(image, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(number, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(makenumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(number)
                                                        .addComponent(makenumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(image))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(display, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(one)
                                                        .addComponent(two)
                                                        .addComponent(three))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(four)
                                                        .addComponent(five)
                                                        .addComponent(six))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(seven)
                                                        .addComponent(eight)
                                                        .addComponent(nine))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(clean)
                                                        .addComponent(zero)
                                                        .addComponent(numOk))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(B, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(K, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(rules))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane3)))
                                .addContainerGap())
        );

        numOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.println(display.getText());
                display.setText("");
            }
        });

        makenumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.println("Я загадал(а) число! Начнём!:)");
                number.setEditable(false);
                makenumber.setEnabled(false);
            }
        });

        editFalse();

        frame.setVisible(true);
        frame.pack();
    }

    public String getName() {
        return JOptionPane.showInputDialog(frame,
                "Введите своё имя:",
                "Добро пожаловать!",
                JOptionPane.PLAIN_MESSAGE);
    }

    public String getHost() {
        return JOptionPane.showInputDialog(frame,
                "Host:", "", JOptionPane.PLAIN_MESSAGE);
    }


    public void newGame() throws IOException {
        int messageType = JOptionPane.QUESTION_MESSAGE;
        int code = JOptionPane.showOptionDialog(win, "У нас есть победитель!:)", "Игра окончена",
                0, messageType, null, options, null);
        if (code == 0) {
            frame.dispose();
            Client client = new Client();
            client.run();
        } else if (code == 1) {
            System.exit(0);
        }
    }

    public void run() throws IOException {
        try {
            n = getHost();
            Socket socket = new Socket(n, 9900);

            JOptionPane.showMessageDialog(frame,
                    "Ожидайте, пока подключатся все игроки. \n" +
                            "Затем вы увидите список 'Очередь'. \n" +
                            "Самый первый игрок в списке загадывает \n" +
                            "число, введя его предварительно \n" +
                            "в поле рядом с кнопкой 'Загадать число!'. \n" +
                            "После нажатия другие по выстроенной \n" +
                            "очереди делают попытки отгадать число. \n" +
                            "Попытка — это 4-значное число с \n" +
                            "неповторяющимися цифрами, сообщаемое \n" +
                            "противнику. Загадавший число игрок \n" +
                            "сообщает в ответ, сколько цифр угадано \n" +
                            "в формате '3Б 0К'. Если совпадает цифра и \n" +
                            "её позиция в тайном числе - это 1Б (один бык), \n" +
                            "а если только цифра - 1К (одна корова). \n" +
                            "Побеждает тот, кто угадает число первым. \n" +
                            "                     Желаем удачи! \n");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            history.append("Очередь:" + "\n");
            while (true) {
                String act = in.readLine();
                if (act.startsWith("subname")) {
                    n = getName();
                    out.println(n);
                } else if (act.startsWith("nameaccesed")) {
                    rules.setEnabled(true);
                } else if (act.startsWith("order")) {
                    history.setEnabled(true);
                    String message = act.substring(6);
                    history.append(message + "\n");
                    number.setEditable(true);
                    makenumber.setEnabled(true);
                } else if (act.startsWith("messagemade")) {
                    editTrue();
                    String message = act.substring(12);
                    number.setEditable(false);
                    makenumber.setEnabled(false);
                    history.append(message + "\n");
                } else if (act.startsWith("win")) {
                    String message = act.substring(4);
                    if (message.contains("4Б  0К")) {
                        newGame();
                    }
                } else if (act.contains("conreset")) {
                    String message = act.substring(9);
                    history.append(message + "\n");
                }
            }
        } catch (SocketException e) {
            frame.dispose();
            JOptionPane.showMessageDialog(frame,
                    "Попробуйте чуть позже.",
                    "Возникла ошибка!",
                    JOptionPane.ERROR_MESSAGE);
            out.flush();
            out.close();
            in.close();
        }
    }


    public void editFalse() {
        display.setEditable(false);
        number.setEditable(false);
        history.setEditable(false);
        makenumber.setEnabled(false);
        number.setEditable(false);
        display.setEditable(false);
        numOk.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        zero.setEnabled(false);
        clean.setEnabled(false);
        B.setEnabled(false);
        K.setEnabled(false);
    }


    public void editTrue() {
        number.setEditable(true);
        makenumber.setEnabled(true);
        number.setEditable(true);
        display.setEditable(true);
        numOk.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        zero.setEnabled(true);
        clean.setEnabled(true);
        B.setEnabled(true);
        K.setEnabled(true);
    }


    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        Client client = ac.getBean(Client.class);
        client.run();

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}