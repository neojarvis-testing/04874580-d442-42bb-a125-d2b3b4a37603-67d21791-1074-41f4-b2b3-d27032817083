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
            test.log(Status.FAIL, "clicked on search bar");
            LoggerHandler.error("clicked on search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on search bar");
            LoggerHandler.error("Not clicked on search bar");
        }
    }

    public void inputPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaSearchForPillowLocators.searchBar,"Pillow");
            test.log(Status.FAIL, "pillow entered");
            LoggerHandler.error("pillow entered");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to input pillow");
            LoggerHandler.error("Unable to input pillow");
        }
    }

    public void hitEnter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doEnterAction(NykaaSearchForPillowLocators.searchBar);
            test.log(Status.FAIL, "Hit action performed");
            LoggerHandler.error("Hit action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Hit action not performed");
            LoggerHandler.error("Hit action not performed");
        }
    }

    public void verifyPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.pillowHeading, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.pillowHeading);
            Assert.assertTrue(data.contains("Pillow"));
            test.log(Status.FAIL, "Text pillow verified");
            LoggerHandler.error("Text pillow verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text pillow not verified");
            LoggerHandler.error("Text pillow not verified");
        }
    }

    public void clickPrice(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.price, 10);
            helper.doClick(NykaaSearchForPillowLocators.price);
            test.log(Status.FAIL, "clicked on price");
            LoggerHandler.error("clicked on price");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on price");
            LoggerHandler.error("Not clicked on price");
        }
    }

    public void clickPriceRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.priceRange, 10);
            helper.doClick(NykaaSearchForPillowLocators.priceRange);
            test.log(Status.FAIL, "clicked on price range");
            LoggerHandler.error("clicked on price range");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on price range");
            LoggerHandler.error("Not clicked on price range");
        }
    }

    public void clickDiscount(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.discount, 10);
            helper.doClick(NykaaSearchForPillowLocators.discount);
            test.log(Status.FAIL, "clicked on discount");
            LoggerHandler.error("clicked on discount");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on discount");
            LoggerHandler.error("Not clicked on discount");
        }
    }

    public void clickDiscountRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.discountRange, 10);
            helper.doClick(NykaaSearchForPillowLocators.discountRange);
            test.log(Status.FAIL, "clicked on discount range");
            LoggerHandler.error("clicked on discount range");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on discount range");
            LoggerHandler.error("Not clicked on discount range");
        }
    }

    public void clickAverageRating(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.averageCustomerRating, 10);
            helper.doClick(NykaaSearchForPillowLocators.averageCustomerRating);
            test.log(Status.FAIL, "clicked on average customer rating");
            LoggerHandler.error("clicked on average customer rating");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on average customer rating");
            LoggerHandler.error("Not clicked on average customer rating");
        }
    }

    public void clickAverageOption(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.fourStarRating, 10);
            helper.doClick(NykaaSearchForPillowLocators.fourStarRating);
            test.log(Status.FAIL, "clicked on average options");
            LoggerHandler.error("clicked on average options");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on average options");
            LoggerHandler.error("Not clicked on average options");
        }
    }

    public void verifyFilter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.filtersApplied, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.filtersApplied);
            test.log(Status.FAIL, "Filter text verified");
            LoggerHandler.error("Filter text verified");
        }catch (Exception e) {
            test.log(Status.FAIL, "Filter text not verified");
            LoggerHandler.error("Filter text not verified");
        }
    }

    public void clickFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaSearchForPillowLocators.firstProduct);
            test.log(Status.FAIL, "clicked on first product");
            LoggerHandler.error("clicked on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on first product");
            LoggerHandler.error("Not clicked on first product");
        }
    }

    public void clickAddtoBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.addToBag, 10);
            helper.doClick(NykaaSearchForPillowLocators.addToBag);
            test.log(Status.PASS,"clicked on Add to bag");
            LoggerHandler.info("clicked on Add to bag");
        } catch (Exception e) {
            test.log(Status.FAIL, "Add to bag not clicked");
            LoggerHandler.error("Add to bag not clicked");
        }
    }

    public void clickCart(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.cart, 10);
            helper.doClick(NykaaSearchForPillowLocators.cart);
            test.log(Status.PASS,"clicked on cart");
            LoggerHandler.info("clicked on cart");
        } catch (Exception e) {
            test.log(Status.FAIL, "Cart not clicked");
            LoggerHandler.error("Cart not clicked");
        }
    }

    public void verifyBag(){
        try {
            helper.doSwitchToIframe(NykaaSearchForPillowLocators.iframe);
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.bag, 10);
            String data = helper.doGetText(NykaaSearchForPillowLocators.bag);
            System.out.println(data);
            Assert.assertTrue(data.contains("Bag"));
            Screenshot.captureFullScreenshot("TestCase1");
            LoggerHandler.info("Text bag verified");
            test.log(Status.PASS, "Text bag verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text bag not verified");
            LoggerHandler.error("Text bag not verified");
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
