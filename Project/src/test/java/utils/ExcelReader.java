package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static FileInputStream file;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;

    /*
     * A. Method Name: readdata
     * B. Author Name: Tanu Shree Das
     * C. Description: This method is used for reading data from Excel files and return data from a specific cell in the spreadsheet.
     * D. Parameters: path(String), sheetname(String), rowNumber(int), colNumber(int)
     * E. Return Type: String  
     */
    public static String readdata(String path, String sheetname, int rowNumber, int colNumber)
    {
        try {
            file = new FileInputStream(path);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetname);
            row = sheet.getRow(rowNumber);
            cell = row.getCell(colNumber);
            String value = cell.toString();
            return value;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
