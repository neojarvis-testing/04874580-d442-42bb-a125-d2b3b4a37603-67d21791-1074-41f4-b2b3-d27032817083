package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;

import uistore.NykaaGetAppPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaGetAppPage {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public NykaaGetAppPage(ExtentTest test)
    {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnGetApp()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.getApp, 5);
            helper.doClickandswitch(NykaaGetAppPageLocators.getApp);
            test.log(Status.INFO, "Clicked and Switched to Get App Tab");
            LoggerHandler.info("Clicked and Switched to Get App Tab");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void verifyBeautyToGo()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mainHeading, 10);
            String mainHeading = helper.doGetText(NykaaGetAppPageLocators.mainHeading);
            Assert.assertTrue(mainHeading.contains("BEAUTY TO GO"));
            test.log(Status.PASS, "Verified 'Beauty to go'");
            LoggerHandler.info("Verified 'Beauty to go'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void enterMobileNumberData()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doClick(NykaaGetAppPageLocators.mobileInputField);
            helper.doSendKeys(NykaaGetAppPageLocators.mobileInputField, ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/ExcelData.xlsx", "Tanu Shree", 0, 0));
            helper.doEnterAction(NykaaGetAppPageLocators.mobileInputField);
            test.log(Status.INFO, "Entered mobile number.");
            LoggerHandler.info("Entered mobile number.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void clickOnTermsConditions()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doJsscrollIntoView(NykaaGetAppPageLocators.termsConditions);
            helper.doClickandswitch(NykaaGetAppPageLocators.termsConditions);
            test.log(Status.INFO, "Clicked and switched tab to Terms and Conditions");
            LoggerHandler.info("Clicked and switched tab to Terms and Conditions");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyTermsConditions()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.termsConditionsHeading, 5);
            String tCHeading = helper.doGetText(NykaaGetAppPageLocators.termsConditionsHeading);
            Assert.assertTrue(tCHeading.contains("Terms & Conditions"));
            test.log(Status.PASS, "Verified 'Terms & Conditions'");
            LoggerHandler.info("Verified 'Terms & Conditions'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void clickOnShippingPolicy()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.shippingPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.shippingPolicy);
            test.log(Status.INFO, "Clicked to Shipping Policy.");
            LoggerHandler.info("Clicked to Shipping Policy.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyDeliveryProcessQues()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.deliveryProcessQues, 5);
            String deliveryQues = helper.doGetText(NykaaGetAppPageLocators.deliveryProcessQues);
            Assert.assertTrue(deliveryQues.contains("How does the delivery process work?"));
            test.log(Status.PASS, "Verified 'How does the delivery process work?'");
            LoggerHandler.info("Verified 'How does the delivery process work?'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void clickOnPrivacyPolicy()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.privacyPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.privacyPolicy);
            test.log(Status.INFO, "Clicked to Privacy Policy.");
            LoggerHandler.info("Clicked to Privacy Policy.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyPrivacyPolicy()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.privacyPolicyHeading, 5);
            String deliveryQues = helper.doGetText(NykaaGetAppPageLocators.privacyPolicyHeading);
            Assert.assertTrue(deliveryQues.contains("Privacy Policy"));
            test.log(Status.PASS, "Verified 'Privacy Policy'");
            LoggerHandler.info("Verified 'Privacy Policy'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void clickOnOfferZone()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.offerZone, 5);
            helper.doJsscrollIntoView(NykaaGetAppPageLocators.offerZone);
            helper.doClickandswitch(NykaaGetAppPageLocators.offerZone);
            test.log(Status.INFO, "Clicked and switched tab to Offer Zone");
            LoggerHandler.info("Clicked and switched tab to Offer Zone");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyURL()
    {
        try {
            String currentURL = Base.driver.getCurrentUrl();
            Assert.assertEquals(currentURL, "https://www.nykaa.com/sp/offers-native/offers?utm_source=Desktop_web_footer");
            test.log(Status.PASS, "Verified 'current URL'");
            LoggerHandler.info("Verified 'current URL'");
            Screenshot.captureFullScreenshot("offerZone");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }



    public void execute()
    {
        clickOnGetApp();
        verifyBeautyToGo();
        enterMobileNumberData();
        clickOnTermsConditions();
        verifyTermsConditions();
        clickOnShippingPolicy();
        verifyDeliveryProcessQues();
        clickOnPrivacyPolicy();
        verifyPrivacyPolicy();
        clickOnOfferZone();
        verifyURL();
    }
}

