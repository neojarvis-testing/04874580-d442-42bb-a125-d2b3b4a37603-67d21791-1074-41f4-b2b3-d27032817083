package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.NykaaSearchLipstickPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class NykaaSearchLipstick {
    public static WebDriverHelper helper;
    public ExtentTest test;
    public NykaaSearchLipstick(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void sendLipstickInsearchBar(){
        try {
            helper.doSendKeys(NykaaSearchLipstickPageLocator.searchBar,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/TonerExcel.xlsx", "Likitha", 1, 0));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnLiquidLipstickSuggestion(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.lipstickSuggestion, 5);
            helper.doClick(NykaaSearchLipstickPageLocator.lipstickSuggestion);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void hoverOnFirstProduct(){
        try {
            helper.dowaitForElementToBeVisible(NykaaSearchLipstickPageLocator.firstProduct,5);
            helper.doHoverOnElement(NykaaSearchLipstickPageLocator.firstProduct);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnPriviewShades(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.priviewShades);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void clickOnViewDetails(){
        try {
            helper.doClickandswitch(NykaaSearchLipstickPageLocator.viewDetails);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnArrow(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.dropdwon);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void selectThirdOption(){
        try {
            helper.doSelectfromDropdown(NykaaSearchLipstickPageLocator.dropdwon,"120 Major Crush");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void scrollToFooter(){
        try {
            helper.doScrollBypixel(0,2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickOnContactUs(){
        try {
            helper.doClickandswitch(NykaaSearchLipstickPageLocator.contactUs);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void clickOnNykaaAccount(){
        try{
            helper.doClick(NykaaSearchLipstickPageLocator.nykaaAcc);
        }catch(Exception e){

        }
    }
    public void clickOnMyWishlist(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.myWishList);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void clickAddItems(){
        try {
            helper.doClick(NykaaSearchLipstickPageLocator.addItems);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void testNykaaLipsticks(){
        sendLipstickInsearchBar();
        clickOnLiquidLipstickSuggestion();
        clickOnPriviewShades();
        clickOnViewDetails();
        clickOnArrow();
        selectThirdOption();
        scrollToFooter();
        clickOnContactUs();
        clickOnNykaaAccount();
        clickOnMyWishlist();
        clickAddItems();
    }

}
