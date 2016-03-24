package ru.kpfu.itis.alina.task012;

import java.sql.*;
import static org.mockito.Mockito.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         012
 */

public class FunnyDB {
    public static Connection getConn() throws SQLException {
        Connection conn = mock(Connection.class);
        PreparedStatement ps = mock(PreparedStatement.class);
        when(conn.prepareStatement("insert into users(id, login) values (?, ?)")).thenReturn(ps);
        return conn;
    }
}
