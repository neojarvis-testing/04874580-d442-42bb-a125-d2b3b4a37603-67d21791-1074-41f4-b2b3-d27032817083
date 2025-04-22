package utils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
 
public class Reporter {
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