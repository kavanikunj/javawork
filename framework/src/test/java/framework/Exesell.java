package framework;

import java.io.FileInputStream;
import java.io.IOException;

public class Exesell {
    
	String filepath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Selenium\\Framework.xlsx";
    String sheetName = "login";

    public static void main(String[] args) {
        ExcellReader rd = new ExcellReader();
        int rows = rd.rowcount();
        System.out.println("Rows: " + rows);
        int cols = rd.colcount();
        System.out.println("Cols: " + cols);

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String data = rd.getData(i, j);
                System.out.println(data);
            }
        }
    }

    public int rowcount() {   
        int row = 0;
        try {
            FileInputStream fis = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            row = sheet.getPhysicalNumberOfRows();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return row;
    }

    public int colcount() {
        int col = 0;
        try {
            FileInputStream fis = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            col = sheet.getRow(0).getPhysicalNumberOfCells();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return col;
    }

    public String getData(int row, int col) {
        String data = null;
        try {
            FileInputStream fis = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            data = sheet.getRow(row).getCell(col).getStringCellValue();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

