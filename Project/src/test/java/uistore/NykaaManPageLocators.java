package uistore;

import org.openqa.selenium.By;

public class NykaaManPageLocators {
    public static By nykaaMan = By.xpath("//a[text() = 'Nykaa Man']");
    public static By healthNutrition = By.xpath("//a[text() = 'Health & Nutrition']");
    public static By wheyProtein = By.xpath("//a[@href = '/health-nutrition/sports-nutrition/whey-protein/c/11218']");
    public static By wheyProteinText = By.cssSelector("h1.css-c0pzm0");
    public static By three = By.xpath("//a[text() = '3']");
    public static By two = By.xpath("//a[text() = '2']");
    public static By firstProduct = By.xpath("(//div[text() = 'MuscleBlaze Biozyme Performance Whey Protein PR - Chocolate ...'])[1]");
    public static By pincode = By.cssSelector("input[placeholder = 'Enter pincode']");
    public static By checkBtn = By.cssSelector(".css-yxoxyz");
    public static By chennaiText = By.cssSelector(".css-ew9amy"); 
    public static By writeReview = By.cssSelector(".css-mvv9bu");
    public static By signIn = By.cssSelector(".section-heading");
}
