package com.company.util;

import com.company.dto.FullInfoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class FullInfoUtil {

    public static FullInfoDto toDto(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String weight = resultSet.getString("weight");
        int amount = resultSet.getInt("amount");
        boolean refundable = resultSet.getBoolean("refundable");
        String category = resultSet.getString("category");
        String brand = resultSet.getString("brand");
        String madeInCountry = resultSet.getString("made_in_country");
        String orderDate = resultSet.getString("order_date");

        return new FullInfoDto(id, name, weight, amount, refundable, category, brand, madeInCountry, orderDate);
    }

    public static String toCsvString(FullInfoDto dto) {
        return dto.getId() + CSV_DELIMITER +
                dto.getName() + CSV_DELIMITER +
                dto.getWeight() + CSV_DELIMITER +
                dto.getAmount() + CSV_DELIMITER +
                dto.isRefundable() + CSV_DELIMITER +
                dto.getCategory() + CSV_DELIMITER +
                dto.getBrand() + CSV_DELIMITER +
                dto.getMadeInCountry() + CSV_DELIMITER +
                dto.getOrderDate() + "\n";
    }
}