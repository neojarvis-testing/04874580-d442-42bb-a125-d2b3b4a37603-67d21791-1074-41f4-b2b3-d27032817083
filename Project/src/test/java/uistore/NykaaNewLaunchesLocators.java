package uistore;

import org.openqa.selenium.By;

public class NykaaNewLaunchesLocators {
    public static By newLaunches = By.cssSelector("a[href='/shop-new-launches/c/53665?utm_source=Desktop_web_footer']");
    public static By shopNewLaunches = By.cssSelector("h1[class='css-c0pzm0']");
    public static By natural = By.cssSelector("a[href='https://www.nykaa.com/sp/natural-native/natural?root=nav_1']");
    public static By faceWash = By.cssSelector("a[href='/natural/skin/face-wash/c/9566?root=nav_3&dir=desc&order=popularity']");
    public static By facewashHeading = By.cssSelector("h1[class='css-c0pzm0']");
    public static By price = By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]");
    public static By priceRange = By.cssSelector("label[for='checkbox_Rs. 1000 - Rs. 1999_1000-1999']");
    public static By firstProduct = By.xpath("//a[@href='/lotus-botanicals-vitamin-c-day-night-combo/p/2690647?productId=2690647&pps=1']");
    public static By delivery = By.cssSelector("input[name='pin code']");
    public static By check = By.cssSelector("button[class='css-1ivth7r']");
    public static By addtoBag = By.xpath("(//button[@class=' css-13zjqg6'])[1]");
    public static By cart = By.cssSelector("button[id='header-bag-icon']");
    public static By bag = By.cssSelector("div[class='header-layout css-z4s1v9 e13w5ra50']");
    public static By iframe = By.cssSelector("iframe[src='/mobileCartIframe?ptype=customIframeCart']");
}
