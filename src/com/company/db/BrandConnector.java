package com.company.db;

import com.company.entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrandConnector {

    private static final String ADD = "INSERT INTO brand (brandName, madeInCountry) VALUES(?, ?)";

    public static void add(Brand brand) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {

            statement.setString(1, brand.getBrand());
            statement.setString(2, brand.getMadeInCountry());

            statement.executeUpdate();
        }
    }
}
