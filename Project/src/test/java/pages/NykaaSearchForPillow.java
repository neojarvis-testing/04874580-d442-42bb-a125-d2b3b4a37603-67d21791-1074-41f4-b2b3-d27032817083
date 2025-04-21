package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaSearchForPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaSearchForPillow {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public NykaaSearchForPillow(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void clickSearchBar(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doClick(NykaaSearchForPillowLocators.searchBar);
        } catch (Exception e) {
            System.out.println("not clicked");
        }
    }

    public void inputPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaSearchForPillowLocators.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/ExcelData.xlsx", "Rahul", 0, 0));
        } catch (Exception e) {
            System.out.println("Value not entered");
        }
    }

    public void hitEnter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doEnterAction(NykaaSearchForPillowLocators.searchBar);
        } catch (Exception e) {
            System.out.println("Action not performed");
        }
    }

    public void verifyPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.pillowHeading, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.pillowHeading);
            try {
                Assert.assertTrue(data.contains("Pillow"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void clickPrice(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.price, 10);
            helper.doClick(NykaaSearchForPillowLocators.price);
        } catch (Exception e) {
            System.out.println("Price not clicked");
        }
    }

    public void clickPriceRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.priceRange, 10);
            helper.doClick(NykaaSearchForPillowLocators.priceRange);
        } catch (Exception e) {
            System.out.println("Pricerange not clicked");
        }
    }

    public void clickDiscount(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.discount, 10);
            helper.doClick(NykaaSearchForPillowLocators.discount);
        } catch (Exception e) {
            System.out.println("Discount not clicked");
        }
    }

    public void clickDiscountRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.discountRange, 10);
            helper.doClick(NykaaSearchForPillowLocators.discountRange);
        } catch (Exception e) {
            System.out.println("Discount Range not clicked");
        }
    }

    public void clickAverageRating(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.averageCustomerRating, 10);
            helper.doClick(NykaaSearchForPillowLocators.averageCustomerRating);
        } catch (Exception e) {
            System.out.println("Average not clicked");
        }
    }

    public void clickAverageOption(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.fourStarRating, 10);
            helper.doClick(NykaaSearchForPillowLocators.fourStarRating);
        } catch (Exception e) {
            System.out.println("Option not clicked");
        }
    }

    public void verifyFilter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.filtersApplied, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.filtersApplied);
            try {
                Assert.assertTrue(data.contains("Filters"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void clickFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaSearchForPillowLocators.firstProduct);
        } catch (Exception e) {
            System.out.println("product not clicked");
        }
    }

    public void clickAddtoBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.addToBag, 10);
            helper.doClick(NykaaSearchForPillowLocators.addToBag);
        } catch (Exception e) {
            System.out.println("add to bag not clicked");
        }
    }

    public void clickCart(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.cart, 10);
            helper.doClick(NykaaSearchForPillowLocators.cart);
        } catch (Exception e) {
            System.out.println("cart not clicked");
        }
    }

    public void verifyBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.bag, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.bag);
            try {
                System.out.println(data);
                Assert.assertTrue(data.contains("Filters"));
                Screenshot.captureFullScreenshot("TestCase1");
                LoggerHandler.info(data);
                test.log(Status.PASS, data);
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void NykaaSearchForPillow_Case(){
        clickSearchBar();
        inputPillow();
        hitEnter();
        verifyPillow();
        clickPrice();
        clickPriceRange();
        clickDiscount();
        clickDiscountRange();
        clickAverageRating();
        clickAverageOption();
        verifyFilter();
        clickFirstProduct();
        clickAddtoBag();
        clickCart();
        verifyBag();
    }
}
