package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaSearchLipstickPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NykaaSearchLipstick {
    public static WebDriverHelper helper;
    public ExtentTest test;
    public NykaaSearchLipstick(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
     * a.Method Name:sendLipstickInsearchBar
     * b.Author Name:Group 07
     * c.Description:This method sends the text "liquid lipstick" to the search bar on the Nykaa website
     * d.Parameters:None
     * e.Return Type:void
     */
    public void sendLipstickInsearchBar(){
        try {
            helper.doSendKeys(NykaaSearchLipstickPageLocator.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/TonerExcel.xlsx", "Likitha", 1, 0));
             test.log(Status.PASS,"Entered liquid lipstick in search bar");
            LoggerHandler.info("Entered liquid lipstick in search bar");
        } catch (Exception e) {
            test.log(Status.PASS,"Failed to enter liquid lipstick in search bar");
            LoggerHandler.info("Failed to enter liquid lipstick in search bar");
        }
    }
    /*
     * a.Method Name:clickOnLiquidLipstickSuggestion
     * b.Author Name:Group 07
     * c.Description:This method sends the text "liquid lipstick" to the search bar on the Nykaa website and performs an Enter action
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnLiquidLipstickSuggestion(){
        try {
            // helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.lipstickSuggestion, 5);
            // helper.doClick(NykaaSearchLipstickPageLocator.lipstickSuggestion);
            helper.doEnterAction(NykaaSearchLipstickPageLocator.searchBar);
            test.log(Status.PASS,"Performed enter action succesfully");
            LoggerHandler.info("Performed enter action succesfully");

        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to perform enter action");
            LoggerHandler.info("Failed to perform enter action");
        }
    }
    /*
     * a.Method Name:hoverOnFirstProduct
     * b.Author Name:Group 07
     * c.Description:This method enters the text "liquid lipstick" to the search bar and hover on the first product
     * d.Parameters:None
     * e.Return Type:void
     */
    public void hoverOnFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.firstProduct,5);
            helper.doHoverOnElement(NykaaSearchLipstickPageLocator.firstProduct);
            test.log(Status.PASS,"Hovered on first product");
            LoggerHandler.info("Hovered on first product");
            
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to hover on first product");
            LoggerHandler.info("Failed to hover on first product");
        }
    }
    /*
     * a.Method Name:clickOnPriviewShades
     * b.Author Name:Group 07
     * c.Description:This method clicks on the preview shades element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnPriviewShades(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.priviewShades);
            test.log(Status.PASS,"clicked on preview shades");
            LoggerHandler.info("clicked on preview shades");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on priview shades.");
            LoggerHandler.info("Failed to click on priview shades.");
        }
    }
    /*
     * a.Method Name:clickOnViewDetails
     * b.Author Name:Group 07
     * c.Description:This method clicks on the View details element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnViewDetails(){
        try {
            helper.doClickandswitch(NykaaSearchLipstickPageLocator.viewDetails);
            test.log(Status.PASS,"clicked on view details");
            LoggerHandler.info("clicked on view details");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on view details.");
            LoggerHandler.info("Failed to click on view details.");
            
        }
    }
    /*
     * a.Method Name:clickOnArrow
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Arrow element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnArrow(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.dropdwon);
            test.log(Status.PASS,"clicked on down arrow");
            LoggerHandler.info("clicked on down arrow");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on down arrow.");
            LoggerHandler.info("Failed to click on down arrow.");
            
        }
    }
    /*
     * a.Method Name:selectThirdOption
     * b.Author Name:Group 07
     * c.Description:This method selects the third option from the dropdown in the  Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void selectThirdOption(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.dropdwon, 5);
            helper.doSelectfromDropdown(NykaaSearchLipstickPageLocator.dropdwon,"120 Major Crush");
            test.log(Status.PASS,"selected third option");
            LoggerHandler.info("selected third option");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to select third option.");
            LoggerHandler.info("Failed to select third option.");
        }
    }
    /*
     * a.Method Name:scrollToFooter
     * b.Author Name:Group 07
     * c.Description:The method scrolls the page to the footer section by pixels.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void scrollToFooter(){
        try {
            helper.doScrollBypixel(0,2000);
            test.log(Status.PASS,"scrolled to footer");
            LoggerHandler.info("scrolled to footer");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to scroll to footer.");
            LoggerHandler.info("Failed to scroll to footer.");
        }
    }
    /*
     * a.Method Name:clickOnContactUs
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Contact us element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnContactUs(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.contactUs, 5);
            helper.doClickandswitch(NykaaSearchLipstickPageLocator.contactUs);
            test.log(Status.PASS,"clicked on contactus");
            LoggerHandler.info("clicked on contactus");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on contact us.");
            LoggerHandler.info("Failed to click on contact us.");
        }
    }
    /*
     * a.Method Name:clickOnNykaaAccount
     * b.Author Name:Group 07
     * c.Description:This method clicks on the Nykaa Account element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnNykaaAccount(){
        try{
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.nykaaAcc, 5);
            helper.doClick(NykaaSearchLipstickPageLocator.nykaaAcc);
            test.log(Status.PASS,"clicked on nykaa account");
            LoggerHandler.info("clicked on nykaa account");
        }catch(Exception e){
            test.log(Status.FAIL,"Failed to click on nykaa account.");
            LoggerHandler.info("Failed to click on nykaa account.");
        }
    }
    /*
     * a.Method Name:clickOnMyWishlist
     * b.Author Name:Group 07
     * c.Description:This method clicks on the MyWishlist element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickOnMyWishlist(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.myWishList, 5);
            helper.doClick(NykaaSearchLipstickPageLocator.myWishList);
            test.log(Status.PASS,"clicked on My Wishlist");
            LoggerHandler.info("clicked on My Wishlist");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on My wishlist.");
            LoggerHandler.info("Failed to click on My wishlist.");
        }
    }
    /*
     * a.Method Name:clickAddItems
     * b.Author Name:Group 07
     * c.Description:This method clicks on the AddItems element on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void clickAddItems(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.addItems, 5);
            helper.doClick(NykaaSearchLipstickPageLocator.addItems);
            test.log(Status.PASS,"clicked on My Wishlist");
            LoggerHandler.info("clicked on My Wishlist");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to click on How do I add items to my wishlist.");
            LoggerHandler.info("Failed to click on How do I add items to my wishlist.");
        }
    }
    /*
     * a.Method Name:verifyWasHelpful
     * b.Author Name:Group 07
     * c.Description:This method verifies if the text "Was this helpful?" is present on the Nykaa website.
     * d.Parameters:None
     * e.Return Type:void
     */
    public void verifyWasHelpful(){
        try {
            String wasHelpful=helper.doGetText(NykaaSearchLipstickPageLocator.wasHelpful);
            Assert.assertTrue(wasHelpful.contains("Was this helpful ?"));
            test.log(Status.PASS,"Verified Was this helpful");
            LoggerHandler.info("Verified Was this helpful");
        } catch (Exception e) {
            test.log(Status.FAIL,"Failed to verify was this helpful?.");
            LoggerHandler.info("Failed to verify was this helpful?.");
        }
    }
    public void testNykaaLipsticks(){
        
        try {
            sendLipstickInsearchBar();
            clickOnLiquidLipstickSuggestion();
            hoverOnFirstProduct();
            clickOnPriviewShades();
            clickOnViewDetails();
            clickOnArrow();
            selectThirdOption();
            scrollToFooter();
            clickOnContactUs();
            Thread.sleep(2000);
            clickOnNykaaAccount();
            Thread.sleep(2000);
            clickOnMyWishlist();
            Thread.sleep(2000);
            clickAddItems();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
