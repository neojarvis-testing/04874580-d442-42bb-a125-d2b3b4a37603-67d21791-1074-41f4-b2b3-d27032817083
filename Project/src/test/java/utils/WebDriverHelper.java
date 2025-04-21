package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    public static WebDriver driver;
    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }
public void dowaitForElementToBeVisible(By locator, int timeoutInSeconds) {
    try {
       new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
               .until(ExpectedConditions.visibilityOfElementLocated(locator));
    } catch (Exception e) {
           e.printStackTrace();
    }
}
public void doClick(By locator){
    try {
         driver.findElement(locator);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void doSendKeyss(By locator,String message) {
	try {
		driver.findElement(locator).sendKeys(message);
	}catch(Exception e){
		e.printStackTrace();
	}
}
public void doEnterAction(By locator) {
	try {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}catch(Exception e){
		e.printStackTrace();
	}
}
public void doClickandswitch(By locator){
	try {
		String parent=driver.getWindowHandle();
	    doClick(locator);
	    Set<String> set=driver.getWindowHandles();
	    for(String child:set) {
		if(!child.equals(parent)) {
			driver.switchTo().window(child);
		  }
	   }
    }catch(Exception e){
	    e.printStackTrace();
    }
}
public void doSelectfromDropdown(By locator,String message) {
	try{
		WebElement element= driver.findElement(locator);
	    Select select= new Select(element);
	    select.selectByVisibleText(message);
    }catch(Exception e){
	    e.printStackTrace();
    }
}
public void doHoverOnElement(By locator){
	try{
		WebElement element=driver.findElement(locator);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}catch(Exception e){
	    e.printStackTrace();
    }
}
public List<WebElement> getAllElementsBylocator(String locator){
	     return driver.findElements(By.xpath(locator));	
}
public void doMouseClick(By locator){
	try{
		WebElement element=driver.findElement(locator);
		Actions action=new Actions(driver);
		action.click(element).build().perform();
	}catch(Exception e){
	    e.printStackTrace();
    }
}
public void doScrollBypixel(int x,int y){
	try{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(arguments[0],arguments[1]);",x,y);
	}catch(Exception e){
	    e.printStackTrace();
    }
}
public void doJsCLick(By locator){
	try {
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement element=driver.findElement(locator);
	    js.executeScript("arguments[0].click();",element);
	}catch(Exception e){
	    e.printStackTrace();
    }
}
public void doJsscrollIntoView(By locator){
    try {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();",element);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void doJsScrollFooter() {
    try {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    } catch (Exception e) {
      e.printStackTrace();
    }
}
public String doGetText(By locator){
    return driver.findElement(locator).getText();
}
public void doNavigate(){
    driver.navigate().back();
}
}