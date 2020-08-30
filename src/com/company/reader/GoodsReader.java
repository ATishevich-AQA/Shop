package com.company.reader;

import com.company.entity.Goods;
import com.company.util.GoodsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GoodsReader {
    private String filepath;

    public GoodsReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Goods> readGoods() {
        List<Goods> goods = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                Goods good1 = GoodsUtil.toObject(line);
                goods.add(good1);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return goods;
    }
}
