package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaKurtasLocators;
import uistore.NykaaSearchForPillowLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaKurtas {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public NykaaKurtas(ExtentTest test){
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

    public void inputKurtas(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doSendKeys(NykaaSearchForPillowLocators.searchBar,"Kurtas");
        } catch (Exception e) {
            System.out.println("Value not entered");
        }
    }

    public void hitEnter(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchForPillowLocators.searchBar, 10);
            helper.doEnterAction(NykaaSearchForPillowLocators.searchBar);
        } catch (Exception e) {
            System.out.println("Enter not performed");
        }
    }

    public void verifyKurta(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.verifyKurtas, 10);
            String data = helper.doGetText(NykaaKurtasLocators.verifyKurtas);
            try {
                Assert.assertTrue(data.contains("Kurta"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void hoverOnSort(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.sortBy, 10);
            helper.doHoverOnElement(NykaaKurtasLocators.sortBy);
        } catch (Exception e) {
            System.out.println("Sort hover not performed");
        }
    }

    public void clickOnBestSeller(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.bestSeller, 10);
            helper.doClick(NykaaKurtasLocators.bestSeller);
        } catch (Exception e) {
            System.out.println("BestSeller not clicked");
        }
    }

    public void clickSecondProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.secondProduct, 10);
            helper.doClickandswitch(NykaaKurtasLocators.secondProduct);
        } catch (Exception e) {
            System.out.println("BestSeller not clicked");
        }
    }

    public void clickSizeGuide(){
        try {
            Thread.sleep(3000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.sizeGuide, 10);
            helper.doClick(NykaaKurtasLocators.sizeGuide);
        } catch (Exception e) {
            System.out.println("Size Guide not clicked");
        }
    }

    public void verifySizeGuideheading(){
        try {
            Thread.sleep(3000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.verifySizeGuide, 10);
            String data = helper.doGetText(NykaaKurtasLocators.verifySizeGuide);
            try {
                Assert.assertTrue(data.contains("SIZE"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void clickCross(){
        try {
            Thread.sleep(2000);
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.crossMark, 10);
            helper.doClick(NykaaKurtasLocators.crossMark);
        } catch (Exception e) {
            System.out.println("Cross Mark not clicked");
        }
    }

    public void clickReadAllReviews(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.readAllReviews, 10);
            helper.doClick(NykaaKurtasLocators.readAllReviews);
        } catch (Exception e) {
            System.out.println(" Real All not clicked");
        }
    }

    public void verifyAllReviews(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.allReviews, 10);
            String data = helper.doGetText(NykaaKurtasLocators.allReviews);
            try {
                Assert.assertTrue(data.contains("All"));
            } catch (Exception e) {
               System.out.println("Assert failed");
            }
        } catch (Exception e) {
            System.out.println("Not Verified");
        }
    }

    public void clickHelpful(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.helpful, 10);
            helper.doClick(NykaaKurtasLocators.helpful);
        } catch (Exception e) {
            System.out.println(" Helpful not clicked");
        }
    }

    public void clickMobileInput(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.numberInput, 10);
            helper.doClick(NykaaKurtasLocators.numberInput);
        } catch (Exception e) {
            System.out.println("Mobile input not clicked");
        }
    }

    public void inputMobileNumber(){
        try {

            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.numberInput, 10);
            helper.doSendKeys(NykaaKurtasLocators.numberInput,"9876543210");
            LoggerHandler.info("Mobile input done");
        } catch (Exception e) {
            System.out.println("Mobile number not entered");
        }
    }

    public void clickSubmit(){
        try {
            helper.dowaitForElementToBeVisible(NykaaKurtasLocators.submit, 10);
            helper.doClick(NykaaKurtasLocators.submit);
            Screenshot.captureFullScreenshot("Submit Button");
            test.log(Status.PASS,"Submit Button");
            LoggerHandler.info("Submit Button");
        } catch (Exception e) {
            System.out.println("Submit input not clicked");
        }
    }

    public void NykaaKurtas_Case(){
        clickSearchBar();
        inputKurtas();
        hitEnter();
        verifyKurta();
        hoverOnSort();
        clickOnBestSeller();
        clickSecondProduct();
        // clickSizeGuide();
        // verifySizeGuideheading();
        // clickCross();
        clickReadAllReviews();
        verifyAllReviews();
        clickHelpful();
        clickMobileInput();
        inputMobileNumber();
        clickSubmit();
    }

}
