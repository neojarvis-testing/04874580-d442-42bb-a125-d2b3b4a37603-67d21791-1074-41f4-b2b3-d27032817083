package uistore;

import org.openqa.selenium.By;

public class NykaaManPageLocators {
    public static By nykaaMan = By.xpath("//a[text() = 'Nykaa Man']");
    public static By healthandWellness = By.xpath("//a[text() = 'Health & Wellness']");
    public static By healthNutrition = By.xpath("//a[text() = 'Health & Nutrition']");
    public static By wheyProtein = By.xpath("//a[@href = '/health-nutrition/sports-nutrition/whey-protein/c/11218']");
    public static By wheyProteinText = By.cssSelector("h1.css-c0pzm0");
    public static By three = By.xpath("//a[text() = '3']");
    public static By two = By.xpath("//a[text() = '2']");
    public static By firstProduct = By.xpath("//a[@href='/optimum-nutrition-on-gold-standard-100percent-whey-protein-powder-vanilla-ice-cream/p/12199750?productId=12199750&pps=1']");
    public static By pincode = By.xpath("//input[@class = 'css-i2hz85']");
    public static By checkBtn = By.cssSelector(".css-yxoxyz");
    public static By chennaiText = By.cssSelector(".css-ew9amy"); 
    public static By writeReview = By.xpath("//button[@class = 'css-mvv9bu']");
    public static By signIn = By.xpath("//h2[@class = 'section-heading']");
}
