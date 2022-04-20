package me.rockintuna.loadexcelusetest;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoadExcel {

    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("/Users/ijeong-in/Downloads/test.xlsx");
        Workbook workbook = WorkbookFactory.create(stream);
        Sheet sheet = workbook.getSheetAt(1);
        Iterator<Row> iterator = sheet.iterator();

        List<String> list = new ArrayList<>();

        while(iterator.hasNext()) {
            Row row = iterator.next();
            Cell cell = row.getCell(6);
            if ( cell == null || cell.getStringCellValue().equals("") ) {
                break;
            } else {
                list.add(cell.getStringCellValue());
            }
        }

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
