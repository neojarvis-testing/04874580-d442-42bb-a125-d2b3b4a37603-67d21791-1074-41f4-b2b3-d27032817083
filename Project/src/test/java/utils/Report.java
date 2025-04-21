package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
    public static ExtentTest test;
    public static ExtentReports reports;

    public static ExtentReports generateExtenteReports(String reportName){
        ExtentSparkReporter sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports"+reportName+".html");
        reports= new ExtentReports();
        reports.attachReporter(sparkReporter);
        return reports;
    }
    public static void addScreenshotToReport(ExtentTest test, WebDriver driver, String message) {
        try {
            TakesScreenshot ts=(TakesScreenshot)Base.driver;
	    	File source=ts.getScreenshotAs(OutputType.FILE);
            String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + ".png";
            File destFile = new File(screenshotPath);
            FileUtils.copyFile(source,destFile);
            test.addScreenCaptureFromPath(screenshotPath);
        } catch (Exception e) {
            e.printStackTrace();
            test.fail("Failed to capture screenshot: " + e.getMessage());
        }
}
}
