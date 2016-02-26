package Tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.Socket;

import SemGame.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         005
 */

public class ConnectionTest {
    private static Socket socket;

    @BeforeClass
    public static void connectionShouldAllowThreeClients() throws InterruptedException {
        Connection c = new Connection(socket, 5);
        Assert.assertEquals(c.getCount(), 5);
    }

    @Test
    public void connectonRunShouldRunCorrect() {
        Connection connection = mock(Connection.class);
        when(connection.getSocket()).thenReturn(socket);
        when(connection.getClientname()).thenReturn("Alina");
        connection.run();
        Assert.assertTrue(connection.isAlive());
    }

    @Test
    public void printOrderShouldContainNames() {
        Connection connection = mock(Connection.class);
        when(connection.getSocket()).thenReturn(socket);
        when(connection.getClientname()).thenReturn("Alina");
        connection.printOrder();
        Assert.assertEquals(connection.getClientname(), "Alina");
    }
}
