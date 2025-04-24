package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.google.common.io.Files;
public class Screenshot extends Base {
 
    /*Method Name: captureFullScreenshot
      Author Name:  Group 07
      Description:  This method captures a full screenshot of the current state of the web driver and saves it with a timestamped filename in the 'screenshots' directory
      Parameter: String Filename
      Return Type: void
     */
 
    public static void captureFullScreenshot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error(e.getMessage());
        }
    }
 
     /*Method Name: captureHighlightedElementScreenshot
      Author Name: Group 07
      Description: This method captures a full screenshot of the page when the element is temporarily highlighting it with red border
      Parameter: xpath, String Filename
      Return Type: void
     */
 
    public static void captureHighlightedElementScreenshot(By xpath, String filename) {
        WebElement element = driver.findElement(xpath);
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        // To Highlight the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error(e.getMessage());
        } finally {
            // To Remove the highlight
            js.executeScript("arguments[0].style.border=''", element);
        }
    }
 
     /*Method Name: captureElementOnlyScreenshot
      Author Name: Group 07
      Description: This method captures a screenshot of a specific web element
      Parameter: xpath, String Filename
      Return Type: void
     */
 
    public static void captureElementOnlyScreenshot(By xpath, String filename) {
        WebElement element = driver.findElement(xpath);
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        File file = element.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error(e.getMessage());
        }
    }
}