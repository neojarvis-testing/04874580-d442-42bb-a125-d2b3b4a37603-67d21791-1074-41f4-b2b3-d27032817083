package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

// public class Report {
//     public static ExtentTest test;
//     public static ExtentReports reports;

//     /**
//      * Method Name: generateExtenteReports
//      * 
//      * Description: Creates and initializes an ExtentReports instance with ExtentSparkReporter for generating HTML reports.
//      * 
//      * Parameters:
//      * String reportName - Name of the report file (without extension) to be generated in the "/reports" directory.
//      * 
//      * Return Type: ExtentReports - Returns the configured ExtentReports instance.
//      */
//     public static ExtentReports generateExtenteReports(String reportName){
//         ExtentSparkReporter sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+reportName+".html");
//         reports= new ExtentReports();
//         reports.attachReporter(sparkReporter);
//         return reports;
//     }

//     /**
//      * Method Name: addScreenshotToReport
//      * 
//      * Description: Captures a screenshot and adds it to the provided test report.
//      * 
//      * Parameters:
//      * ExtentTest test - ExtentTest instance where the screenshot will be attached.
//      * WebDriver driver - WebDriver instance used for capturing the screenshot.
//      * String message - Message describing the screenshot or context.
//      * 
//      * Return Type: void - This method does not return any value.
//      */
//     // public static void addScreenshotToReport(ExtentTest test, WebDriver driver, String message) {
//     //     try {
//     //         TakesScreenshot ts=(TakesScreenshot)Base.driver;
// 	//     	File source=ts.getScreenshotAs(OutputType.FILE);
//     //         String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + ".png";
//     //         File destFile = new File(screenshotPath);
//     //         FileUtils.copyFile(source,destFile);
//     //         test.addScreenCaptureFromPath(screenshotPath);
//     //     } catch (Exception e) {
//     //         e.printStackTrace();
//     //         test.fail("Failed to capture screenshot: " + e.getMessage());
//     //     }
//     // }
   

// public static void addScreenshotToReport(ExtentTest test, WebDriver driver, String message) {
//     // try {
//     //     TakesScreenshot ts = (TakesScreenshot) driver;
//     //     File source = ts.getScreenshotAs(OutputType.FILE);
        
//     //     // Generate dynamic file name using timestamp
//     //     String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//     //     String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + timestamp + ".png";
//     //     File destFile = new File(screenshotPath);
        
//     //     FileUtils.copyFile(source, destFile);
//     //     test.addScreenCaptureFromPath(screenshotPath).info(message);
        
//     // } catch (Exception e) {
//     //     e.printStackTrace();
//     //     test.fail("Failed to capture screenshot: " + e.getMessage());
//     // }

//     try {
//         TakesScreenshot ts = (TakesScreenshot) driver;
//         File source = ts.getScreenshotAs(OutputType.FILE);

//         // Generate dynamic file name using timestamp
//         String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//         String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + timestamp + ".png";
//         File destFile = new File(screenshotPath);

//         FileUtils.copyFile(source, destFile);

//         // Attach screenshot using MediaEntityBuilder
//         test.info(message, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

//     } catch (Exception e) {
//         e.printStackTrace();
//         test.fail("Failed to capture screenshot: " + e.getMessage());
//     }
// }
// }
public class Report{
    public static FileInputStream fip;
    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentSparkReporter spark;
    public static TakesScreenshot ts;
 
    public static ExtentReports generateReport(String name) {
        String path = System.getProperty("user.dir")+"/reports/"+name+".html";
        File file = new File(path);
 
        report = new ExtentReports();
        spark = new ExtentSparkReporter(file);
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
        return report;
    }
	public static String captureScreenShot(String filename) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + timestamp + ".png";
            String destPath =  "./"+name;
 
			ts = (TakesScreenshot)Base.driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
 
            File screenDir = new File(System.getProperty("user.dir") + "/reports/screenShots");          
            if (!screenDir.exists()) {
                screenDir.mkdirs();
            }
		    File target = new File(screenDir, name);
 
			Files.copy(file, target);
            return destPath;
		} catch (IOException e) {
			e.printStackTrace();
		}
        return "";
	}
 
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description){
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
