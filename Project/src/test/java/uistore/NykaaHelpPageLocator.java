package uistore;

import org.openqa.selenium.By;

public class NykaaHelpPageLocator {
   public static By help=By.cssSelector("a[href='https://www.nykaa.com/gateway-api/omsApis/helpCenter?domain=NYKAA']");
   public static By orderRelated=By.xpath("//div[@class='css-1v515jz e1ucr0i21']/div[1]");
   public static By orderRelatedText=By.cssSelector("p[class='css-18dzwnv e8pythv0']");
   public static By orderStaus=By.xpath("//div[text()='Order Status']");
   public static By orderStatusText=By.cssSelector("p[class='css-pt0g0b e8pythv0']");
   public static By returnRefunds=By.xpath("//div[text()='Returns and Refunds']");
   public static By canIReturn=By.xpath("//p[text()='Can I return part of my order?']");
   public static By cancellation=By.xpath("//div[text()='Cancellations and Refund']");
   public static By cancelPolicy=By.xpath("//p[text()='Cancellation Policy']");
   public static By cancelPolicyText=By.cssSelector("p[class='css-pt0g0b e8pythv0']");
   public static By cancelLink=By.cssSelector("a[href='https://www.nykaa.com/cancellation-policy/lp']");
}
