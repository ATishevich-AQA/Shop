package com.company.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDbConnector {
    private static Connection connection;

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/shop?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Qwertyu01!";

    static {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}