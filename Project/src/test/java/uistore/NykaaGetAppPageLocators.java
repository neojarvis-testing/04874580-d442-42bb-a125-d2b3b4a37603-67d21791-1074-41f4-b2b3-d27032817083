package uistore;

import org.openqa.selenium.By;

public class NykaaGetAppPageLocators {
    private NykaaGetAppPageLocators(){}
    public static final By getApp = By.xpath("//span[text() = 'Get App']");
    public static final By mainHeading = By.xpath("//h1[@class = 'main-heading']");
    public static final By mobileInputField = By.id("mob");
    public static final By termsConditions = By.cssSelector("[href='/policy#terms-conditions']");
    public static final By termsConditionsHeading = By.xpath("//div[@id = 'terms-conditions']/div[@class = 'doc-heading title-large']");
    public static final By shippingPolicy = By.cssSelector("[href='#shipping-policy']");
    public static final By deliveryProcessQues = By.xpath("(//div[@id = 'shipping-policy']/div/div[@class = 'doc-title title-medium'])[1]");
    public static final By privacyPolicy = By.xpath("//a[text() = 'Privacy Policy']");
    public static final By privacyPolicyHeading = By.xpath("//div[@id = 'privacy-policy']/div[@class = 'doc-heading title-large']");
    public static final By offerZone = By.cssSelector(".css-1a55w8c a[href='/sp/offers-native/offers?utm_source=Desktop_web_footer']");
}
