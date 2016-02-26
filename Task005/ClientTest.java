package Tests;

import SemGame.*;
import org.junit.*;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         005
 */

public class ClientTest {
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
    JScrollPane jScrollPane1 = new JScrollPane();
    JButton B = new JButton();
    JButton K = new JButton();
    JTextArea history = new JTextArea();
    JScrollPane jScrollPane3 = new JScrollPane();
    JTextField number = new JTextField();
    Client client;

    @BeforeClass
    public static void clientConstructorShouldBeCorrect() throws IOException {
        Client client = new Client();
        client.run();
        org.junit.Assert.assertEquals(client.getName(), "Alina");
        org.junit.Assert.assertEquals(client.getHost(), String.valueOf(9900));
    }

    @Test
    public void getNameShouldReturnName() {
        org.junit.Assert.assertEquals(client.getName(), "Alina");
    }

    @Test
    public void getHostShouldReturnHost() {
        org.junit.Assert.assertEquals(client.getHost(), String.valueOf(9900));
    }

    @Test
    public void newGameShouldBeCorrect() {
        Client client = mock(Client.class);
        when(client.getName()).thenReturn("Alina");
        when(client.getHost()).thenReturn(String.valueOf(9900));
        org.junit.Assert.assertEquals(client.getName(), "Alina");
        org.junit.Assert.assertEquals(client.getHost(), String.valueOf(9900));
    }

    @Test
    public void runShouldBeCorrect() throws IOException {
        Socket socket = mock(Socket.class);
        when(socket.getPort()).thenReturn(9900);
        client.run();
        org.junit.Assert.assertEquals(client.getName(), "Alina");
    }

    @Test
    public void editFalseShoulDoAllEnableFalse() {
        client.editFalse();
        org.junit.Assert.assertFalse(one.isEnabled());
        org.junit.Assert.assertFalse(two.isEnabled());
        org.junit.Assert.assertFalse(three.isEnabled());
        org.junit.Assert.assertFalse(four.isEnabled());
        org.junit.Assert.assertFalse(five.isEnabled());
        org.junit.Assert.assertFalse(six.isEnabled());
        org.junit.Assert.assertFalse(seven.isEnabled());
        org.junit.Assert.assertFalse(eight.isEnabled());
        org.junit.Assert.assertFalse(nine.isEnabled());
        org.junit.Assert.assertFalse(display.isEnabled());
        org.junit.Assert.assertFalse(clean.isEnabled());
    }

    @Test
    public void editTrueShoulDoAllEnableTrue() {
        client.editFalse();
        org.junit.Assert.assertTrue(one.isEnabled());
        org.junit.Assert.assertTrue(two.isEnabled());
        org.junit.Assert.assertTrue(three.isEnabled());
        org.junit.Assert.assertTrue(four.isEnabled());
        org.junit.Assert.assertTrue(five.isEnabled());
        org.junit.Assert.assertTrue(six.isEnabled());
        org.junit.Assert.assertTrue(seven.isEnabled());
        org.junit.Assert.assertTrue(eight.isEnabled());
        org.junit.Assert.assertTrue(nine.isEnabled());
        org.junit.Assert.assertTrue(display.isEnabled());
        org.junit.Assert.assertTrue(clean.isEnabled());
    }
}
