package me.rockintuna.loadexcelusetest;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Iterator;

@SpringBootApplication
public class LoadExcelUseTestApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(LoadExcelUseTestApplication.class, args);
    }

}
