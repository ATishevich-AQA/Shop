package com.company.db;

import com.company.dto.FullInfoDto;
import com.company.util.FullInfoUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoConnector {
    private static final String SELECT_ALL = "SELECT goods.id,goods.name,goods.weight, goods.amount, " +
            "goods.refundable, goods.category, goods.brand, brand.made_in_country, goods.order_date " +
            "FROM shop.goods LEFT JOIN shop.brand ON shop.goods.id = shop.brand.id;";

    public static List<FullInfoDto> getAll() throws SQLException {
        List<FullInfoDto> result = new ArrayList<>();

        Connection connection = CommonDbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery()
        ) {

            while (resultSet.next()) {
                FullInfoDto dto = FullInfoUtil.toDto(resultSet);
                result.add(dto);
            }
        }

        return result;
    }
}