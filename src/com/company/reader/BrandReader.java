package com.company.reader;

import com.company.entity.Brand;
import com.company.util.BrandUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BrandReader {
    private String filepath;

    public BrandReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Brand> readBrands() {
        List<Brand> brands = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                Brand brand = BrandUtil.toObject(line);

                brands.add(brand);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return brands;
    }
}