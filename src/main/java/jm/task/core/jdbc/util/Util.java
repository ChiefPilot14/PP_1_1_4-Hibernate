package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    static final String DB_URL = "jdbc:mysql://localhost:3306/kata_hibernate";
    static final String USER = "katauser";
    static final String PWD = "kata#strong5pwd";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PWD);
    }
}
