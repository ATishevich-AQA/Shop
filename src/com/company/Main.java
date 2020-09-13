package com.company;

import com.company.db.BrandConnector;
import com.company.db.CategoryConnector;
import com.company.db.FullInfoConnector;
import com.company.db.GoodsConnector;
import com.company.dto.FullInfoDto;
import com.company.entity.Brand;
import com.company.entity.Category;
import com.company.entity.Goods;
import com.company.reader.BrandReader;
import com.company.reader.CategoryReader;
import com.company.reader.GoodsReader;
import com.company.reader.ReaderConstants;
import com.company.writer.FullInfoWriter;

import static com.company.reader.ReaderConstants.FULL_INFO_EXPORT_FILE;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {

        BrandReader brandReader = new BrandReader(ReaderConstants.BRAND_IMPORT_FILE);
        List<Brand> brands = brandReader.readBrands();

        System.out.println(brands);

        for (Brand brand : brands) {
            try {
                BrandConnector.add(brand);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        CategoryReader categoryReader = new CategoryReader(ReaderConstants.CATEGORY_IMPORT_FILE);
        List<Category> categories = categoryReader.readCategory();

        System.out.println(categoryReader.readCategory());

        for (Category category : categories) {
            try {
                CategoryConnector.add(category);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        GoodsReader goodsReader = new GoodsReader(ReaderConstants.GOODS_IMPORT_FILE);
        List<Goods> good = goodsReader.readGoods();

        System.out.println(good);

        for (Goods goods : good) {
            try {
                GoodsConnector.add(goods);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        List<FullInfoDto> dtos = FullInfoConnector.getAll();

        System.out.println(dtos);

        FullInfoWriter writer = new FullInfoWriter(FULL_INFO_EXPORT_FILE);
        writer.writeAll(dtos);
        GoodsReader goodsReaders = new GoodsReader(ReaderConstants.GOODS_IMPORT_FILE);
        System.out.println(goodsReaders.readGoods());
    }
}