package com.company.util;

import com.company.entity.Brand;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class BrandUtil {
    public static Brand toObject(String line) {
        String[] brandFields = line.split(CSV_DELIMITER);

        String brandName = brandFields[0];
        String madeInCountry = brandFields[1];

        return new Brand(brandName, madeInCountry);
    }
}
