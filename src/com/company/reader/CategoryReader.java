package com.company.reader;

import com.company.entity.Category;
import com.company.util.CategoryUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CategoryReader {
    private String filepath;

    public CategoryReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Category> readCategory() {
        List<Category> categories = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                Category category = CategoryUtil.toObject(line);
                categories.add(category);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return categories;
    }
}