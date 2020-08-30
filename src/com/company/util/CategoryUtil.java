package com.company.util;

import com.company.entity.Category;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class CategoryUtil {
    public static Category toObject(String line) {
        String[] categoryfields = line.split(CSV_DELIMITER);

        String category = categoryfields[0];

        return new Category(category);
    }
}
