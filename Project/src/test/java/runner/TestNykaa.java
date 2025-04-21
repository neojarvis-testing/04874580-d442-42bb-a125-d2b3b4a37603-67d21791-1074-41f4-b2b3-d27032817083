package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.NykaaSearchForPillow;
import utils.Base;
import utils.Report;

public class TestNykaa extends Base{
    public static ExtentReports report;
    public static ExtentTest test;


    /*Method Name: report
      Author Name: Group 07
      Description: This method opens the browser and navigate to the URL
      Parameter: None
      Return Type: void
     */
    @BeforeClass
    public void report(){
        report = Report.generateExtenteReports("Nykaa_Report");
    }

    /*Method Name: open
      Author Name: Group 07
      Description: This method opens the browser and navigate to the URL
      Parameter: None
      Return Type: void
     */
    @BeforeMethod
    public void open(){
        openBrowser();
        driver.navigate().refresh();
    }

    /*Method Name: NykaaSearchForPillow_Test
      Author Name: Group 07
      Description: it automates the process of searching for a pillow on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
    @Test
    public void NykaaSearchForPillow_Test(){
      test = report.createTest("NykaaSearchForPillow_Test");
      NykaaSearchForPillow nykaaSearchForPillow = new NykaaSearchForPillow(test);
      nykaaSearchForPillow.NykaaSearchForPillow_Case(); 
    }

    /*Method Name: close
      Author Name: Group 07
      Description: This method terminates the WebDriver session, effectively closing the VNC connection.
      Parameter: None
      Return Type: void
     */
    @AfterMethod
    public void close(){
        driver.quit();
    }


    /*Method Name: flush
      Author Name: Group 07
      Description: This method ensures the test report is flushed and finalized after all test methods in the class have executed.
      Parameter: None
      Return Type: void
     */
    @AfterClass
    public void flush(){
        report.flush();
    }
}
