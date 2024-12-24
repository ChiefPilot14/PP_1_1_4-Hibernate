package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/kata_hibernate";
    private static final String USER = "katauser";
    private static final String PWD = "kata#strong5pwd";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
