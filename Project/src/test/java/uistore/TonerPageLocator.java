package uistore;

import org.openqa.selenium.By;

public class TonerPageLocator {
    private TonerPageLocator(){}
    public static final By searchBar=By.cssSelector("input[placeholder='Search on Nykaa']");
    public static final By toner=By.id("title .css-c0pzm0");
    public static final By sortBy=By.className("css-1aucgde");
    public static final By newArrivals=By.xpath("//span[text()='new arrivals']");
    public static final By rate=By.xpath("//span[text()='4 stars & above']");
    public static final By avgRate=By.xpath("//span[text()='Avg Customer Rating']");
    public static final By firstProduct=By.xpath("//div[text()='Biodance Collagen Gel Toner Pad']");
    public static final By inclusiveTax=By.cssSelector(".css-1c4feqy");
    public static final By addToBag=By.cssSelector(".css-vp18r8 .css-13zjqg6");
    public static final By description=By.xpath("//h3[text()='Description']");
    public static final By ingredients=By.xpath("//h3[text()='Ingredients']");
    public static final By readMore=By.xpath("//span[contains(text(),'Read')]");
}
