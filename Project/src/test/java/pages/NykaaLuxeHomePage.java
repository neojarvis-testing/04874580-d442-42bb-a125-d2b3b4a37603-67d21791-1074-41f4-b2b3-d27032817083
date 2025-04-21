package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaLuxeHomeLocators;
import utils.Base;
import utils.WebDriverHelper;

public class NykaaLuxeHomePage {
   public static ExtentTest test;
   public static WebDriverHelper helper;
   public NykaaLuxeHomePage(ExtentTest test){
    helper=new WebDriverHelper(Base.driver);
    this.test=test;
   } 
   public void scrollToFotter(){
    helper.doJsScrollFooter();
   }
   public void clickOnLuxe(){
    try{
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Luxe, 10);
        helper.doClickandswitch(NykaaLuxeHomeLocators.Luxe);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void verifyLuxe(){
    try {
        String luxe=helper.doGetText(NykaaLuxeHomeLocators.NykaaLuxe);
        Assert.assertTrue(luxe.contains("Luxe"));
    } catch (AssertionError e) {
       e.printStackTrace();
    }
   }
   public void clickOnSortByPopularity(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.popularity, 10);
        helper.doClick(NykaaLuxeHomeLocators.popularity);
    } catch (Exception e) {
        e.printStackTrace();
    } 
   }
   public void clickOnCustomerToprated(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.CustomerRated, 10);
        helper.doClick(NykaaLuxeHomeLocators.CustomerRated); 
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void clickOnGender(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Gender, 10);
        helper.doClick(NykaaLuxeHomeLocators.Gender);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   

}
