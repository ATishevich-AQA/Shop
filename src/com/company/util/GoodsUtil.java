package com.company.util;

import com.company.entity.Goods;

import java.text.ParseException;
import java.util.Date;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class GoodsUtil {
    public static Goods toObject(String line) throws ParseException {
        String[] goodsFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(goodsFields[0]);
        String name = goodsFields[1];
        String weight = goodsFields[2];
        int amount = Integer.parseInt(goodsFields[3]);
        boolean refundable = Boolean.parseBoolean(goodsFields[4]);
        String category = goodsFields[5];
        String brand = goodsFields[6];
        String orderDate = goodsFields[7];

        return new Goods(id, name, weight, amount, refundable, category, brand, orderDate);
    }
}
