package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaManPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Report;

public class NykaaManPage {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public NykaaManPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * A. Method Name: clickOnNykaaMan
     * B. Author Name: Group 07
     * C. Description: This method performs multiple scrolls and pauses before clicking on the Nykaa Man section and switching contexts.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void clickOnNykaaMan() {
        try {
            helper.doHoverOnElement(NykaaManPageLocators.healthandWellness);
            helper.doScrollBypixel(0, 4000);
            Thread.sleep(3000);
            helper.doScrollBypixel(0, 4000);
            Thread.sleep(3000);
            helper.doScrollBypixel(0, 4000);
            Thread.sleep(3000);
            helper.doClickandswitch(NykaaManPageLocators.nykaaMan);
            test.log(Status.PASS, "scroll down to footer");
            LoggerHandler.info("scroll down to footer");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: hoverHealthNutrition
     * B. Author Name: Group 07
     * C. Description: This method waits for the Health & Nutrition section to be visible and then hovers over it.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void hoverHealthNutrition() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.healthNutrition, 5);
            helper.doHoverOnElement(NykaaManPageLocators.healthNutrition);
            test.log(Status.PASS, "hovered on health and nutrition.");
            LoggerHandler.info("hovered on health and nutrition.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: clickOnWheyProtein
     * B. Author Name: Group 07
     * C. Description: This method waits for the Whey Protein section to be visible, clicks on it, and switches to a new window.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnWheyProtein() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.wheyProtein, 5);
            helper.doClickandswitch(NykaaManPageLocators.wheyProtein);
            test.log(Status.PASS, "switch to new window");
            LoggerHandler.info("switch to new window");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: verifyWheyProtein
     * B. Author Name: Group 07
     * C. Description: This method waits for the Whey Protein heading to be visible, verifies its text, and logs the result.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyWheyProtein() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.wheyProteinText, 10);
            String mainHeading = helper.doGetText(NykaaManPageLocators.wheyProteinText);
            Assert.assertTrue(mainHeading.contains("Whey Protein"));
            test.log(Status.PASS, "Verified 'Whey Protein'");
            LoggerHandler.info("Verified 'Whey Protein'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: verifyThreePagination
     * B. Author Name: Group 07
     * C. Description: This method waits for the pagination element displaying "3" to be visible and verifies its presence.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyThreePagination() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.three, 10);
            String mainHeading = helper.doGetText(NykaaManPageLocators.three);
            Assert.assertTrue(mainHeading.contains("3"));
            test.log(Status.PASS, "Verified '3 pagination'");
            LoggerHandler.info("Verified '3 pagination'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: clickTwoPagination
     * B. Author Name: Group 07
     * C. Description: This method waits for the pagination element displaying "2" to be visible and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickTwoPagination() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.two, 10);
            helper.doClick(NykaaManPageLocators.two);
            test.log(Status.PASS, "Clicked '2 pagination'");
            LoggerHandler.info("Clicked '2 pagination'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: clickFirstProduct
     * B. Author Name: Group 07
     * C. Description: This method waits for the first product to be visible, clicks on it, and switches to a new window.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickFirstProduct() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaManPageLocators.firstProduct);
            test.log(Status.PASS, "Clicked on first product");
            LoggerHandler.info("Clicked on first product");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: enterPincodeData
     * B. Author Name: Group 07
     * C. Description: This method waits for the pincode input field to be visible, clicks on it, and enters data from an Excel sheet.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void enterPincodeData() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.pincode, 5);
            helper.doClick(NykaaManPageLocators.pincode);
            helper.doSendKeys(NykaaManPageLocators.pincode,
                    ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/GetAppData.xlsx", "Sheet1", 2, 0));
            test.log(Status.PASS, "Entered pincode.");
            LoggerHandler.info("Entered pincode.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: clickCheck
     * B. Author Name: Group 07
     * C. Description: This method waits for the check button to be visible and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickCheck() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.checkBtn, 10);
            helper.doClick(NykaaManPageLocators.checkBtn);
            test.log(Status.PASS, "Clicked on check button");
            LoggerHandler.info("Clicked on check button");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: verifyChennai
     * B. Author Name: Group 07
     * C. Description: This method waits for the Chennai text element to be visible and verifies its presence.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void verifyChennai() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.chennaiText, 10);
            String chennai = helper.doGetText(NykaaManPageLocators.chennaiText);
            Assert.assertTrue(chennai.contains("Chennai"));
            test.log(Status.PASS, "Verified Chennai Text");
            LoggerHandler.info("Verified Chennai Text");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: scrollToWriteReview
     * B. Author Name: Group 07
     * C. Description: This method scrolls down to the write review section and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void scrollToWriteReview() {
        try {
            helper.doScrollBypixel(0, 2000);
            Thread.sleep(3000);
            helper.doClick(NykaaManPageLocators.writeReview);
            test.log(Status.PASS, "Clicked on write review");
            LoggerHandler.info("Clicked on write review");
        } catch (AssertionError | InterruptedException e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: verifySignIn
     * B. Author Name: Group 07
     * C. Description: This method waits for the sign-in text element to be visible, verifies its presence, and captures a screenshot.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void verifySignIn() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.signIn, 10);
            String signIn = helper.doGetText(NykaaManPageLocators.signIn);
            Screenshot.captureFullScreenshot("nykaa");
            Report.addScreenshotToReport("nykaa",test,Base.driver,"nykaa");
            Assert.assertTrue(signIn.contains("Sign in"));
            test.log(Status.PASS, "Verified Sign In Text");
            LoggerHandler.info("Verified Sign In Text");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: execute
     * B. Author Name: Group 07
     * C. Description: This method executes all the defined functions sequentially.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void execute() {
        clickOnNykaaMan();
        hoverHealthNutrition();
        clickOnWheyProtein();
        verifyWheyProtein();
        verifyThreePagination();
        clickTwoPagination();
        clickFirstProduct();
        enterPincodeData();
        clickCheck();
        verifyChennai();
        scrollToWriteReview();
        verifySignIn();
    }
}
