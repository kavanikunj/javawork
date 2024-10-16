package utill;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
  
	String filename;
    String sheetName; 

    public ExcellReader(String filename, String sheetName) {
		super();
		this.filename = filename;
		this.sheetName = sheetName;
	}

	public int rowcount() {   
        int row = 0;
        try {
           
            XSSFWorkbook workbook = new XSSFWorkbook(filename);
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
         
            XSSFWorkbook workbook = new XSSFWorkbook(filename);
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
          
            XSSFWorkbook workbook = new XSSFWorkbook(filename);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            data = sheet.getRow(row).getCell(col).getStringCellValue();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
	}
	
	
}
