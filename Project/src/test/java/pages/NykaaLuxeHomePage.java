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
        test.log(Status.FAIL,"Cannot click on Luxe");
        LoggerHandler.error("Cannot Click on Luxe");
    }
   }
   public void verifyLuxe(){
    try {
        String luxe=helper.doGetText(NykaaLuxeHomeLocators.NykaaLuxe);
        Assert.assertTrue(luxe.contains("Luxe"));
        test.log(Status.PASS,"Verified the text  Luxe");
        LoggerHandler.info("Verified the text  Luxe");
    } catch (AssertionError e) {
        test.log(Status.FAIL,"Cannot Verify the text  Luxe");
        LoggerHandler.error("Cannot Verifiy the text  Luxe");
      
    }
   }
   public void clickOnSortByPopularity(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.popularity, 10);
        helper.doClick(NykaaLuxeHomeLocators.popularity);
        test.log(Status.PASS,"Clicked on popularity");
        LoggerHandler.info("Clicked on popularity");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on popularity");
        LoggerHandler.error("Cannot click on popularity");
    } 
   }
   public void clickOnCustomerToprated(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.CustomerRated, 10);
        helper.doClick(NykaaLuxeHomeLocators.CustomerRated);
        test.log(Status.PASS,"Clicked on Customer Top Rated");
        LoggerHandler.info("Clicked on Customer Top Rated"); 
        Thread.sleep(2000);
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot Click on Customer Top Rated");
        LoggerHandler.error("Cannot Clickon Customer Top Rated"); 
    }
   }
   public void clickOnGender(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Gender, 10);
        helper.doClick(NykaaLuxeHomeLocators.Gender);
        test.log(Status.PASS,"Clicked on Gender");
        LoggerHandler.info("Clicked on Gender"); 
        Thread.sleep(2000);
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Gender");
        LoggerHandler.error("Cannot click on Gender");
        
    }
   }
   public void clickOnUnisex(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Unisex, 10);
        helper.doClick(NykaaLuxeHomeLocators.Unisex);
        test.log(Status.PASS,"Clicked on Unisex");
        LoggerHandler.info("Clicked on Unisex");
        Thread.sleep(2000);
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Unisex");
        LoggerHandler.error("Cannot click on Unisex");
    }
   }
   public void verifyUnisex(){
    try {
        String unisex=helper.doGetText(NykaaLuxeHomeLocators.UnisexText);
        Assert.assertTrue(unisex.contains("Unisex"));
        test.log(Status.PASS,"Verified the text Unisex");
        LoggerHandler.info("Verified the text Unisex");
    } catch (AssertionError e) {
        test.log(Status.FAIL,"Cannot Verify the text Unisex");
        LoggerHandler.error("Cannot Verify the text Unisex");
    }
   }
   public void clickOnOccasion(){
    try {
        helper.doScrollBypixel(0, 300);
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Occasion, 10);
        helper.doClick(NykaaLuxeHomeLocators.Occasion);
        Thread.sleep(2000);
        test.log(Status.PASS,"clicked on Occasion");
        LoggerHandler.info("clicked on Occasion");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Occasion");
        LoggerHandler.error("Cannot click on Occasion");
    }
   }
   public void clickOnDaywear(){
    try {
        
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.DaypuWear, 10);
        helper.doClick(NykaaLuxeHomeLocators.DaypuWear);
        Thread.sleep(2000);
        test.log(Status.PASS,"clicked on Day wear");
        LoggerHandler.info("clicked on Day wear");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Daywear");
        LoggerHandler.error("Cannot click on Daywear");
    }
   }
   public void clickOnFirstProduct(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.FirstProduct, 10);
        helper.doClickandswitch(NykaaLuxeHomeLocators.FirstProduct);
        Base.driver.navigate().refresh();
        test.log(Status.PASS,"clicked on First Product");
        LoggerHandler.info("clicked on First Product");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Daywear");
        LoggerHandler.error("Cannot click on Daywear");
       
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
        test.log(Status.PASS,"clicked on NykaaMan");
        LoggerHandler.info("clicked on NykaaMan");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on NykaaMan");
        LoggerHandler.error("Cannot click on NykaaMan");
    }
   }
   public void clickOnGroomingAdvice(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxeHomeLocators.Gromming, 10);
        helper.doClick(NykaaLuxeHomeLocators.Gromming);
        test.log(Status.PASS,"clicked on Gromming Advice");
        LoggerHandler.info("clicked on Gromming Advice");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Gromming advice");
        LoggerHandler.error("Cannot click on Gromming advice");
    }
   }
   public void verifyShaving(){
    try {
        String Shaving=helper.doGetText(NykaaLuxeHomeLocators.Shaving);
        Assert.assertTrue(Shaving.contains("SHAVING & BEARD CARE"));
        test.log(Status.PASS,"Verified the text Shaving");
        LoggerHandler.info("Verified the text Shaving");
    } catch (AssertionError e) {
        test.log(Status.PASS,"Cannot Verified the text Shaving");
        LoggerHandler.info("Cannot Verified the text Shaving");
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
