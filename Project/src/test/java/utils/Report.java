package utils;
 
 
import java.io.File;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class Report extends Base {
    private static ExtentReports extentReport;
    private static ExtentSparkReporter extentSparkReporter;
 
    public static ExtentReports generateReport() {
        return generateReport("TEST REPORT");
    }
    public static ExtentReports generateReport(String reportName) {
        if (extentReport == null) {
            extentReport = createExtentReport(reportName);
        }
        return extentReport;
    }
    private static ExtentReports createExtentReport(String reportName) {
        if (extentReport == null) {
            String reportsPath = System.getProperty("user.dir") + "/reports/";
            String report = reportsPath + reportName + ".html"; // Correct path
            File reportsDir = new File(reportsPath);
            if (!reportsDir.exists()) {
                reportsDir.mkdirs();
            }
            extentSparkReporter = new ExtentSparkReporter(report); // Use correct file path
            extentReport = new ExtentReports();
            extentReport.attachReporter(extentSparkReporter);
        }
        return extentReport;
    }
    public static String takeScreenshotAsBase64() {
        String base64String = "";
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
            base64String = Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return base64String;
    }
    public static void attachScreenshotToReport(String reportName, ExtentTest test, String description) {
        try {
            String base64Screenshot = takeScreenshotAsBase64();
            if (!base64Screenshot.isEmpty()) {
                test.info(description, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } else {
                test.log(Status.FAIL, "Screenshot capture failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}