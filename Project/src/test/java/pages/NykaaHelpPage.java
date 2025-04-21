package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaHelpPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NykaaHelpPage {
     public static WebDriverHelper helper;
    public ExtentTest test;
    public NykaaHelpPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void clickOnHelp(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.help, 5);
            helper.doClickandswitch(NykaaHelpPageLocator.help);
            test.log(Status.PASS,"Clicked on Help");
            LoggerHandler.info("Clicked on Help");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Click on Help");
            LoggerHandler.info("Failed to Click on Help");
        }
    }
    
    public void verifyHelpPageTitle(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertTrue(title.contains("Help Center"));
            test.log(Status.PASS,"Verified Help Page Title");
            LoggerHandler.info("Verified Help Page Title");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to verify  Help page title");
            LoggerHandler.info("Failed to verify  Help page title");
        }
    }

    public void clickOnOrderRelated(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderRelated,5);
            helper.doClick(NykaaHelpPageLocator.orderRelated);
            test.log(Status.PASS,"Clicked on Order Related successfully");
            LoggerHandler.info("Clicked on Order Related successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on order related.");
            LoggerHandler.info("Failed to click on order related.");
        }
    }

    public void clickOnOrderStatus(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderStaus,5);
            helper.doClick(NykaaHelpPageLocator.orderStaus);
            test.log(Status.PASS,"Clicked on Order Status");
            LoggerHandler.info("Clicked on Order Status");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on order status");
            LoggerHandler.info("Failed to click on order status");
        }
    }
    public void navigateBackToOrderRelated(){
        try {
            Base.driver.navigate().back();
            test.log(Status.PASS,"Navigated successfully");
            LoggerHandler.info("Navigated successfully");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to navigate back");
            LoggerHandler.info("Failed to navigate back");
        }
    }
    public void clickOnRefund(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.returnRefunds,5);
            helper.doClick(NykaaHelpPageLocator.returnRefunds);
            test.log(Status.PASS,"clicked on Returns and Refund");
            LoggerHandler.info("clicked on Returns and Refund");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on Return and Refund");
            LoggerHandler.info("Failed to click on Return and Refund");
        }
    }

    public void VerifyCanIReturn(){
        try {
            helper.doGetText(NykaaHelpPageLocator.canIReturn);
            test.log(Status.PASS,"Verified the text Can I return a part of my order");
            LoggerHandler.info("Verified the text Can I return a part of my order");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Verify the text Can I return a part of my order");
            LoggerHandler.info("Failed to Verify the text Can I return a part of my order");
        }
    }
    public void clickOnCanceellationAndRefunds(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancellation,5);
            helper.doClick(NykaaHelpPageLocator.cancellation);
        } catch (Exception e) {
        }
    }

    public void clickOnCancelPolicy(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelPolicy,5);
            helper.doClick(NykaaHelpPageLocator.cancelPolicy);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void verifyCancelPolicy(){
        try {
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void clickOncancellationLink(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelLink,5);
            helper.doClickandswitch(NykaaHelpPageLocator.cancelLink);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void testHelpPage(){
        try {
            clickOnHelp();
            // verifyHelpPageTitle();
            clickOnOrderRelated();
            Thread.sleep(2000);
            clickOnOrderStatus();
            Thread.sleep(2000);
            navigateBackToOrderRelated();
            Thread.sleep(2000);
            clickOnRefund();
            Thread.sleep(2000);
            navigateBackToOrderRelated();
            Thread.sleep(2000);
            clickOnCanceellationAndRefunds();
            Thread.sleep(2000);
            clickOnCancelPolicy();
            Thread.sleep(2000);
            clickOncancellationLink();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }
}
