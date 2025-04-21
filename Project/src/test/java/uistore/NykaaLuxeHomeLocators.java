package uistore;

import org.openqa.selenium.By;

public class NykaaLuxeHomeLocators {
    public static By Luxe=By.xpath("(//a[text()='Luxe'])[3]");
    public static By NykaaLuxe=By.cssSelector("h1");
    public static By popularity=By.cssSelector("button[class=' css-1aucgde']");
    public static By CustomerRated=By.cssSelector("label[for='radio_customer top rated_undefined']");
    public static By Gender=By.xpath("//span[text()='Gender']");
    public static By Unisex=By.cssSelector("label[for='checkbox_Unisex_10712']");
    public static By UnisexText=By.xpath("(//span[text()='Unisex'])[1]");
    public static By Occasion=By.xpath("//span[text()='Occasion']");
    public static By DaypuWear=By.cssSelector("label[for='checkbox_Day Wear_212287']");
    public static By FirstProduct=By.xpath("//div[text()='Forest Essentials Body Mist Oudh & Green Tea - Long Lasting ...']");
    public static By Nykaaman=By.xpath("//a[text()='Nykaa Man']");
    public static By Gromming=By.cssSelector("a[href='/grooming-advice']");
    public static By Shaving=By.xpath("(//span[text()='Shaving & Beard Care'])[1]");
}
