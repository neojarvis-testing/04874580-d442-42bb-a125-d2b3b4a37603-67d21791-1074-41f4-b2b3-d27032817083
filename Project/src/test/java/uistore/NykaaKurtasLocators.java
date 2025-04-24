package uistore;

import org.openqa.selenium.By;

public class NykaaKurtasLocators {
    private NykaaKurtasLocators(){}
    public static final By verifyKurtas = By.cssSelector("h1[class='css-h8pwvr']");
    public static final By sortBy = By.xpath("//button[@class='css-drjr1k']");
    public static final By bestSeller = By.cssSelector("div[title='Bestseller']");
    public static final By secondProduct = By.xpath("(//div[@class='css-zzdc8z']/div)[2]");
    // public static final By secondProduct = By.xpath("(//div[@class='css-43krnf'])[2]");
    public static final By sizeGuide = By.cssSelector("button[class='css-roouj2']");
    public static final By verifySizeGuide = By.cssSelector("div[class='title css-9qof20']");
    public static final By crossMark = By.xpath("(//div[@class='css-1sg2lsz'])[3]");
    public static final By readAllReviews = By.xpath("(//a[@class='css-pv2moq'])");
    public static final By allReviews = By.cssSelector("div[class='css-1ec8tb0']");
    public static final By helpful = By.xpath("(//div[@class='css-1r0hxci'])[2]");
    public static final By numberInput = By.cssSelector("input[name='mobileInput']");
    public static final By submit = By.cssSelector("button[type='submit']");

}
