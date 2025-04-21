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
	/*
	 * a.Method Name:dowaitForElementToBeVisible
	 * b.Author Name:Group 07
	 * c.Description: The method waits for the element to be visible .
	 * d.Parameter:By locator,int timeoutIntSeconds
	 * e.Return type:void
	 */
	public void dowaitForElementToBeVisible(By locator, int timeoutInSeconds) {
		try {
		new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doClick
		* b.Author Name:Group 07
		* c.Description: The method finds the element using locator and clicks on it .
		* d.Parameter:By locator
		* e.Return type:void
		*/
	public void doClick(By locator){
		try {
			driver.findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doSendKeys
		* b.Author Name:Group 07
		* c.Description: The method finds  element using the provided locator and sends the specified message to it.
		* d.Parameter:By locator,String message
		* e.Return type:void
		*/
	public void doSendKeys(By locator,String message) {
		try {
			driver.findElement(locator).sendKeys(message);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doEnterAction
		* b.Author Name:Group 07
		* c.Description: The method finds element using the provided locator and sends the ENTER key to it 
		* d.Parameter:By locator
		* e.Return type:void
		*/
	public void doEnterAction(By locator) {
		try {
			driver.findElement(locator).sendKeys(Keys.ENTER);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doClickandswitch
		* b.Author Name:Group 07
		* c.Description: The method Clicks on an element and switches to the newly opened window
		* d.Parameters:By locator
		* e.Return type:void
		*/
	public void doClickandswitch(By locator){
		try {
			String parent=driver.getWindowHandle();
			doClick(locator);
			Set<String> set=driver.getWindowHandles();
			for(String child:set) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				break;
			}
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doSelectfromDropdown
		* b.Author Name:Group 07
		* c.Description: The method finds a dropdown element using the provided locator and selects an option by its visible text
		* d.Parameters:By locator,String message
		* e.Return type:void
		*/
	public void doSelectfromDropdown(By locator,String message) {
		try{
			WebElement element= driver.findElement(locator);
			Select select= new Select(element);
			select.selectByVisibleText(message);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name: doHoverOnElement
		* b.Author Name:Group 07
		* c.Description: The method finds a element using the provided locator and hovers over it using Actions class
		* d.Parameters:By locator
		* e.Return type:void
		*/
	public void doHoverOnElement(By locator){
		try{
			WebElement element=driver.findElement(locator);
			Actions action=new Actions(driver);
			action.moveToElement(element).build().perform();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doMouseClick
		* b.Author Name:Group 07
		* c.Description: The method  finds a element using the provided locator and clicks on  it using Actions class
		* d.Parameters:By locator
		* e.Return type:void
		*/
	public void doMouseClick(By locator){
		try{
			WebElement element=driver.findElement(locator);
			Actions action=new Actions(driver);
			action.click(element).build().perform();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:getAllElementsByXpath
		* b.Author Name:Group 07
		* c.Description: The method finds all elements matching the provided XPath expression and returns them as a list
		* d.Parameters:String xpath
		* e.Return type:list
		*/
	public List<WebElement> getAllElementsByXpath(String xpath){
		return driver.findElements(By.xpath(xpath));	
	}
		/*
		* a.Method Name:doScrollBypixel
		* b.Author Name:Group 07
		* c.Description: The method scrolls the window by the specified number of pixels along the x and y axes using JavaScript
		* d.Parameters:int x,int y
		* e.Return type:void
		*/
	public void doScrollBypixel(int x,int y){
		try{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(arguments[0],arguments[1]);",x,y);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doJsCLick
		* b.Author Name:Group 07
		* c.Description: The method finds a web element using the provided locator and performs a click action on it using JavaScript
		* d.Parameters:By locator
		* e.Return type:void
		*/
	public void doJsCLick(By locator){
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element=driver.findElement(locator);
			js.executeScript("arguments[0].click();",element);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doJsscrollIntoView
		* b.Author Name:Group 07
		* c.Description: The method finds a  element using the provided locator and scrolls it into view using JavaScript.
		* d.Parameters:By locator
		* e.Return type:void
		*/
	public void doJsscrollIntoView(By locator){
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element=driver.findElement(locator);
			js.executeScript("arguments[0].scrollIntoView();",element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doJsScrollFooter
		* b.Author Name:Group 07
		* c.Description: The method scrolls to the bottom of the page using JavaScript.
		* d.Parameters:None
		* e.Return type:void
		*/
	public void doJsScrollFooter() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
		/*
		* a.Method Name:doGetText
		* b.Author Name:Group 07
		* c.Description: The method finds a  element using the provided locator and returns its text content.
		* d.Parameters:By locator
		* e.Return type:String
		*/
	public String doGetText(By locator){
		return driver.findElement(locator).getText();
	}
		/*
		* a.Method Name:doNavigate
		* b.Author Name:Group 07
		* c.Description: The method navigates the browser back to the previous page.
		* d.Parameters:None
		* e.Return type:void
		*/
	public void doNavigate(){
		driver.navigate().back();
	}
}