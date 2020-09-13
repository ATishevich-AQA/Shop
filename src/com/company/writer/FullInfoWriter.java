package com.company.writer;

import com.company.dto.FullInfoDto;
import com.company.util.FullInfoUtil;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class FullInfoWriter {

    private String filepath;

    public FullInfoWriter(String filepath) {
        this.filepath = filepath;
    }

    public void writeAll(List<FullInfoDto> dtos) throws IOException {
        try (Writer writer = new FileWriter(filepath)) {

            for (FullInfoDto dto : dtos) {
                writer.write(FullInfoUtil.toCsvString(dto));
            }
        }
    }
}