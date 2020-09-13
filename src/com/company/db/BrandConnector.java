package com.company.db;

import com.company.entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrandConnector {

    private static final String ADD = "INSERT INTO brand (id,brand_name, made_in_country) VALUES(?,?,?)";

    public static void add(Brand brand) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();
        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, brand.getId());
            statement.setString(2, brand.getBrand());
            statement.setString(3, brand.getMadeInCountry());

            statement.executeUpdate();
        }
    }
}
