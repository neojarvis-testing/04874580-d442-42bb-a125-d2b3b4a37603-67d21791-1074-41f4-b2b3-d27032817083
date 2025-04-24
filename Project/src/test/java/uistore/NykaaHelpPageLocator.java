package uistore;

import org.openqa.selenium.By;

public class NykaaHelpPageLocator {
   private NykaaHelpPageLocator(){}
   public static final  By help=By.cssSelector("a[href='https://www.nykaa.com/gateway-api/omsApis/helpCenter?domain=NYKAA']");
   public static final  By orderRelated=By.xpath("//div[@class='css-1v515jz e1ucr0i21']/div[1]");
   public static final  By orderRelatedText=By.cssSelector("p[class='css-18dzwnv e8pythv0']");
   public static final  By orderStaus=By.xpath("//div[text()='Order Status']");
   public static final  By orderStatusText=By.cssSelector("p[class='css-pt0g0b e8pythv0']");
   public static final  By returnRefunds=By.xpath("//div[text()='Returns and Refunds']");
   public static final  By canIReturn=By.xpath("//p[text()='Can I return part of my order?']");
   public static final  By cancellation=By.xpath("//div[text()='Cancellations and Refund']");
   public static final  By cancelPolicy=By.xpath("//p[text()='Cancellation Policy']");
   public static final  By cancelPolicyText=By.cssSelector("p[class='css-pt0g0b e8pythv0']");
   public static final  By cancelLink=By.cssSelector("a[href='https://www.nykaa.com/cancellation-policy/lp']");
   public static final  By helpCentre=By.cssSelector("p[class='css-1tr5m7p e8pythv0']");
}
