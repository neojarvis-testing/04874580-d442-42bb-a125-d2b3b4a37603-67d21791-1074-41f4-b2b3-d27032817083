package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaGetAppPageLocators;
import uistore.NykaaManPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NykaaManPage {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public NykaaManPage(ExtentTest test)
    {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnGetApp()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.nykaaMan, 5);
            helper.doJsscrollIntoView(NykaaManPageLocators.nykaaMan);
            helper.doClickandswitch(NykaaManPageLocators.nykaaMan);
            test.log(Status.PASS, "scroll down to footer");
            LoggerHandler.info("scroll down to footer");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }
    public void hoverHealthNutrition()
    {
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
    public void clickOnWheyProtein()
    {
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

    public void verifyWheyProtein()
    {
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
    public void verifyThreePagination()
    {
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
    public void clickTwoPagination()
    {
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
    public void clickFirstProduct()
    {
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

    public void enterPincodeData()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.pincode, 5);
            helper.doClick(NykaaManPageLocators.pincode);
            helper.doSendKeys(NykaaManPageLocators.pincode, ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/GetAppData.xlsx", "Sheet1", 0, 2));
            test.log(Status.PASS, "Entered pincode.");
            LoggerHandler.info("Entered pincode.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void clickCheck()
    {
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

    public void verifyChennai()
    {
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

    public void scrollToWriteReview()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.writeReview, 10);
            helper.doJsscrollIntoView(NykaaManPageLocators.writeReview);
            helper.doClick(NykaaManPageLocators.writeReview);
            test.log(Status.PASS, "Clicked on write review");
            LoggerHandler.info("Clicked on write review");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void verifySignIn()
    {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.signIn, 10);
            String signIn = helper.doGetText(NykaaManPageLocators.signIn);
            Assert.assertTrue(signIn.contains("Sign in"));
            test.log(Status.PASS, "Verified Sign In Text");
            LoggerHandler.info("Verified Sign In Text");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    public void execute()
    {
        clickOnGetApp();
        hoverHealthNutrition();
        clickOnWheyProtein();
        verifyWheyProtein();
        verifyThreePagination();
        clickTwoPagination();
        enterPincodeData();
        clickCheck();
        verifyChennai();
        scrollToWriteReview();
    }
}
