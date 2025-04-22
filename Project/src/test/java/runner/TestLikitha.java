package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.NykaaHelpPage;
import pages.NykaaSearchLipstick;
import pages.NykaaTonerPage;
import utils.Base;
import utils.Report;

public class TestLikitha extends Base{
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
     @Test
    public void nykaaTonerTest(){
      test=report.createTest("NykaaToner_Test");
      NykaaTonerPage nykaaTonerPage=new NykaaTonerPage(test);
      nykaaTonerPage.testTonerPage();
    }

    @Test
    public void nykaaHelpTest(){
      test=report.createTest("NykaaHelpPage");
      NykaaHelpPage helpPage=new NykaaHelpPage(test);
      helpPage.testHelpPage();
    }

    @Test
    public void nykaaLipsticksTest(){
      test=report.createTest("NykaaLipsticks");
      NykaaSearchLipstick searchLipstick=new NykaaSearchLipstick(test);
      searchLipstick.testNykaaLipsticks();
    }
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
