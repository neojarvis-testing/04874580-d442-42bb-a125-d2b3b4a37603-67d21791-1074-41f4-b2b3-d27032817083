package pages;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.WebDriverHelper;

public class NykaaNewLaunches {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public NykaaNewLaunches(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void scrollDownToFooter(){
        try {
            helper.doScrollBypixel(0, 5000);
        } catch (Exception e) {
           
        } 
    }

    public void clickNewlaunches(){
        try {
            helper.doScrollBypixel(0, 5000);
        } catch (Exception e) {
           
        } 
    }
}
