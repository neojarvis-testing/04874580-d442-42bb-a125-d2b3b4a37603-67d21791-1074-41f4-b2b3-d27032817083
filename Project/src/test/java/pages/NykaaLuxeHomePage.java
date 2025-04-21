package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaLuxeHomeLocators;
import utils.Base;
import utils.LoggerHandler;
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
        test.log(Status.PASS,"Clicked on Luxe");
        LoggerHandler.info("Clicked on Luxe");
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
   public void clickOnUnisex(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Unisex, 10);
        helper.doClick(NykaaLuxeHomeLocators.Unisex);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void verifyUnisex(){
    try {
        String unisex=helper.doGetText(NykaaLuxeHomeLocators.UnisexText);
        Assert.assertTrue(unisex.contains("Unisex"));
    } catch (AssertionError e) {
       e.printStackTrace();
    }
   }
   public void clickOnOccasion(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Occasion, 10);
        helper.doClick(NykaaLuxeHomeLocators.Occasion);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void clickOnDaywear(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.DaypuWear, 10);
        helper.doClick(NykaaLuxeHomeLocators.DaypuWear);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void clickOnFirstProduct(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.FirstProduct, 10);
        helper.doClickandswitch(NykaaLuxeHomeLocators.FirstProduct);
        Base.driver.navigate().refresh();
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void scrollToFotterAgain(){
    helper.doJsScrollFooter();
   }
   public void clickOnNykaaMan(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Nykaaman, 10);
        helper.doClickandswitch(NykaaLuxeHomeLocators.Nykaaman);
        Base.driver.navigate().refresh();
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void clickOnGroomingAdvice(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Gromming, 10);
        helper.doClick(NykaaLuxeHomeLocators.Gromming);
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   public void verifyShaving(){
    try {
        String Shaving=helper.doGetText(NykaaLuxeHomeLocators.UnisexText);
        Assert.assertTrue(Shaving.contains("SHAVING & BEARD CARE"));
    } catch (AssertionError e) {
       e.printStackTrace();
    }
   }

   public void nykaaLuxeCase(){
      scrollToFotter();
      clickOnLuxe();
      verifyLuxe();
      clickOnSortByPopularity();
      clickOnCustomerToprated();
      clickOnGender();
      clickOnUnisex();
      verifyUnisex();
      clickOnOccasion();
      clickOnDaywear();
      scrollToFotterAgain();
      clickOnNykaaMan();
      clickOnGroomingAdvice();
      verifyShaving();
   }
}
