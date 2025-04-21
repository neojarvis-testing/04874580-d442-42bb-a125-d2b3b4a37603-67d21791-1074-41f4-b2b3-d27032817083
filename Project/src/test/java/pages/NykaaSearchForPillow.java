package pages;

import org.openqa.selenium.WebDriver;

import uistore.NykaaSearchForPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class NykaaSearchForPillow {
    public static WebDriverHelper helper;
    public NykaaSearchForPillow(){
        helper = new WebDriverHelper(Base.driver);
    }

    public void clickSearchBar(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doClick(NykaaSearchForPillowLocators.searchBar);
        } catch (Exception e) {
            System.out.println("not clicked");
        }
    }
    public void inputPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaSearchForPillowLocators.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/ExcelData.xlsx", "Rahul", 0, 0));
        } catch (Exception e) {
            System.out.println("Value not entered");
        }
    }

    public void performEnterAction(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaSearchForPillowLocators.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/ExcelData.xlsx", "Rahul", 0, 0));
        } catch (Exception e) {
            System.out.println("Value not entered");
        }
    }


}
