package ru.kpfu.itis.alina.task012;

import java.io.IOException;
import java.sql.*;

import static org.mockito.Mockito.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         012
 */

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Connection conn = FunnyDB.getConn();
        PreparedStatement ps = conn.prepareStatement("insert into users(id, login) values (?, ?)");
        String userId = "1";
        String userLogin = "Alina";
        ps.setString(1, userId);
        ps.setString(2, userLogin);
        ps.execute();
        ps.close();
        System.out.println("User " + userId + " with login '" + userLogin + "' was inserted!");
    }
}
