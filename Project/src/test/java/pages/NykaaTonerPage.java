package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.TonerPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaTonerPage {
    public static WebDriverHelper helper;
    public ExtentTest test;
    public NykaaTonerPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void sendTonerInSearchBar(){
        try {
            helper.doSendKeys(TonerPageLocator.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/TonerExcel.xlsx", "Likitha", 0, 0));
            test.log(Status.PASS,"Toner Entered in serach Bar.");
            LoggerHandler.info("Toner Entered in search Bar");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to enter Toner in serach Bar");
            LoggerHandler.info("Failed to enter Toner in search bar");
        }
    }
    
    public void performEnter(){
        try {
            helper.doEnterAction(TonerPageLocator.searchBar);
            test.log(Status.PASS,"Performed enter action succesfully");
            LoggerHandler.info("Performed enter action succesfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to perform enter action");
            LoggerHandler.info("Failed to perform enter action");
        } 
    }

    public void verifyToner(){
        try {
            String toner=helper.doGetText(TonerPageLocator.toner);
            Assert.assertTrue(toner.contains("Toner"));
            System.out.println(toner);
            test.log(Status.PASS,"Verified toner text succesfully");
            LoggerHandler.info("Verified toner text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to verify toner text");
            LoggerHandler.info("Failed to verify toner text");
        }
    }
    public void clickOnSortBy(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.sortBy,3);
            helper.doClick(TonerPageLocator.sortBy);
            test.log(Status.PASS,"Clicked on sortby succesfully");
            LoggerHandler.info("Clicked on sortby sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on sortby");
            LoggerHandler.info("Failed to click on sortby");
        }
    }

    public void selectNewArrivals(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.newArrivals,3);
            helper.doClick(TonerPageLocator.newArrivals);
            test.log(Status.PASS,"Selected new Arrivals succesfully");
            LoggerHandler.info("Selected new Arrivals successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to select new Arrivals");
            LoggerHandler.info("Failed to select new Arrivals");
        }
    }

    public void clickOnAvgCustomer(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.avgRate,3);
            helper.doScrollBypixel(0, 500);
            helper.doClick(TonerPageLocator.avgRate);
            test.log(Status.PASS,"Clicked on Avg Customer Rating succesfully");
            LoggerHandler.info("Clicked on Avg Customer Rating sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on Avg Customer Rating");
            LoggerHandler.info("Failed to click on Avg Customer Rating");
        }
    }

    public void selectRating(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.rate,3);
            helper.doClick(TonerPageLocator.rate);
            test.log(Status.PASS,"Selected rating succesfully");
            LoggerHandler.info("Selected rating successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to select Rating");
            LoggerHandler.info("Failed to select Rating");
        }
    }
    public void clickOnFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.firstProduct,10);
            helper.doClickandswitch(TonerPageLocator.firstProduct);
            test.log(Status.PASS,"Clicked on First product succesfully");
            LoggerHandler.info("Clicked on First Product sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on First product");
            LoggerHandler.info("Failed to click on First product");
        }
    }

    public void verifyInclusiveText(){
        try {
            String inclusiveTax=helper.doGetText(TonerPageLocator.inclusiveTax);
            Assert.assertTrue(inclusiveTax.contains("inclusive of all taxes"));
            System.out.println(inclusiveTax);
            test.log(Status.PASS,"Verified inclusive of all taxes text succesfully");
            LoggerHandler.info("Verified inclusive of all taxes text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to verify inclusive of all taxes text");
            LoggerHandler.info("Failed to verify inclusive of all taxes text");
        }
    }

    public void clickOnAddToBag(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.addToBag,10);
            helper.doClick(TonerPageLocator.addToBag);
            test.log(Status.PASS,"Clicked on add to bag successfully");
            LoggerHandler.info("Clicked on add to bag successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on add to bag");
            LoggerHandler.info("Failed to click on add to bag");
        }
    }

    public void verifyDescriptionText(){
        try {
            String description=helper.doGetText(TonerPageLocator.desc);
            Assert.assertTrue(description.contains("Description"));
            System.out.println(description);
            test.log(Status.PASS,"Verified Description text succesfully");
            LoggerHandler.info("Verified Description text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to verify Description text");
            LoggerHandler.info("Failed to verify Description text");
        }
    }

    public void clickOnIngredients(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.ingredients,10);
            helper.doClick(TonerPageLocator.ingredients);
            test.log(Status.PASS,"Clicked on ingredients successfully");
            LoggerHandler.info("Clicked on ingredients successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to ingredients to bag");
            LoggerHandler.info("Failed to ingredients to bag");
        }
    }

    public void clickOnReadMore(){
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.readMore,10);
            helper.doClick(TonerPageLocator.readMore);
            test.log(Status.PASS,"Clicked on ingredients successfully");
            LoggerHandler.info("Clicked on ingredients successfully");
            Screenshot.captureFullScreenshot("Read More Ingredients");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to ingredients to bag");
            LoggerHandler.info("Failed to ingredients to bag");
        }
    }

    public void testTonerPage(){
        sendTonerInSearchBar();
        performEnter();
        verifyToner();
        clickOnSortBy();
        selectNewArrivals();
        clickOnAvgCustomer();
        selectRating();
        clickOnFirstProduct();
        // verifyInclusiveText();
        clickOnAddToBag();
        verifyDescriptionText();
        clickOnIngredients();
        clickOnReadMore();
    }

}
