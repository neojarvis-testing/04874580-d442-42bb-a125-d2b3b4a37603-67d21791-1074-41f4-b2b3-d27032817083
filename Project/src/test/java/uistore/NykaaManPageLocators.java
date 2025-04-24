package uistore;

import org.openqa.selenium.By;

public class NykaaManPageLocators {
    private NykaaManPageLocators(){}
    public static final By nykaaMan = By.xpath("//a[text() = 'Nykaa Man']");
    public static final By healthandWellness = By.xpath("//a[text() = 'Health & Wellness']");
    public static final By healthNutrition = By.xpath("//a[text() = 'Health & Nutrition']");
    public static final By wheyProtein = By.xpath("//a[@href = '/health-nutrition/sports-nutrition/whey-protein/c/11218']");
    public static final By wheyProteinText = By.cssSelector("h1.css-c0pzm0");
    public static final By three = By.xpath("//a[text() = '3']");
    public static final By two = By.xpath("//a[text() = '2']");
    public static final By firstProduct = By.xpath("//a[@href='/optimum-nutrition-on-gold-standard-100-isolate-chocolate-bliss-3lbs/p/776107?productId=776107&pps=1']");
    public static final By pincode = By.xpath("//input[@class = 'css-i2hz85']");
    public static final By checkBtn = By.cssSelector(".css-yxoxyz");
    public static final By chennaiText = By.cssSelector(".css-ew9amy"); 
    public static final By writeReview = By.xpath("//button[@class = 'css-mvv9bu']");
    public static final By signIn = By.xpath("//h2[@class = 'section-heading']");
}
