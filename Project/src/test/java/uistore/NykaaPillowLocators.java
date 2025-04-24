package uistore;

import org.openqa.selenium.By;

public class NykaaPillowLocators {
    private NykaaPillowLocators(){}
    public static final By searchBar = By.xpath("//input[@name='search-suggestions-nykaa']");
    public static final By pillowHeading = By.cssSelector("div > h1");
    public static final By price = By.xpath("(//div[@class='css-w2222k']//div[@class='filter-open css-1gdff5r'])[2]");
    public static final By priceRange = By.xpath("//div[@class='control-value']/span[text()='Rs. 1000 - Rs. 1999']");
    public static final By discount = By.xpath("//span[text()='Discount']");
    public static final By discountRange = By.xpath("(//div[@class='control-value'])[8]");
    public static final By averageCustomerRating = By.xpath("//span[text()='Avg Customer Rating']");
    public static final By fourStarRating = By.xpath("//span[text()='4 stars & above']");
    public static final By filtersApplied = By.xpath("//span[text()='Filters Applied']");
    public static final By firstProduct = By.cssSelector("a[href='/sleepsia-full-body-pillow-ultra-soft-fiber-bed-pillows-for-side-and-back-sleepers/p/7745834?productId=7745834&pps=1']");
    public static final By addToBag = By.cssSelector("div[class='css-vp18r8']>button[type='button']");
    public static final By cart = By.cssSelector("button[id='header-bag-icon']");
    public static final By bag = By.cssSelector("p[class='css-1v1x2g9 e171rb9k0']");
    public static final By iframe = By.cssSelector("iframe[src='/mobileCartIframe?ptype=customIframeCart']");
}
