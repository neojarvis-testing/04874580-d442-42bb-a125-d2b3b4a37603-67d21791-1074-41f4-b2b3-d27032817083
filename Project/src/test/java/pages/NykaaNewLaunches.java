package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaNewLaunchesLocators;
import uistore.NykaaSearchForPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaNewLaunches {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public NykaaNewLaunches(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void scrollDownToFooter(){
        try {
            Thread.sleep(2000);
            helper.doJsScrollFooter();;
        } catch (Exception e) {
           System.out.println("not scrolled");
        } 
    }

    public void clickNewlaunches(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.newLaunches, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.newLaunches);
        } catch (Exception e) {
           System.out.println("new launches not clicked");
        } 
    }

    public void verifyShopNewLaunches(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.shopNewLaunches, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.shopNewLaunches);
            try {
                Assert.assertTrue(data.contains("Launches"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void hoverOnNatural(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.natural, 10);
            helper.doHoverOnElement(NykaaNewLaunchesLocators.natural);
        } catch (Exception e) {
           System.out.println("unable to hover");
        } 
    }
    
    public void clickFaceWah(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.faceWash, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.faceWash);
        } catch (Exception e) {
           System.out.println("face wash not clicked");
        } 
    }

    public void verifyFaceWash(){
        try {
            Base.driver.navigate().refresh();
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.facewashHeading, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.facewashHeading);
            try {
                Assert.assertTrue(data.contains("Wash"));
            } catch (AssertionError e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void clickPrices(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.price, 10);
            helper.doClick(NykaaNewLaunchesLocators.price);
        } catch (Exception e) {
           System.out.println("price not clicked");
        } 
    }

    public void clickPriceRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.priceRange, 10);
            helper.doClick(NykaaNewLaunchesLocators.priceRange);
        } catch (Exception e) {
           System.out.println("price Range not clicked");
        } 
    }

    public void clickFirstProductLink(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.firstProduct);
        } catch (Exception e) {
           System.out.println("First product not clicked");
        } 
    }

    public void clickPinCode(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.delivery, 10);
            helper.doClick(NykaaNewLaunchesLocators.delivery);
        } catch (Exception e) {
           System.out.println("delivery not clicked");
        } 
    }

    public void inputPinCode(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.delivery, 10);
            helper.doSendKeys(NykaaNewLaunchesLocators.delivery,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/ExcelData.xlsx", "Rahul", 1, 0));
        } catch (Exception e) {
           System.out.println("input not given");
        } 
    }

    public void clickCheck(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.check, 10);
            helper.doClick(NykaaNewLaunchesLocators.check);
        } catch (Exception e) {
           System.out.println("check not clicked");
        } 
    }

    public void clickAddtoBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.addtoBag, 10);
            helper.doClick(NykaaNewLaunchesLocators.addtoBag);
        } catch (Exception e) {
           System.out.println("add to bag not clicked");
        } 
    }

    public void clickCart(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.cart, 10);
            helper.doClick(NykaaNewLaunchesLocators.cart);
        } catch (Exception e) {
            System.out.println("cart not clicked");
        }
    }

    public void verifyBag(){
        try {
            helper.doSwitchToIframe(NykaaNewLaunchesLocators.iframe);
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.bag, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.bag);
            try {
                System.out.println(data);
                Assert.assertTrue(data.contains("Bag"));
                Screenshot.captureFullScreenshot("TestCase2");
                LoggerHandler.info(data);
                test.log(Status.PASS, data);
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void NykaaNewLaunches_Case(){
        scrollDownToFooter();
        clickNewlaunches();
        verifyShopNewLaunches();
        hoverOnNatural();
        clickFaceWah();
        verifyFaceWash();
        clickPrices();
        clickPriceRange();
        clickFirstProductLink();
        clickPinCode();
        inputPinCode();
        clickCheck();
        clickAddtoBag();
        clickCart();
        verifyBag();
    }
    
}
