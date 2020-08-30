package com.company.db;

import com.company.entity.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GoodsConnector {

    private static final String ADD = "INSERT INTO goods (name, weight, amount, refundable, category,brand,orderDate) VALUES(?,?,?,?,?,?,?)";

    public static void add(Goods goods) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {

            statement.setString(1, goods.getName());
            statement.setString(2, goods.getWeight());
            statement.setInt(3, goods.getAmount());
            statement.setBoolean(4, goods.isRefundable());
            statement.setString(5, goods.getCategory());
            statement.setString(6, goods.getBrand());
            statement.setString(7, goods.getOrderDate());

            statement.executeUpdate();
        }
    }
}
