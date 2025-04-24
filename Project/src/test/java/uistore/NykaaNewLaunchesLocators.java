package uistore;

import org.openqa.selenium.By;

public class NykaaNewLaunchesLocators {
    private NykaaNewLaunchesLocators(){}
    public static final By newLaunches = By.cssSelector("a[href='/shop-new-launches/c/53665?utm_source=Desktop_web_footer']");
    public static final By shopNewLaunches = By.cssSelector("h1[class='css-c0pzm0']");
    public static final By natural = By.xpath("//a[text()='Natural']");
    public static final By faceWash = By.cssSelector("a[href='/natural/skin/face-wash/c/9566?root=nav_3&dir=desc&order=popularity']");
    public static final By facewashHeading = By.cssSelector("h1[class='css-c0pzm0']");
    public static final By price = By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]");
    public static final By priceRange = By.cssSelector("label[for='checkbox_Rs. 1000 - Rs. 1999_1000-1999']");
    public static final By firstProduct = By.xpath("(//div[@class='css-1rd7vky'])[1]");
    public static final By delivery = By.cssSelector("input[name='pin code']");
    public static final By check = By.cssSelector("button[class='css-1ivth7r']");
    public static final By addtoBag = By.xpath("(//button[@class=' css-13zjqg6'])[1]");
    public static final By cart = By.cssSelector("button[id='header-bag-icon']");
    public static final By bag = By.cssSelector("div[class='header-layout css-z4s1v9 e13w5ra50']");
    public static final By iframe = By.cssSelector("iframe[src='/mobileCartIframe?ptype=customIframeCart']");
}
