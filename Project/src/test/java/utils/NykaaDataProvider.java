package utils;

import org.testng.annotations.DataProvider;

public class NykaaDataProvider {
    @DataProvider(name="NykaaData")
    public static Object[][] excelData(){
        String path="/testdata/ExcelData.xlsx";
        String sheet="Sheet1";
        return ExcelReader.readExcelData(path,sheet);
    }
}
