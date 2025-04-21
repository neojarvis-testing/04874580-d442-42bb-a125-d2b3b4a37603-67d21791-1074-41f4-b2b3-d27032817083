package uistore;

import org.openqa.selenium.By;

public class NykaaSearchForPillowLocators {
    public static By searchBar = By.cssSelector("input[name='search-suggestions-nykaa']");
    public static By pillowHeading = By.cssSelector("div > h1");
    public static By price = By.xpath("(//div[@class='css-w2222k']//div[@class='filter-open css-1gdff5r'])[2]");
    public static By priceRange = By.xpath("//div[@class='control-value']/span[text()='Rs. 1000 - Rs. 1999']");
    public static By discount = By.xpath("//span[text()='Discount']");
    public static By discountRange = By.xpath("(//div[@class='control-value'])[8]");
    public static By averageCustomerRating = By.xpath("//span[text()='Avg Customer Rating']");
    public static By fourStarRating = By.xpath("//span[text()='4 stars & above']");
    public static By filtersApplied = By.xpath("//span[text()='Filters Applied']");
    public static By firstProduct = By.cssSelector("a[href='/sleepsia-full-body-pillow-ultra-soft-fiber-bed-pillows-for-side-and-back-sleepers/p/7745834?productId=7745834&pps=1']");
    public static By addToBag = By.cssSelector("div[class='css-vp18r8']>button[type='button']");
    public static By cart = By.cssSelector("button[id='header-bag-icon']");
    public static By bag = By.cssSelector("div[class='mob-header-layout css-e2nzen esabwed0']");
}
