package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.NykaaHelpPageLocator;
import utils.Base;
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
        } catch (Exception e) {
        }
    }
    
    public void verifyHelpPageTitle(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertTrue(title.contains("Help Center"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnOrderRelated(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderRelated,5);
            helper.doClick(NykaaHelpPageLocator.orderRelated);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnOrderStatus(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderStaus,5);
            helper.doClick(NykaaHelpPageLocator.orderStaus);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void navigateBackToOrderRelated(){
        try {
            Base.driver.navigate().back();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void clickOnRefund(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.returnRefunds,5);
            helper.doClick(NykaaHelpPageLocator.returnRefunds);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void VerifyCanIReturn(){
        try {
            helper.doGetText(NykaaHelpPageLocator.canIReturn);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void clickOnCanceellationAndRefunds(){
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancellation,5);
            helper.doClick(NykaaHelpPageLocator.cancellation);
        } catch (Exception e) {
            // TODO: handle exception
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
        clickOnHelp();
        verifyHelpPageTitle();
        clickOnOrderRelated();
        clickOnOrderStatus();
        navigateBackToOrderRelated();
        clickOnRefund();
        navigateBackToOrderRelated();
        clickOnCanceellationAndRefunds();
        clickOnCancelPolicy();
        clickOncancellationLink();

    }
}
