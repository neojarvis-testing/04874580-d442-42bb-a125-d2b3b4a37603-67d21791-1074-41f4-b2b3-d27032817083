package uistore;

import org.openqa.selenium.By;

public class NykaaLuxeHomeLocators {
    public static By Luxe=By.xpath("//a[@class='css-184rvtn' and text()='Luxe']");
    public static By NykaaLuxe=By.cssSelector("h1");
    public static By popularity=By.cssSelector("button[class=' css-1aucgde']");
    public static By customerRated=By.cssSelector("label[for='radio_customer top rated_undefined']");
    public static By gender=By.xpath("//span[text()='Gender']");
    public static By unisex=By.cssSelector("label[for='checkbox_Unisex_10712']");
    public static By unisexText=By.xpath("(//div[@class='css-3i7s5s'])[1]");
    public static By occasion=By.xpath("//span[text()='Occasion']");
    public static By daypuWear=By.xpath("//span[text()='Day Wear']");
    public static By firstProduct=By.xpath("//div[text()='Forest Essentials Body Mist Oudh & Green Tea - Long Lasting ...']");
    public static By nykaaman=By.xpath("//a[text()='Nykaa Man']");
    public static By gromming=By.xpath("//a[@href='/grooming-advice']");
    public static By shaving=By.cssSelector("#navbarNavAltMarkup > ul > li:nth-child(5) > a");
    public static By shavingandbeard=By.xpath("//div[text()='Shaving & Beard Care']");
}
