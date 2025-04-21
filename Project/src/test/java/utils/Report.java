package utils;

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
}
