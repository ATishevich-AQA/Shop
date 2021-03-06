package com.company.db;

import com.company.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryConnector {
    private static final String ADD = "INSERT INTO category (id, category) VALUES(?,?)";

    public static void add(Category category) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, category.getId());
            statement.setString(2, category.getCategory());

            statement.executeUpdate();
        }
    }
}