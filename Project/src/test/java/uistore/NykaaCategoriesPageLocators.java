package uistore;

import org.openqa.selenium.By;

public class NykaaCategoriesPageLocators {
    private NykaaCategoriesPageLocators(){}
    public static final By categories = By.id("category");
    public static final By searchBar = By.cssSelector("input[name = 'search-suggestions-nykaa']");
    public static final By kajal = By.cssSelector("h1.css-c0pzm0");
    public static final By formulation = By.xpath("//div[@class = 'filter-open css-1gdff5r']/span[text() = 'Formulation']");
    public static final By pencil = By.xpath("//span[text() = 'Pencil']");
    public static final By fragrance = By.xpath("//a[text() = 'fragrance']");
    public static final By launches = By.xpath("//a[@href = '/fragrance/new-launches/c/187?ptype=lst&id=187&root=nav_3&dir=desc&order=popularity']");
    public static final By firstProduct = By.xpath("//div[text() = 'Skinn By Titan Discovery Set For Her - Pack Of 5']");
    public static final By addToBag = By.cssSelector(".css-13zjqg6 .btn-text");
    public static final By howToUse = By.xpath("//h3[text() = 'How To Use']");
    public static final By customerViewed = By.cssSelector(".css-zpu9mn .css-1jg8woj");
}
