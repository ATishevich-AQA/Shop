package com.company.util;

import com.company.entity.Brand;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class BrandUtil {
    public static Brand toObject(String line) {
        String[] brandFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(brandFields[0]);
        String brandName = brandFields[1];
        String madeInCountry = brandFields[2];
        return new Brand(id, brandName, madeInCountry);
    }
}
