package com.company.db;

import com.company.entity.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GoodsConnector {

    private static final String ADD = "INSERT INTO goods (id, name, weight, amount, refundable, category,brand," +
            "order_date) VALUES(?,?,?,?,?,?,?,?)";

    public static void add(Goods goods) throws SQLException {
        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, goods.getId());
            statement.setString(2, goods.getName());
            statement.setString(3, goods.getWeight());
            statement.setInt(4, goods.getAmount());
            statement.setBoolean(5, goods.isRefundable());
            statement.setString(6, goods.getCategory());
            statement.setString(7, goods.getBrand());
            statement.setString(8, goods.getOrderDate());

            statement.executeUpdate();
        }
    }
}