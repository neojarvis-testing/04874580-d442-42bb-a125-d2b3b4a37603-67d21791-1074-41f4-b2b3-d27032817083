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
    /*
     * a.Method Name:scrollDownToFooter
     * b.Author Name:Group 07
     * c.Description:This method scrolls down to the footer of the page using JavaScript.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void scrollDownToFooter(){
        try {
            Thread.sleep(4000);
            helper.doJsScrollFooter();
            test.log(Status.PASS,"Scrolled down");
            LoggerHandler.info("Scrolled down");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to scroll");
            LoggerHandler.error("Unable to scroll");
        } 
    }
    /*
     * a.Method Name:clickNewlaunches
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Newlaunches element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickNewlaunches(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.newLaunches, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.newLaunches);
            test.log(Status.PASS,"clicked on new launches");
            LoggerHandler.info("Clicked on new launches");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to click");
            LoggerHandler.error("Unable to click");
        } 
    }
    /*
     * a.Method Name:verifyShopNewLaunches
     * b.Author Name:Group 07
     * c.Description:This method verifies if the text "Launches" is present on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void verifyShopNewLaunches(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.shopNewLaunches, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.shopNewLaunches);
            Assert.assertTrue(data.contains("Launches"));
            test.log(Status.PASS,"New launches verified");
            LoggerHandler.info("New launches verified");
        }catch (Exception e) {
            test.log(Status.FAIL, "New launches not verified");
            LoggerHandler.error("New launches not verified");
        }
    }
    /*
     * a.Method Name:hoverOnNatural
     * b.Author Name:Group 07
     * c.Description:This method waits for the "natural" element to be visible and then hovers over it.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void hoverOnNatural(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.natural, 10);
            helper.doHoverOnElement(NykaaNewLaunchesLocators.natural);
            test.log(Status.PASS,"Hovered on natural");
            LoggerHandler.info("Hovered on natural");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to hover on natural");
            LoggerHandler.error("Unable to hover on natural");       
        } 
    }
    /*
     * a.Method Name:clickFaceWah
     * b.Author Name:Group 07
     * c.Description:This method clicks on the FaceWash element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickFaceWah(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.faceWash, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.faceWash);
            test.log(Status.PASS,"clicked on facewash");
            LoggerHandler.info("clicked on facewash");
        } catch (Exception e) {
            test.log(Status.FAIL, "Facewash not clicked");
            LoggerHandler.error("Facewash not clicked");        
        } 
    }
    /*
     * a.Method Name:verifyFaceWash
     * b.Author Name:Group 07
     * c.Description:This method verifies if the text "Wash" is present on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void verifyFaceWash(){
        try {
            Base.driver.navigate().refresh();
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.facewashHeading, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.facewashHeading);
            Assert.assertTrue(data.contains("Wash"));
            test.log(Status.PASS,"Face wash verified");
            LoggerHandler.info("Face wash verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Facewash not verified");
            LoggerHandler.error("Facewash not verified");
        }
    }
    /*
     * a.Method Name:clickPrices
     * b.Author Name:Group 07
     * c.Description:This method clicks on the price element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickPrices(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.price, 10);
            helper.doClick(NykaaNewLaunchesLocators.price);
            test.log(Status.PASS,"clicked on Prices");
            LoggerHandler.info("clicked on prices");
        } catch (Exception e) {
            test.log(Status.FAIL, "Prices not clicked");
            LoggerHandler.error("Prices not clicked");
        } 
    }
    /*
     * a.Method Name:clickPriceRange
     * b.Author Name:Group 07
     * c.Description:This method clicks on the priceRange element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickPriceRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.priceRange, 10);
            helper.doClick(NykaaNewLaunchesLocators.priceRange);
            test.log(Status.PASS,"clicked on Price range");
            LoggerHandler.info("clicked on Price range");
        } catch (Exception e) {
            test.log(Status.FAIL, "Price range not selected");
            LoggerHandler.error("Price range not selected");
        } 
    }
    /*
     * a.Method Name:clickFirstProductLink
     * b.Author Name:Group 07
     * c.Description:This method clicks on the FirstProductLink element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickFirstProductLink(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaNewLaunchesLocators.firstProduct);
            test.log(Status.PASS,"clicked on first product");
            LoggerHandler.info("clicked on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "First product not clicked");
            LoggerHandler.error("First product not clicked");
        } 
    }
    /*
     * a.Method Name:clickPinCode
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Pincode element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickPinCode(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.delivery, 10);
            helper.doClick(NykaaNewLaunchesLocators.delivery);
            test.log(Status.PASS,"clicked on pin code");
            LoggerHandler.info("clicked on pin code");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to click on pincode");
            LoggerHandler.error("Unable to click on pincode");
        } 
    }
    /*
     * a.Method Name:inputPinCode
     * b.Author Name:Group 07
     * c.Description:This method clicks on the inputPincode element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void inputPinCode(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.delivery, 10);
            helper.doSendKeys(NykaaNewLaunchesLocators.delivery,"620001");
            test.log(Status.PASS,"Pincode entered");
            LoggerHandler.info("Pincode entered");
        } catch (Exception e) {
           test.log(Status.FAIL, "Unable to input pincode");
           LoggerHandler.error("Unable to input pincode");
        } 
    }
    /*
     * a.Method Name:clickCheck
     * b.Author Name:Group 07
     * c.Description:This method clicks on the check element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickCheck(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.check, 10);
            helper.doClick(NykaaNewLaunchesLocators.check);
            test.log(Status.PASS,"clicked on Checked");
            LoggerHandler.info("clicked on Checked");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not able to click on check");
            LoggerHandler.error("Not able to click on check");
        } 
    }
    /*
     * a.Method Name:clickAddtoBag
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Add to bag element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickAddtoBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.addtoBag, 10);
            helper.doClick(NykaaNewLaunchesLocators.addtoBag);
            test.log(Status.PASS,"clicked on Add to bag");
            LoggerHandler.info("clicked on Add to bag");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on add to bag");
            LoggerHandler.error("Not clicked on add to bag");
        } 
    }
     /*
     * a.Method Name:clickCart
     * b.Author Name:Group 07
     * c.Description:This method clicks on the cart element on the Nykaa website..
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickCart(){
        try {
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.cart, 10);
            helper.doClick(NykaaNewLaunchesLocators.cart);
            test.log(Status.PASS,"clicked on cart");
            LoggerHandler.info("clicked on cart");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on cart");
            LoggerHandler.error("Not clicked on cart");
        }
    }
    /*
     * a.Method Name:verifyBag
     * b.Author Name:Group 07
     * c.Description:This method verifies if the text "Bag" is present on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void verifyBag(){
        try {
            helper.doSwitchToIframe(NykaaNewLaunchesLocators.iframe);
            helper.dowaitForElementToBeVisible(NykaaNewLaunchesLocators.bag, 10);
            String data = helper.doGetText(NykaaNewLaunchesLocators.bag);
            System.out.println(data);
            Assert.assertTrue(data.contains("Bag"));
            Screenshot.captureFullScreenshot("TestCase2");
            LoggerHandler.info("Bag verified");
            test.log(Status.PASS, "Bag verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text bag not verified");
            LoggerHandler.error("Text bag not verified");
        }
    }
    /*
     * a.Method Name:NykaaNewLaunches_Case
     * b.Author Name:Group 07
     * c.Description:This method excutes all  the test cases.
     * d.Parameters:None
     * e.Return Type:void
     */
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
