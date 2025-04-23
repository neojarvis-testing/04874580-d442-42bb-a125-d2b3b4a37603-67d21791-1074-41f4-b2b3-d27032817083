package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaHelpPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Report;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaHelpPage {
    public WebDriverHelper helper;
    public ExtentTest test;

    public NykaaHelpPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /**
     * a. Method Name: clickOnHelp
     * b. Author: Group 07
     * c. Description: This method waits for the "Help" button to be visible, clicks on it, and switches to the corresponding help page. It logs the action accordingly
     *          and handles failures gracefully.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnHelp() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.help, 5);
            helper.doClickandswitch(NykaaHelpPageLocator.help);
            test.log(Status.PASS, "Clicked on Help on Navigation bar");
            LoggerHandler.info("Clicked on Help on Navigation bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on Help on Navigation bar");
            LoggerHandler.error("Failed to Click on Help on Navigation bar");
        }
    }

    /**
     * a. Method Name: verifyHelpPageTitle
     * b. Author: Group 07
     * c. Description: This method retrieves the current page title and verifies that it contains "Help Center"
     *                  using an assertion. If successful, it logs the result; otherwise, it logs the failure message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyHelpPageTitle() {
        try {
            // String title = Base.driver.getTitle();
            String pageTitle=helper.doGetText(NykaaHelpPageLocator.helpCentre);
            // String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(pageTitle.contains("Help Center"));
            test.log(Status.PASS, "Verified Help Page Title");
            LoggerHandler.info("Verified Help Page Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify  Help page title");
            LoggerHandler.error("Failed to verify  Help page title");
        }
    }

    /**
     * a. Method Name: clickOnOrderRelated
     * b. Author: Group 07
     * c. Description: This method waits for the "Order Related" section to be visible,
     *                  clicks on it, and logs the action appropriately. If an exception occurs, it logs the failure message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnOrderRelated() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderRelated, 5);
            helper.doClick(NykaaHelpPageLocator.orderRelated);
            test.log(Status.PASS, "Clicked on Order Related successfully");
            LoggerHandler.info("Clicked on Order Related successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on order related.");
            LoggerHandler.error("Failed to click on order related.");
        }
    }

    /**
     * a. Method Name: verifyOrderRelatedText
     * b. Author: Group 07
     * c. Description: This method verifies whether the "Order Related" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void (Does not return a value)
     */
    public void verifyOrderRelatedText() {
        try {
            String orderrelated = helper.doGetText(NykaaHelpPageLocator.orderRelatedText);
            String expected=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/TonerExcel.xlsx", "Likitha", 3, 0);
            Assert.assertTrue(orderrelated.contains(expected));
            test.log(Status.PASS, "Verified the text Order Related");
            LoggerHandler.info("Verified the text Order Related");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Order Related");
            LoggerHandler.error("Failed to Verify the text Order Related");
        }
    }

    /**
     * a. Method Name: clickOnOrderStatus
     * b. Author: Group 07
     * c. Description: This method waits for the "Order Status" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnOrderStatus() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderStaus, 5);
            helper.doClick(NykaaHelpPageLocator.orderStaus);
            test.log(Status.PASS, "Clicked on Order Status");
            LoggerHandler.info("Clicked on Order Status");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on order status");
            LoggerHandler.error("Failed to click on order status");
        }
    }

    /**
     * a. Method Name: verifyOrderStatustext
     * b. Author: Group 07
     * c. Description: This method verifies whether the "Order Status" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */

    public void verifyOrderStatustext() {
        try {
            String orderStatus = helper.doGetText(NykaaHelpPageLocator.orderStatusText);
            String expected=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/TonerExcel.xlsx", "Likitha", 4, 0);
            Assert.assertTrue(orderStatus.contains(expected));
            test.log(Status.PASS, "Verified the text Order status");
            LoggerHandler.info("Verified the text Order status");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Order status");
            LoggerHandler.error("Failed to Verify the text Order status");
        }
    }

    /**
     * a. Method Name: navigateBackToOrderRelated
     * b. Author: Group 07
     * c. Description: This method navigates back to the previous page using the browser's built-in navigation.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void navigateBackToOrderRelated() {
        try {
            Base.driver.navigate().back();
            test.info("Naviagte back to Order Related page");
            test.log(Status.PASS, "Navigated back to Order Related page successfully");
            LoggerHandler.info("Navigated back to Order Related page successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to navigate back to Order Related page");
            LoggerHandler.error("Failed to navigate back to Order Related page");
        }
    }

    /**
     * a. Method Name: clickOnRefund
     * b. Author: Group 07
     * c. Description: This method waits for the "Returns and Refunds" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnRefund() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.returnRefunds, 5);
            helper.doClick(NykaaHelpPageLocator.returnRefunds);
            test.log(Status.PASS, "clicked on Returns and Refund");
            LoggerHandler.info("clicked on Returns and Refund");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Return and Refund");
            LoggerHandler.error("Failed to click on Return and Refund");
        }
    }

    /**
     * a. Method Name: verifyCanIReturn
     * b. Author: Group 07
     * c. Description: This method verifies whether the "Can I return part of my order?" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCanIReturn() {
        try {
            String canIReturn = helper.doGetText(NykaaHelpPageLocator.canIReturn);
            String expected=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/TonerExcel.xlsx", "Likitha", 5, 0);
            Assert.assertTrue(canIReturn.contains(expected));
            test.log(Status.PASS, "Verified the text Can I return a part of my order");
            LoggerHandler.info("Verified the text Can I return a part of my order");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Can I return a part of my order");
            LoggerHandler.error("Failed to Verify the text Can I return a part of my order");
        }
    }

    /**
     * a. Method Name: clickOnCancellationAndRefunds
     * b. Author: Group 07
     * c. Description: This method waits for the "Cancellation and Refunds" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCanceellationAndRefunds() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancellation, 5);
            helper.doClick(NykaaHelpPageLocator.cancellation);
            test.log(Status.PASS, "Clicked on Cancellation and Refunds");
            LoggerHandler.info("Clicked on Cancellation and Refunds");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on canceelation and refunds.");
            LoggerHandler.error("Failed to click on canceelation and refunds.");
        }
    }

    /**
     * a. Method Name: clickOnCancelPolicy
     * b. Author: Group 07
     * c. Description: This method waits for the "Cancellation Policy" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCancelPolicy() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelPolicy, 5);
            helper.doClick(NykaaHelpPageLocator.cancelPolicy);
            test.log(Status.PASS, "Clicked on Cancellation policy");
            LoggerHandler.info("Clicked on Cancellation policy");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on canceelation policy.");
            LoggerHandler.error("Failed to click on canceelation policy.");
        }
    }

    /**
     * a. Method Name: verifyCancelPolicy
     * b. Author: Group 07
     * c. Description: This method verifies whether the "Cancellation Policy" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCancelPolicy() {
        try {
            String cancellationPolicy = helper.doGetText(NykaaHelpPageLocator.cancelPolicyText);
            String expected=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/TonerExcel.xlsx", "Likitha", 6, 0);
            Assert.assertTrue(cancellationPolicy.contains(expected));
            test.log(Status.PASS, "Verified the text Cancellation Policy");
            LoggerHandler.info("Verified the text Cancellation Policy");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Cancellation Policy");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy");
        }
    }

    /**
     * a. Method Name: clickOnCancellationLink
     * b. Author: Group 07
     * c. Description: This method waits for the "Cancellation" link to be visible and then clicks on it.
     *              It switches to the new window if applicable and takes a screenshot for reporting.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOncancellationLink() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelLink, 5);
            helper.doClickandswitch(NykaaHelpPageLocator.cancelLink);
            test.log(Status.INFO, "Switch to new tab of cancellation link policy");
            test.log(Status.PASS, "Clicked on cancellation link policy");
            LoggerHandler.info("Clicked on cancellation link policy");
            Screenshot.captureFullScreenshot("Cancellation_Policy");
            Report.addScreenshotToReport("cancellation_policy",test, Base.driver,"CancellationPolicy");

        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on cancellation link.");
            LoggerHandler.info("Failed to click on cancellation link.");
        }
    }

    /**
     * a. Method Name: verifyCancelPolicyLink
     * b. Author: Group 07
     * c. Description: This method verifies whether the "Cancellation Policy" link is correctly displayed.
     *                  It fetches the text from the element, compares it with the expected link, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCancelPolicyLink() {
        try {
            String link = Base.driver.getCurrentUrl();
            String expected=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/TonerExcel.xlsx", "Likitha", 7, 0);
            Assert.assertEquals(link, expected);
            test.log(Status.PASS, "Verified the text Cancellation Policy url");
            LoggerHandler.info("Verified the text Cancellation Policy url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Cancellation Policy url");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy url");
        }
    }

    /**
     * a. Method Name: testHelpPage
     * b. Author: Group 07
     * c. Description: This method executes a sequence of actions to verify multiple functionalities on the Nykaa help page.
     *                  It clicks on various elements, verifies texts, navigates back when needed, and tests the cancellation policy link.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void testHelpPage() {
        try {
            clickOnHelp();
            Thread.sleep(2000);
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
            Thread.sleep(3000);
            clickOncancellationLink();
            Thread.sleep(3000);
            verifyCancelPolicyLink();
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
