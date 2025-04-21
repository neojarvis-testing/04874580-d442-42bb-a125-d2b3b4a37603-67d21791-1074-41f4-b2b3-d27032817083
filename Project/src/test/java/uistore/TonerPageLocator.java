package uistore;

import org.openqa.selenium.By;

public class TonerPageLocator {
    public static By searchBar=By.cssSelector("input[placeholder='Search on Nykaa']");
    public static By toner=By.id("title .css-c0pzm0");
    public static By sortBy=By.className("css-1aucgde");
    public static By newArrivals=By.xpath("//span[text()='new arrivals']");
    public static By rate=By.xpath("//span[text()='4 stars & above']");
    public static By avgRate=By.xpath("//span[text()='Avg Customer Rating']");
    public static By firstProduct=By.xpath("//div[text()='Biodance Collagen Gel Toner Pad']");
    public static By inclusiveTax=By.cssSelector(".css-1c4feqy");
    public static By addToBag=By.cssSelector(".css-vp18r8 .css-13zjqg6");
    public static By desc=By.xpath("//h3[text()='Description']");
    public static By ingredients=By.xpath("//h3[text()='Ingredients']");
    public static By readMore=By.xpath("//span[contains(text(),'Read')]");
}
