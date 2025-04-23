package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaCategoriesPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaCategoriesPage {
    public WebDriverHelper helper;
    public ExtentTest test;

    public NykaaCategoriesPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * A. Method Name: verifyCategories
     * B. Author Name: Tanu Shree
     * C. Description: This method retrieves and verifies the text of 'Categories' from the UI.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void verifyCategories() {
        try {
            String categories = helper.doGetText(NykaaCategoriesPageLocators.categories);
            Assert.assertTrue(categories.contains(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/GetAppData.xlsx", "Sheet1", 0, 1)));
            test.log(Status.PASS, "Verified 'Categories'");
            LoggerHandler.info("Verified 'Categories'");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: sendDataToSearchBar
     * B. Author Name: Tanu Shree
     * C. Description: This method waits for the search bar to be visible, clicks on it, sends data from an Excel sheet, and performs an enter action.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void sendDataToSearchBar() {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.searchBar, 5);
            helper.doClick(NykaaCategoriesPageLocators.searchBar);
            helper.doSendKeys(NykaaCategoriesPageLocators.searchBar,
                    ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/GetAppData.xlsx", "Sheet1", 1, 0));
            helper.doEnterAction(NykaaCategoriesPageLocators.searchBar);
            test.log(Status.INFO, "Sent data to search bar");
            LoggerHandler.info("Sent data to search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: verifyKajal
    // B. Author Name: Tanu Shree
    // C. Description: This method retrieves and verifies that the text contains 'Kajal' from the UI.
    // D. Parameters: None
    // E. Return Type: void
    public void verifyKajal() {
        try {
            String kajal = helper.doGetText(NykaaCategoriesPageLocators.kajal);
            Assert.assertTrue(kajal.contains(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/GetAppData.xlsx", "Sheet1", 1, 0)));
            test.log(Status.PASS, "Verified 'Kajal'");
            LoggerHandler.info("Verified 'Kajal'");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: clickOnPencil
    // B. Author Name: Tanu Shree
    // C. Description: This method waits for the formulation element to be visible clicks on it, and then clicks on the Pencil element.
    // D. Parameters: None
    // E. Return Type: void
    public void clickOnPencil() {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.formulation, 5);
            helper.doClick(NykaaCategoriesPageLocators.formulation);
            helper.doClick(NykaaCategoriesPageLocators.pencil);
            test.log(Status.INFO, "Clicked on Pencil");
            LoggerHandler.info("Clicked on Pencil");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: hoverFragrance
    // B. Author Name: Tanu Shree
    // C. Description: This method scrolls up by a certain pixel value, waits for a brief moment, and hovers over the Fragrance element.
    // D. Parameters: None
    // E. Return Type: void
    public void hoverFragrance() {
        try {
            Thread.sleep(3000);
            helper.doScrollBypixel(0, -3000);
            helper.doHoverOnElement(NykaaCategoriesPageLocators.fragrance);
            test.log(Status.PASS, "Hovered on Fragrance");
            LoggerHandler.info("Hovered on Fragrance");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: clickNewLaunches
    // B. Author Name: Tanu Shree
    // C. Description: This method waits for the New Launches element to be visible, clicks on it, and switches the tab.
    // D. Parameters: None
    // E. Return Type: void
    public void clickNewLaunches() {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.launches, 5);
            helper.doClickandswitch(NykaaCategoriesPageLocators.launches);
            test.log(Status.PASS, "Clicked on New Launches");
            LoggerHandler.info("Clicked on New Launches");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: clickFirstProduct
    // B. Author Name: Tanu Shree
    // C. Description: This method clicks on the first product and switches the tab.
    // D. Parameters: None
    // E. Return Type: void
    public void clickFirstProduct() {
        try {
            helper.doClickandswitch(NykaaCategoriesPageLocators.firstProduct);
            test.log(Status.PASS, "Clicked on first product");
            LoggerHandler.info("Clicked on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: clickAddToBag
    // B. Author Name: Tanu Shree
    // C. Description: This method waits for the first product element to be visible and then clicks on the "Add to Bag" button.
    // D. Parameters: None
    // E. Return Type: void
    public void clickAddToBag() {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.firstProduct, 5);
            helper.doClick(NykaaCategoriesPageLocators.addToBag);
            test.log(Status.PASS, "Clicked on add to bag");
            LoggerHandler.info("Clicked on add to bag");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: clickHowtoUse
    // B. Author Name: Tanu Shree
    // C. Description: This method scrolls down, waits for a few seconds, and then clicks on the "How to Use" section.
    // D. Parameters: None
    // E. Return Type: void
    public void clickHowtoUse() {
        try {
            helper.doScrollBypixel(0, 4000);
            Thread.sleep(3000);
            helper.doClick(NykaaCategoriesPageLocators.howToUse);
            test.log(Status.PASS, "Clicked on how to use");
            LoggerHandler.info("Clicked on how to use");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: verifyText
    // B. Author Name: Tanu Shree
    // C. Description: This method retrieves and verifies that the "Customers also Viewed" text is present.
    // D. Parameters: None
    // E. Return Type: void
    public void verifyText() {
        try {
            String text = helper.doGetText(NykaaCategoriesPageLocators.customerViewed);
            Assert.assertTrue(text.contains(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/GetAppData.xlsx", "Sheet1", 1, 1)));
            test.log(Status.PASS, "Verified 'Customers also Viewed'");
            LoggerHandler.info("Verified 'Customers also Viewed'");
            Screenshot.captureFullScreenshot("HowToUse");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    // A. Method Name: execute
    // B. Author Name: Tanu Shree
    // C. Description: This method calls all the defined functions sequentially to execute a full flow of actions.
    // D. Parameters: None
    // E. Return Type: void
    public void execute() {
        verifyCategories();
        sendDataToSearchBar();
        verifyKajal();
        clickOnPencil();
        hoverFragrance();
        clickNewLaunches();
        clickFirstProduct();
        clickAddToBag();
        clickHowtoUse();
        verifyText();
    }
}
