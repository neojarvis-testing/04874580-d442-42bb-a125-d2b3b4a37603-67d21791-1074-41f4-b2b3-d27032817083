package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    public static int rows;
    public static int cols;

    /*
     * A. Method Name: readdata
     * B. Author Name: Group 07
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
             String value=cell.toString();
            //  workbook.close();
            //  file.close();
             return value;
        } catch (FileNotFoundException e) {
 
            e.printStackTrace();
        } catch (IOException e) {
 
            e.printStackTrace();
        }
        return null;
    }

    /*
     * A. Method Name: readExcelData
     * B. Author Name: Group 07
     * C. Description: This method is used for reading data from Excel files using Object 2D Data Array and return data from a specific cell in the spreadsheet.
     * D. Parameters: path(String), sheetname(String)
     * E. Return Type: Object Array 
     */
    public static Object[][] readExcelData(String path, String name){
        try {
            file = new FileInputStream(path);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(name);
            rows = sheet.getPhysicalNumberOfRows();
            cols = sheet.getRow(0).getPhysicalNumberOfCells();
       
            Object[][] data=new Object[rows][cols];
            for(int i=0;i<rows;i++){
                row=sheet.getRow(i);
                for(int j=0;j<cols;j++){
                    cell=row.getCell(j);
                    data[i][j]=cell.toString();  
                }
            }
            return data;
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    } 
}
