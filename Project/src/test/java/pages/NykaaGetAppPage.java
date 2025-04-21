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

    /**
     * A. Method Name: clickOnGetApp
     * B. Author name: Group 07
     * C. Description: Clicks on the "Get App" button and switches to the corresponding tab.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnGetApp()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.getApp, 5);
            helper.doClickandswitch(NykaaGetAppPageLocators.getApp);
            test.log(Status.PASS, "Clicked and Switched to Get App Tab");
            LoggerHandler.info("Clicked and Switched to Get App Tab");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    /**
     * A. Method Name: verifyBeautyToGo
     * B. Author name: Group 07
     * C. Description: Verifies that the main heading contains "BEAUTY TO GO".
     * D. Parameters: None
     * E. Return Type: void
     */
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
    /**
     * A. Method Name: enterMobileNumberData
     * B. Author name: Group 07
     * C. Description: Enters mobile number data into the input field from an Excel file.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void enterMobileNumberData()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doClick(NykaaGetAppPageLocators.mobileInputField);
            helper.doSendKeys(NykaaGetAppPageLocators.mobileInputField, ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/GetAppData.xlsx", "Sheet1", 0, 0));
            helper.doEnterAction(NykaaGetAppPageLocators.mobileInputField);
            test.log(Status.PASS, "Entered mobile number.");
            LoggerHandler.info("Entered mobile number.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    /**
     * A. Method Name: clickOnTermsConditions
     * B. Author name: Group 07
     * C. Description: Clicks on the "Terms & Conditions" link and switches to the corresponding tab.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnTermsConditions()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doJsscrollIntoView(NykaaGetAppPageLocators.termsConditions);
            helper.doClickandswitch(NykaaGetAppPageLocators.termsConditions);
            test.log(Status.PASS, "Clicked and switched tab to Terms and Conditions");
            LoggerHandler.info("Clicked and switched tab to Terms and Conditions");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * A. Method Name: verifyTermsConditions
     * B. Author name: Group 07
     * C. Description: Verifies the heading text of the "Terms & Conditions" page.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyTermsConditions()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.termsConditionsHeading, 5);
            String tCHeading = helper.doGetText(NykaaGetAppPageLocators.termsConditionsHeading);
            Assert.assertEquals(tCHeading, tCHeading);
            test.log(Status.PASS, "Verified 'Terms & Conditions'");
            LoggerHandler.info("Verified 'Terms & Conditions'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * A. Method Name: clickOnShippingPolicy
     * B. Author name: Group 07
     * C. Description: Clicks on the "Shipping Policy" link.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnShippingPolicy()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.shippingPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.shippingPolicy);
            test.log(Status.PASS, "Clicked to Shipping Policy.");
            LoggerHandler.info("Clicked to Shipping Policy.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

     /**
     * A. Method Name: verifyDeliveryProcessQues
     * B. Author name: Group 07
     * C. Description: Verifies the text of the delivery process question.
     * D. Parameters: None
     * E. Return Type: void
     */
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
    /**
     * A. Method Name: clickOnPrivacyPolicy
     * B. Author name: Group 07
     * C. Description: Clicks on the "Privacy Policy" link.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnPrivacyPolicy()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.privacyPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.privacyPolicy);
            test.log(Status.INFO, "Clicked to Privacy Policy.");
            LoggerHandler.info("Clicked to Privacy Policy.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
 * A. Method Name: verifyPrivacyPolicy
 * B. Author name: Group 07
 * C. Description: Verifies that the Privacy Policy heading text contains "Privacy Policy".
 * D. Parameters: None
 * E. Return Type: void
 */
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

    /**
 * A. Method Name: clickOnOfferZone
 * B. Author name: Group 07
 * C. Description: Clicks on the "Offer Zone" link, scrolling down the page multiple times if needed, and switches to the corresponding tab.
 * D. Parameters: None
 * E. Return Type: void
 */
    public void clickOnOfferZone()
    {
        try {
            //helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.offerZone, 5);
            try {
                helper.doScrollBypixel(0, 4000);
                Thread.sleep(5000);
                helper.doScrollBypixel(0, 4000);
                Thread.sleep(5000);
                helper.doScrollBypixel(0, 4000);
                Thread.sleep(5000);
                helper.doScrollBypixel(0, 4000);
                Thread.sleep(5000);
                helper.doClickandswitch(NykaaGetAppPageLocators.offerZone);
                test.log(Status.INFO, "Clicked and switched tab to Offer Zone");
                LoggerHandler.info("Clicked and switched tab to Offer Zone");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
 * A. Method Name: verifyURL
 * B. Author name: Group 07
 * C. Description: Verifies that the current URL matches the expected Offer Zone URL and captures a screenshot.
 * D. Parameters: None
 * E. Return Type: void
 */
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


/**
 * A. Method Name: execute
 * B. Author name: Group 07
 * C. Description: Executes all defined steps in sequence for verifying the Nykaa Get App page functionality.
 * D. Parameters: None
 * E. Return Type: void
 */
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

