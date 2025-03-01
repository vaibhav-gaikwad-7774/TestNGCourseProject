package com.example.tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataProviderTest {

    @Test(dataProvider = "excelData")
    public void testLogin(String userName, String password) {
        System.out.println("==========START===============");
        System.out.println("Username is: " + userName);
        System.out.println("Password is: " + password);
        System.out.println("===========END==============");
    }

    @DataProvider(name = "excelData")
    public Object[][] getData() throws IOException {
        String filePath = "C:\\Users\\GFG0329\\eclipse-workspace\\TestNGCourseProject\\src\\TestData.xlsx"; // Path to your Excel file
        String sheetName = "LoginData"; // Sheet name

        return readExcelData(filePath, sheetName);
    }

    public Object[][] readExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) { // Start from row 1 to skip headers
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString(); // Convert cell value to String
            }
        }

        workbook.close();
        fileInputStream.close();

        return data;
    }
}
