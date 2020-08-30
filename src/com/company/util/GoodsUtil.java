package com.company.util;

import com.company.entity.Goods;

import java.text.ParseException;
import java.util.Date;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class GoodsUtil {
    public static Goods toObject(String line) throws ParseException {
        String[] goodsFields = line.split(CSV_DELIMITER);

        String name = goodsFields[0];
        String weight = goodsFields[1];
        int amount = Integer.parseInt(goodsFields[2]);
        boolean refundable = Boolean.parseBoolean(goodsFields[3]);
        String category = goodsFields[4];
        String brand = goodsFields[5];
        String orderDate = goodsFields[6];

        return new Goods(name, weight, amount, refundable, category, brand, orderDate);
    }
}
