package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaCategoriesPageLocators;
import uistore.NykaaGetAppPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaCategoriesPage {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public NykaaCategoriesPage(ExtentTest test)
    {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void verifyCategories()
    {
        try {
            String categories = helper.doGetText(NykaaCategoriesPageLocators.categories);
            Assert.assertTrue(categories.contains("CATEGORIES"));
            test.log(Status.PASS, "Verified 'Categories'");
            LoggerHandler.info("Verified 'Categories'");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void sendDataToSearchBar()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.searchBar, 5);
            helper.doClick(NykaaCategoriesPageLocators.searchBar);
            helper.doSendKeys(NykaaCategoriesPageLocators.searchBar, ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/GetAppData.xlsx", "Sheet1", 0, 1));
            helper.doEnterAction(NykaaCategoriesPageLocators.searchBar);
            test.log(Status.PASS, "Sent data to search bar");
            LoggerHandler.info("Sent data to search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyKajal()
    {
        try {
            String kajal = helper.doGetText(NykaaCategoriesPageLocators.kajal);
            Assert.assertTrue(kajal.contains("Kajal"));
            test.log(Status.PASS, "Verified 'Kajal'");
            LoggerHandler.info("Verified 'Kajal'");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void clickOnPencil()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.formulation, 5);
            helper.doClick(NykaaCategoriesPageLocators.formulation);
            helper.doClick(NykaaCategoriesPageLocators.pencil);
            test.log(Status.PASS, "Clicked on Pencil");
            LoggerHandler.info("Clicked on Pencil");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void hoverFragrance()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.fragrance, 5);
            helper.doHoverOnElement(NykaaCategoriesPageLocators.fragrance);
            test.log(Status.PASS, "Hovered on Fragrance");
            LoggerHandler.info("Hovered on Fragrance");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void clickNewLaunches()
    {
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
    public void clickFirstProduct()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.firstProduct, 5);
            helper.doClickandswitch(NykaaCategoriesPageLocators.firstProduct);
            test.log(Status.PASS, "Clicked on first product");
            LoggerHandler.info("Clicked on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void clickAddToBag()
    {
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
    public void clickHowtoUse()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaCategoriesPageLocators.howToUse, 5);
            helper.doJsscrollIntoView(NykaaCategoriesPageLocators.howToUse);
            helper.doClick(NykaaCategoriesPageLocators.howToUse);
            test.log(Status.PASS, "Clicked on how to use");
            LoggerHandler.info("Clicked on how to use");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifyText()
    {
        try {
            String text = helper.doGetText(NykaaCategoriesPageLocators.customerViewed);
            Assert.assertTrue(text.contains("Customers also Viewed"));
            test.log(Status.PASS, "Verified 'Customers also Viewed'");
            LoggerHandler.info("Verified 'Customers also Viewed'");
            Screenshot.captureFullScreenshot("HowToUse");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void execute()
    {
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
