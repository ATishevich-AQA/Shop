package com.company.util;

import com.company.entity.Category;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class CategoryUtil {
    public static Category toObject(String line) {
        String[] categoryfields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(categoryfields[0]);
        String category = categoryfields[1];

        return new Category(id,category);
    }
}
