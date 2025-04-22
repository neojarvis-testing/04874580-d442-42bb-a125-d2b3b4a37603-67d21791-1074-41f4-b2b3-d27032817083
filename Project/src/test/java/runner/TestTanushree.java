package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.NykaaCategoriesPage;
import pages.NykaaGetAppPage;
import pages.NykaaManPage;
import utils.Base;
import utils.Report;

public class TestTanushree extends Base{
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
        report = Report.generateExtenteReports("NYKAA_Report");
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

    @Test
    public void NykaaGetAppTestCase()
    {
      test = report.createTest("NykaaGetApp_TestCase");
      NykaaGetAppPage getApp = new NykaaGetAppPage(test);
      getApp.execute();
    }
    @Test
    public void NykaaCategoriesTestCase()
    {
      test = report.createTest("NykaaCategories_TestCase");
      NykaaCategoriesPage categories = new NykaaCategoriesPage(test);
      categories.execute();
    }
    @Test
    public void NykaaManPageTestCase()
    {
      test = report.createTest("NykaaManPage_TestCase");
      NykaaManPage manPage = new NykaaManPage(test);
      manPage.execute();
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
