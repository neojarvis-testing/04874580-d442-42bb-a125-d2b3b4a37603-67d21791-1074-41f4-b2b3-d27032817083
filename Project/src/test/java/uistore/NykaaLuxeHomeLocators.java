package uistore;

import org.openqa.selenium.By;

public class NykaaLuxeHomeLocators {
    private NykaaLuxeHomeLocators(){}
    public static final By luxe=By.xpath("//a[@class='css-184rvtn' and text()='Luxe']");
    public static final By nykaaLuxe=By.cssSelector("h1");
    public static final By popularity=By.cssSelector("button[class=' css-1aucgde']");
    public static final By customerRated=By.cssSelector("label[for='radio_customer top rated_undefined']");
    public static final By gender=By.xpath("//span[text()='Gender']");
    public static final By unisex=By.cssSelector("label[for='checkbox_Unisex_10712']");
    public static final By unisexText=By.xpath("(//div[@class='css-3i7s5s'])[1]");
    public static final By occasion=By.xpath("//span[text()='Occasion']");
    public static final By daypuWear=By.xpath("//span[text()='Day Wear']");
    public static final By firstProduct=By.xpath("//div[text()='Forest Essentials Body Mist Oudh & Green Tea - Long Lasting ...']");
    public static final By nykaaman=By.xpath("//a[text()='Nykaa Man']");
    public static final By gromming=By.xpath("//a[@href='/grooming-advice']");
    public static final By shaving=By.cssSelector("#navbarNavAltMarkup > ul > li:nth-child(5) > a");
    public static final By shavingandbeard=By.xpath("//div[text()='Shaving & Beard Care']");
}
