package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaHelpPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Report;
import utils.Screenshot;
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
    public void verifyOrderRelatedText(){
        try {
            String orderrelated=helper.doGetText(NykaaHelpPageLocator.orderRelatedText);
            Assert.assertTrue(orderrelated.contains("Order Related"));
            test.log(Status.PASS,"Verified the text Order Related");
            LoggerHandler.info("Verified the text Order Related");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Verify the text Order Related");
            LoggerHandler.info("Failed to Verify the text Order Related");
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
    public void verifyOrderStatustext(){
        try {
            String orderStatus=helper.doGetText(NykaaHelpPageLocator.orderStatusText);
            Assert.assertTrue(orderStatus.contains("Order Status"));
            test.log(Status.PASS,"Verified the text Order status");
            LoggerHandler.info("Verified the text Order status");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Verify the text Order status");
            LoggerHandler.info("Failed to Verify the text Order status");
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

    public void verifyCanIReturn(){
        try {
            String canIReturn=helper.doGetText(NykaaHelpPageLocator.canIReturn);
            Assert.assertTrue(canIReturn.contains("Can I return part of my order?"));
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
            test.log(Status.PASS,"Clicked on Cancellation and Refunds");
            LoggerHandler.info("Clicked on Cancellation and Refunds");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on canceelation and refunds.");
            LoggerHandler.info("Failed to click on canceelation and refunds.");
        }
    }

    public void clickOnCancelPolicy(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelPolicy,5);
            helper.doClick(NykaaHelpPageLocator.cancelPolicy);
            test.log(Status.PASS,"Clicked on Cancellation policy");
            LoggerHandler.info("Clicked on Cancellation policy");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on canceelation policy.");
            LoggerHandler.info("Failed to click on canceelation policy.");
        }
    }

    public void verifyCancelPolicy(){
        try {
            String cancellationPolicy=helper.doGetText(NykaaHelpPageLocator.cancelPolicyText);
            Assert.assertTrue(cancellationPolicy.contains("Cancellation Policy"));
            test.log(Status.PASS,"Verified the text Cancellation Policy");
            LoggerHandler.info("Verified the text Cancellation Policy");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Verify the text Cancellation Policy");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy");
        }
    }
    public void clickOncancellationLink(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelLink,5);
            helper.doClickandswitch(NykaaHelpPageLocator.cancelLink);
            test.log(Status.PASS,"Clicked on Cancellation link");
            LoggerHandler.info("Clicked on Cancellation link");
            Screenshot.captureFullScreenshot("Cancellation_Policy");
            Report.addScreenshotToReport(test, Base.driver, "CancellationPolicy","cancel");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on canceelation link.");
            LoggerHandler.info("Failed to click on canceelation link.");
        }
    }
    public void verifyCancelPolicyLink(){
        try {
            String link=helper.doGetText(NykaaHelpPageLocator.cancelLink);
            Assert.assertEquals(link, "//www.nykaa.com/cancellation-policy/lp");
            test.log(Status.PASS,"Verified the text Cancellation Policy");
            LoggerHandler.info("Verified the text Cancellation Policy");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to Verify the text Cancellation Policy");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy");
        }
    }

    public void testHelpPage(){
        try {
            clickOnHelp();
            // verifyHelpPageTitle();
            Thread.sleep(2000);
            clickOnOrderRelated();
            Thread.sleep(2000);
            verifyOrderRelatedText();
            clickOnOrderStatus();
            Thread.sleep(2000);
            verifyOrderStatustext();
            navigateBackToOrderRelated();
            Thread.sleep(2000);
            clickOnRefund();
            Thread.sleep(2000);
            verifyCanIReturn();
            navigateBackToOrderRelated();
            Thread.sleep(2000);
            clickOnCanceellationAndRefunds();
            Thread.sleep(2000);
            clickOnCancelPolicy();
            Thread.sleep(2000);
            verifyCancelPolicy();
            Thread.sleep(2000);
            clickOncancellationLink();
            Thread.sleep(2000);
            verifyCancelPolicyLink();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       

    }
}
