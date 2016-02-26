package Tests;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.*;

import SemGame.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Alina Tlitova
 *         11-402
 *         005
 */

public class ServerTest {
    @Test
    public void serverShouldAcceptClients() throws IOException {
        ServerSocket s = mock(ServerSocket.class);
        Socket client = mock(Socket.class);
        when(s.getLocalPort()).thenReturn(9900);
        when(s.accept()).thenReturn(client);
        Server server = new Server();
        Assert.assertTrue(client.isConnected());
    }

}
