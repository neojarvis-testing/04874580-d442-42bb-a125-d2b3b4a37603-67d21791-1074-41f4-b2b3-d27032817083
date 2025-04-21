package uistore;

import org.openqa.selenium.By;

public class NykaaGetAppPageLocators {
    public static By getApp = By.xpath("//span[text() = 'Get App']");
    public static By mainHeading = By.className("main-heading");
    public static By mobileInputField = By.id("mob");
    public static By termsConditions = By.cssSelector("[href='/policy#terms-conditions']");
}
