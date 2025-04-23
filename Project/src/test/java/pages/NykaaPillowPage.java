package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Report;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaPillowPage {
    WebDriverHelper helper;
    ExtentTest test;
    public NykaaPillowPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    /*
     * A. Method Name: clickSearchBar
     * B. Author Name: Rahul Savala
     * C. Description: Clicks on the search bar element on the Nykaa page.
     * D. Parameter: None
     * E. Return type: void
     */
    public void clickSearchBar(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doClick(NykaaPillowLocators.searchBar);
            test.log(Status.PASS, "clicked on search bar");
            LoggerHandler.info("clicked on search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on search bar");
            LoggerHandler.error("Not clicked on search bar");
        }
    }

    /*
     * A. Method Name: inputPillow
     * B. Author Name: Rahul Savala
     * C. Description: Enters the word "Pillow" in the search bar.
     * D. Parameter: None
     * E. Return type: void
     */
    public void inputPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaPillowLocators.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/SearchData.xlsx", "Sheet1", 0, 0));
            test.log(Status.PASS, "pillow entered");
            LoggerHandler.info("pillow entered");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to input pillow");
            LoggerHandler.error("Unable to input pillow");
        }
    }

    /*
     * A. Method Name: hitEnter
     * B. Author Name: Rahul Savala
     * C. Description: Simulates an Enter key press on the search bar.
     * D. Parameter: None
     * E. Return type: void
     */
    public void hitEnter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doEnterAction(NykaaPillowLocators.searchBar);
            test.log(Status.PASS, "Hit action performed");
            LoggerHandler.info("Hit action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Hit action not performed");
            LoggerHandler.error("Hit action not performed");
        }
    }

    /*
     * A. Method Name: verifyPillow
     * B. Author Name: Rahul Savala
     * C. Description: Verifies that the search result contains "Pillow".
     * D. Parameter: None
     * E. Return type: void
     */
    public void verifyPillow(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.pillowHeading, 10);
            String data = helper.doGetText(NykaaPillowLocators.pillowHeading);
            Assert.assertTrue(data.contains(ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/SearchData.xlsx", "Sheet1", 10, 0)));
            test.log(Status.INFO, "Text pillow verified");
            LoggerHandler.info("Text pillow verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text pillow not verified");
            LoggerHandler.error("Text pillow not verified");
        }
    }

    /*
    * A. Method Name: clickPrice
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the price filter option.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickPrice(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.price, 10);
            helper.doClick(NykaaPillowLocators.price);
            test.log(Status.PASS, "clicked on price");
            LoggerHandler.info("clicked on price");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on price");
            LoggerHandler.error("Not clicked on price");
        }
    }

    /*
    * A. Method Name: clickPriceRange
    * B. Author Name: Rahul Savala
    * C. Description: Selects a specific price range filter.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickPriceRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.priceRange, 10);
            helper.doClick(NykaaPillowLocators.priceRange);
            test.log(Status.PASS, "clicked on price range");
            LoggerHandler.info("clicked on price range");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on price range");
            LoggerHandler.error("Not clicked on price range");
        }
    }

    /*
    * A. Method Name: clickDiscount
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the discount filter option.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickDiscount(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.discount, 10);
            helper.doClick(NykaaPillowLocators.discount);
            test.log(Status.PASS, "clicked on discount");
            LoggerHandler.info("clicked on discount");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on discount");
            LoggerHandler.error("Not clicked on discount");
        }
    }

    /*
    * A. Method Name: clickDiscountRange
    * B. Author Name: Rahul Savala
    * C. Description: Selects a specific discount range filter.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickDiscountRange(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.discountRange, 10);
            helper.doClick(NykaaPillowLocators.discountRange);
            test.log(Status.PASS, "clicked on discount range");
            LoggerHandler.info("clicked on discount range");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on discount range");
            LoggerHandler.error("Not clicked on discount range");
        }
    }

    /*
    * A. Method Name: clickAverageRating
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the average customer rating filter option.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickAverageRating(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.averageCustomerRating, 10);
            helper.doClick(NykaaPillowLocators.averageCustomerRating);
            test.log(Status.PASS, "clicked on average customer rating");
            LoggerHandler.info("clicked on average customer rating");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on average customer rating");
            LoggerHandler.error("Not clicked on average customer rating");
        }
    }

    /*
    * A. Method Name: clickAverageOption
    * B. Author Name: Rahul Savala
    * C. Description: Selects a four-star rating filter option.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickAverageOption(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.fourStarRating, 10);
            helper.doClick(NykaaPillowLocators.fourStarRating);
            test.log(Status.PASS, "clicked on average options");
            LoggerHandler.info("clicked on average options");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on average options");
            LoggerHandler.error("Not clicked on average options");
        }
    }

    /*
    * A. Method Name: verifyFilter
    * B. Author Name: Rahul Savala
    * C. Description: Verifies that the applied filters are displayed correctly.
    * D. Parameter: None
    * E. Return type: void
    */
    public void verifyFilter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.filtersApplied, 10);
            String data = helper.doGetText(NykaaPillowLocators.filtersApplied);
            Assert.assertTrue(data.contains(ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/SearchData.xlsx", "Sheet1", 11, 0)));
            test.log(Status.INFO, "Filter text verified");
            LoggerHandler.info("Filter text verified");
        }catch (Exception e) {
            test.log(Status.FAIL, "Filter text not verified");
            LoggerHandler.error("Filter text not verified");
        }
    }

    /*
    * A. Method Name: clickFirstProduct
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the first product in the search results and switches to its page.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaPillowLocators.firstProduct);
            test.log(Status.PASS, "clicked on first product");
            LoggerHandler.info("clicked on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on first product");
            LoggerHandler.error("Not clicked on first product");
        }
    }

    /*
    * A. Method Name: clickAddtoBag
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the "Add to Bag" button to add the selected product to the cart.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickAddtoBag(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.addToBag, 10);
            helper.doClick(NykaaPillowLocators.addToBag);
            test.log(Status.PASS,"clicked on Add to bag");
            LoggerHandler.info("clicked on Add to bag");
        } catch (Exception e) {
            test.log(Status.FAIL, "Add to bag not clicked");
            LoggerHandler.error("Add to bag not clicked");
        }
    }

    /*
    * A. Method Name: clickCart
    * B. Author Name: Rahul Savala
    * C. Description: Clicks on the cart icon to view the added product.
    * D. Parameter: None
    * E. Return type: void
    */
    public void clickCart(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.cart, 10);
            helper.doClick(NykaaPillowLocators.cart);
            test.log(Status.PASS,"clicked on cart");
            LoggerHandler.info("clicked on cart");
        } catch (Exception e) {
            test.log(Status.FAIL, "Cart not clicked");
            LoggerHandler.error("Cart not clicked");
        }
    }

    /*
    * A. Method Name: verifyBag
    * B. Author Name: Rahul Savala
    * C. Description: Verifies that the bag contains the expected product.
    * D. Parameter: None
    * E. Return type: void
    */
    public void verifyBag(){
        try {
            helper.doSwitchToIframe(NykaaPillowLocators.iframe);
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.bag, 10);
            String data = helper.doGetText(NykaaPillowLocators.bag);
            System.out.println(data);
            Assert.assertTrue(data.contains(ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/SearchData.xlsx", "Sheet1", 9, 0)));
            Screenshot.captureFullScreenshot("Verify_Bag");
            Report.addScreenshotToReport("nykaa",test,Base.driver,"screenshot");
            LoggerHandler.info("Text bag verified");
            test.log(Status.INFO, "Text bag verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text bag not verified");
            LoggerHandler.error("Text bag not verified");
        }
    }

    /*
    * A. Method Name: NykaaSearchForPillow_Case
    * B. Author Name: Rahul Savala
    * C. Description: Executes the complete test case for searching and filtering a pillow on Nykaa.
    * D. Parameter: None
    * E. Return type: void
    */
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
