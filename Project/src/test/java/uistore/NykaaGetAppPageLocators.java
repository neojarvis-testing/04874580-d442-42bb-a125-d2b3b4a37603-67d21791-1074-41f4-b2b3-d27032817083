package uistore;

import org.openqa.selenium.By;

public class NykaaGetAppPageLocators {
    public static By getApp = By.xpath("//span[text() = 'Get App']");
    public static By mainHeading = By.xpath("//h1[@class = 'main-heading']");
    public static By mobileInputField = By.id("mob");
    public static By termsConditions = By.cssSelector("[href='/policy#terms-conditions']");
    public static By termsConditionsHeading = By.xpath("//div[@id = 'terms-conditions']/div[@class = 'doc-heading title-large']");
    public static By shippingPolicy = By.cssSelector("[href='#shipping-policy']");
    public static By deliveryProcessQues = By.xpath("(//div[@id = 'shipping-policy']/div/div[@class = 'doc-title title-medium'])[1]");
    public static By privacyPolicy = By.xpath("//a[text() = 'Privacy Policy']");
    public static By privacyPolicyHeading = By.xpath("//div[@id = 'privacy-policy']/div[@class = 'doc-heading title-large']");
    public static By offerZone = By.cssSelector(".css-1a55w8c a[href='/sp/offers-native/offers?utm_source=Desktop_web_footer']");
}
