package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaKurtasLocators;
import uistore.NykaaPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaKurtasPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public NykaaKurtasPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    
    /*Method Name: clickSearchBar
    Author Name: Group 07
    Description: Clicks on the search bar after waiting for its visibility.
    Parameter: None
    Return Type: void
    */
    public void clickSearchBar(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doClick(NykaaPillowLocators.searchBar);
            test.log(Status.PASS, "Clicked on SearchBar");
            LoggerHandler.info("Clicked on SearchBar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Searchbar not clicked");
            LoggerHandler.error("Searchbar not clicked");
        }
    }

    /*Method Name: inputKurtas
    Author Name: Group 07
    Description: Inputs "Kurtas" in the search bar after ensuring its visibility.
    Parameter: None
    Return Type: void
    */
    public void inputKurtas(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaPillowLocators.searchBar,"Kurtas");
            test.log(Status.PASS, "Value Entered");
            LoggerHandler.info("Value Entered");
        } catch (Exception e) {
            test.log(Status.FAIL, "Value not entered");
            LoggerHandler.error("Value not entered");
        }
    }

    /*Method Name: hitEnter
    Author Name: Group 07
    Description: Performs the Enter action after making sure the search bar is visible.
    Parameter: None
    Return Type: void
    */
    public void hitEnter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaPillowLocators.searchBar, 10);
            helper.doEnterAction(NykaaPillowLocators.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.error("Enter action not performed");        
        }
    }

    /*Method Name: verifyKurta
    Author Name: Group 07
    Description: Verifies if the search results contain "Kurta".
    Parameter: None
    Return Type: void
    */
    public void verifyKurta(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.verifyKurtas, 10);
            String data = helper.doGetText(NykaaKurtasLocators.verifyKurtas);
            Assert.assertTrue(data.contains("Kurta"));
            test.log(Status.PASS, "Kurta verified");
            LoggerHandler.info("Kurta verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Kurta not verified");
            LoggerHandler.error("Kurta not verified");
        }
    }

    /*Method Name: hoverOnSort
    Author Name: Group 07
    Description: Hovers over the sort option after waiting for its visibility.
    Parameter: None
    Return Type: void
    */
    public void hoverOnSort(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.sortBy, 10);
            helper.doHoverOnElement(NykaaKurtasLocators.sortBy);
            test.log(Status.PASS, "Hovered on sort");
            LoggerHandler.info("Hovered On sort");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not hovered on sort");
            LoggerHandler.error("Not hovered on sort");
        }
    }

    /*Method Name: clickOnBestSeller
    Author Name: Group 07
    Description: Clicks on the Best Seller option after confirming its visibility.
    Parameter: None
    Return Type: void
    */
    public void clickOnBestSeller(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.bestSeller, 10);
            helper.doClick(NykaaKurtasLocators.bestSeller);
            test.log(Status.PASS, "Clicked on Bestseller");
            LoggerHandler.info("Clicked on Bestseller");
        } catch (Exception e) {
            test.log(Status.FAIL, "BestSeller is not clicked");
            LoggerHandler.error("BestSeller is not clicked");
        }
    }

    /*Method Name: clickSecondProduct
    Author Name: Group 07
    Description: Clicks on the second product and switches context.
    Parameter: None
    Return Type: void
    */
    public void clickSecondProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.secondProduct, 10);
            helper.doClickandswitch(NykaaKurtasLocators.secondProduct);
            test.log(Status.PASS, "Clicked on Second Product");
            LoggerHandler.info("Clicked on Second Product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on second product");
            LoggerHandler.error("Not clicked on second product");
        }
    }

    /*Method Name: clickSizeGuide
    Author Name: Group 07
    Description: Clicks on the Size Guide option after ensuring its visibility.
    Parameter: None
    Return Type: void
    */
    public void clickSizeGuide(){
        try {
            Thread.sleep(3000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.sizeGuide, 10);
            helper.doClick(NykaaKurtasLocators.sizeGuide);
            test.log(Status.PASS, "Clicked on Size guide");
            LoggerHandler.info("Clicked on SearchBar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on size guide");
            LoggerHandler.error("Not clicked on size guide");
        }
    }

    /*Method Name: verifySizeGuideheading
    Author Name: Group 07
    Description: Verifies if the Size Guide heading is displayed.
    Parameter: None
    Return Type: void
    */
    public void verifySizeGuideheading(){
        try {
            Thread.sleep(3000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.verifySizeGuide, 10);
            String data = helper.doGetText(NykaaKurtasLocators.verifySizeGuide);
            Assert.assertTrue(data.contains("SIZE"));
            test.log(Status.PASS, "Verification of size guide is done");
            LoggerHandler.info("Verification of size guide is done");    
        } catch (Exception e) {
            test.log(Status.FAIL, "Verification of size guide is not done");
            LoggerHandler.error("Verification of size guide is not done");
        }
    }

    /*Method Name: clickCross
    Author Name: Group 07
    Description: Clicks the cross mark to close the Size Guide.
    Parameter: None
    Return Type: void
    */
    public void clickCross(){
        try {
            Thread.sleep(2000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.crossMark, 10);
            helper.doClick(NykaaKurtasLocators.crossMark);
            test.log(Status.PASS, "Clicked on Cross bar");
            LoggerHandler.info("Clicked on Cross bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on cross bar");
            LoggerHandler.error("Not clicked on cross bar");
        }
    }

    /*Method Name: clickReadAllReviews
    Author Name: Group 07
    Description: Clicks on the "Read All Reviews" option.
    Parameter: None
    Return Type: void
    */
    public void clickReadAllReviews(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.readAllReviews, 10);
            helper.doClick(NykaaKurtasLocators.readAllReviews);
            test.log(Status.PASS, "Clicked on Read all reviews");
            LoggerHandler.info("Clicked on Read all reviews");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on read all");
            LoggerHandler.error("Not clicked on read all");
        }
    }

    /*Method Name: verifyAllReviews
    Author Name: Group 07
    Description: Verifies if all reviews section is visible.
    Parameter: None
    Return Type: void
    */
    public void verifyAllReviews(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.allReviews, 10);
            String data = helper.doGetText(NykaaKurtasLocators.allReviews);
            Assert.assertTrue(data.contains("All"));
            test.log(Status.PASS, "Verification of all reviews is done");
            LoggerHandler.info("Verification of all reviews is done");
        } catch (Exception e) {
            test.log(Status.FAIL, "Verification of all reviews is not done");
            LoggerHandler.error("Verification of all reviews is not done");
        }
    }

    /*Method Name: clickHelpful
    Author Name: Group 07
    Description: Clicks on the "Helpful" button for a review.
    Parameter: None
    Return Type: void
    */
    public void clickHelpful(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.helpful, 10);
            helper.doClick(NykaaKurtasLocators.helpful);
            test.log(Status.PASS, "Clicked on helpful");
            LoggerHandler.info("Clicked on helpful");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on helpful");
            LoggerHandler.error("Not clicked on helpful");
        }
    }

    /*Method Name: clickMobileInput
    Author Name: Group 07
    Description: Clicks on the mobile number input field.
    Parameter: None
    Return Type: void
    */
    public void clickMobileInput(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.numberInput, 10);
            helper.doClick(NykaaKurtasLocators.numberInput);
            test.log(Status.PASS, "clicked on mobile input");
            LoggerHandler.info("clicked on mobile input");
        } catch (Exception e) {
            test.log(Status.FAIL, "Unable to click on input field");
            LoggerHandler.error("Unable to click on input field");
        }
    }

    /*Method Name: inputMobileNumber
    Author Name: Group 07
    Description: Inputs a mobile number in the designated field.
    Parameter: None
    Return Type: void
    */
    public void inputMobileNumber(){
        try {

            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.numberInput, 10);
            helper.doSendKeys(NykaaKurtasLocators.numberInput,"9876543210");
            LoggerHandler.info("Mobile number entered");
            test.log(Status.PASS, "Mobile number entered");
        } catch (Exception e) {
            test.log(Status.FAIL, "number not entered");
            LoggerHandler.error("number not entered");
        }
    }

    /*Method Name: clickSubmit
    Author Name: Group 07
    Description: Clicks the submit button after verifying visibility.
    Parameter: None
    Return Type: void
    */
    public void clickSubmit(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.submit, 10);
            helper.doClick(NykaaKurtasLocators.submit);
            Screenshot.captureFullScreenshot("Submit Button");
            test.log(Status.PASS,"clicked on submit Button");
            LoggerHandler.info("clicked on submit Button");
        } catch (Exception e) {
            test.log(Status.FAIL, "not clicked on submit Button");
            LoggerHandler.error("not clicked on submit Button");
        }
    }

    /*Method Name: NykaaKurtas_Case
    Author Name: Group 07
    Description: Executes the full test flow for searching and verifying Kurtas on Nykaa.
    Parameter: None
    Return Type: void
    */
    public void NykaaKurtas_Case(){
        clickSearchBar();
        inputKurtas();
        hitEnter();
        verifyKurta();
        hoverOnSort();
        clickOnBestSeller();
        clickSecondProduct();
        clickReadAllReviews();
        verifyAllReviews();
        clickHelpful();
        clickMobileInput();
        inputMobileNumber();
        clickSubmit();
    }

}
