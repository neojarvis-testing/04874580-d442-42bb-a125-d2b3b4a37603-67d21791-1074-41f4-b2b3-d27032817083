package uistore;

import org.openqa.selenium.By;

public class NykaaKurtasLocators {
    
    public static By verifyKurtas = By.cssSelector("h1[class='css-h8pwvr']");
    public static By sortBy = By.xpath("//button[@class='css-drjr1k']");
    public static By bestSeller = By.cssSelector("div[title='Bestseller']");
    public static By secondProduct = By.xpath("//div[@class='css-zzdc8z']//div[@id='aria-label-13735962-1']");
    public static By sizeGuide = By.cssSelector("button[class='css-roouj2']");
    public static By verifySizeGuide = By.cssSelector("div[class='title css-9qof20']");
    public static By crossMark = By.xpath("(//div[@class='css-1sg2lsz'])[3]");
    public static By readAllReviews = By.cssSelector("a[class='css-pv2moq']");
    public static By allReviews = By.cssSelector("div[class='css-1ec8tb0']");
    public static By helpful = By.xpath("(//span[@class='css-1hk9p7l'])[2]");
    public static By numberInput = By.cssSelector("input[name='mobileInput']");
    public static By submit = By.cssSelector("button[type='submit']");

}
