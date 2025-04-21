package uistore;
import org.openqa.selenium.By;

public class NykaaSearchLipstickPageLocator {
     //120 Major Crush
     public static By searchBar=By.cssSelector("input[placeholder='Search on Nykaa']");
     public static By lipstickSuggestion=By.xpath("//span[contains(text(),'liquid')]");
     public static By liquidLipstick=By.xpath("//div[@id='6414588d52a8558d047acc3b']/div[2]");
     public static By liquidText=By.cssSelector("#title .css-c0pzm0");
     public static By firstProduct=By.xpath("//div[@id='product-list-wrap']/div[1]");
     public static By priviewShades=By.xpath("(//button[text()='Preview Shades'])[1]");
     public static By selectShade=By.cssSelector(".css-af01ye");
     public static By viewDetails=By.cssSelector(".css-3due47");
     public static By dropdwon=By.cssSelector("select[title='SHADE']");
     public static By contactUs=By.xpath("//a[text()='Contact Us']");
     public static By browseTopics=By.cssSelector( "div[class='css-15jvdn1 e1ucr0i20'] p[class='css-18hi0ul eka6zu20']");
     public static By nykaaAcc=By.xpath("(//div[@class='css-1ed5t9j e1ucr0i22'])[3]");
     public static By myWishList=By.xpath("//div[text()='My Wishlist']");
     public static By addItems=By.xpath("//p[text()='How do I add items to my wishlist?']");
     public static By wasHelpful=By.cssSelector("p[class='css-13paa7q e8pythv0']");
}
