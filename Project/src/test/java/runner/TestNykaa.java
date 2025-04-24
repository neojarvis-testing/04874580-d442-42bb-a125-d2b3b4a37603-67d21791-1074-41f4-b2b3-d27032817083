package runner;
 
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.NykaaCategoriesPage;
import pages.NykaaGetAppPage;
import pages.NykaaHelpPage;
import pages.NykaaKurtasPage;
import pages.NykaaLuxeHomePage;
import pages.NykaaManPage;
import pages.NykaaNewLaunches;
import pages.NykaaPillowPage;
import pages.NykaaSearchLipstick;
import pages.NykaaTonerPage;
import utils.Base;
import utils.Report;
import utils.SendEmailWithAttachment;
 
public class TestNykaa extends Base{
     ExtentReports reports;
     ExtentTest test;
 
 
    /*Method Name: report
      Author Name: Group 07
      Description: This method opens the browser and navigate to the URL
      Parameter: None
      Return Type: void
     */
    @BeforeClass
    public void report(){
        reports= Report.generateExtenteReports("NYKAA Report");
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
      Description: It automates the process of searching for a pillow on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */

   @Test(enabled = true, priority = 1 )
    public void NykaaSearchForPillow_Test(){
      test = reports.createTest("NykaaSearchForPillow Test");
      NykaaPillowPage nykaaSearchForPillow = new NykaaPillowPage(test);
      nykaaSearchForPillow.testnykaaPillowpage();
    }
 
    /*Method Name: NykaaKurtas_Test
      Author Name: Group 07
      Description: It automates the process of searching for kurtas on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
    @Test(enabled = true, priority = 2)
    public void NykaaKurtas_Test(){
      test = reports.createTest("NykaaKurtas Test");
      NykaaKurtasPage nykaasKurtas = new NykaaKurtasPage(test);
      nykaasKurtas.testNykaaKurtasPage();
    }
 
    /*Method Name: NykaaNewLaunches_Test
      Author Name: Group 07
      Description: It automates the process of searching for new launches on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
    @Test(enabled = true, priority = 3)
    public void NykaaNewLaunches_Test(){
      test = reports.createTest("NykaaNewLaunches Test");
      NykaaNewLaunches nykaaNewLaunches = new NykaaNewLaunches(test);
      nykaaNewLaunches.testNykaaNewLaunchespage();
    }
 
     /*Method Name: nykaaTonerTest
      Author Name: Group 07
      Description: It automates the process of searching for toners on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
     @Test(enabled = true, priority = 4)
    public void nykaaTonerTest(){
      test=reports.createTest("NykaaToner Test");
      NykaaTonerPage nykaaTonerPage=new NykaaTonerPage(test);
      nykaaTonerPage.testTonerPage();
    }
 
     /*Method Name: nykaaHelpTest
      Author Name: Group 07
      Description: It automates the process of searching for queries and answers using get help page  on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
    @Test(enabled = true, priority = 5)
    public void nykaaHelpTest(){
      test=reports.createTest("NykaaHelpPage");
      NykaaHelpPage helpPage=new NykaaHelpPage(test);
      helpPage.testHelpPage();
    }
 
     /*Method Name: nykaaLipsticksTest
      Author Name: Group 07
      Description: It automates the process of searching for lipsticks on Nykaa and logs the test execution..
      Parameter: None
      Return Type: void
     */
    @Test(enabled = true, priority = 6)
    public void nykaaLipsticksTest(){
      test=reports.createTest("NykaaLipsticks");
      NykaaSearchLipstick searchLipstick=new NykaaSearchLipstick(test);
      searchLipstick.testNykaaLipsticks();
    }
 
    /*Method Name: close
      Author Name: Group 07
      Description: This method terminates the WebDriver session, effectively closing the VNC connection.
      Parameter: None
      Return Type: void
     */

    @Test(enabled = true, priority = 1)
    public void nykaaaLuxe(){
      test=reports.createTest("Luxe");
      NykaaLuxeHomePage nykaaLuxeHomePage=new NykaaLuxeHomePage(test);
      nykaaLuxeHomePage.nykaaLuxeCase();
    }
 
     /*
     * A. Method Name: NykaaGetAppTestCase
     * B. Author Name: Group 07
     * C. Description: This method displays the functionality of the Nykaa GetApp Page.
     * D. Parameters: None
     * E. Return Type: void
     */
   @Test(enabled = true, priority = 7)
    public void NykaaGetAppTestCase()
    {
      test = reports.createTest("NykaaGetApp TestCase");
      NykaaGetAppPage getApp = new NykaaGetAppPage(test);
      getApp.execute();
    }
 
    /*
     * A. Method Name: NykaaCategoriesTestCase
     * B. Author Name: Group 07
     * C. Description: This method displays the functionality of the Nykaa Categories Page.
     * D. Parameters: None
     * E. Return Type: void
     */
    @Test(enabled = true, priority = 8)
    public void NykaaCategoriesTestCase()
    {
      test = reports.createTest("NykaaCategories TestCase");
      NykaaCategoriesPage categories = new NykaaCategoriesPage(test);
      categories.execute();
    }
   
 
    /*
     * A. Method Name: NykaaManPageTestCase
     * B. Author Name: Group 07
     * C. Description: This method displays the functionality of the Nykaa Man Page.
     * D. Parameters: None
     * E. Return Type: void
     */
    @Test(enabled = true, priority = 10)
    public void NykaaManPageTestCase()
    {
      test = reports.createTest("NykaaManPage TestCase");
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
    public void flushreports() {
        reports.flush();
        try {
          SendEmailWithAttachment.sendEmailWithAttachment("likithareddy177@gmail.com","likithareddy177@gmail.com","Automation testing on Nykaa Website","please find attachment");
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}