
package glue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
import pages.Homepage;
import runner.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class GilletteTests {
    private WebDriver driver;
    ExtentReports reporter;
    ExtentSparkReporter sparkReporter;
    Homepage homePage = new Homepage();
    Base base = new Base();
    Logger log = LoggerHandler.log;
    Homepage homepage = new Homepage();

    @Before
    public void setUp() throws MalformedURLException {
        // Set up ChromeDriver path
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create ChromeDriver instance
        // driver = new ChromeDriver();
       // driver = base.openBrowser();
        
       // driver.manage().window().maximize();
        //reporter = Reporter.generateExtentReport();
    }
    
    @Given("^the user navigates to JavaTpoint.com$")
    public void the_user_navigates_to_JavaTpoint_com() {
        System.out.println("User navigates to JavaTpoint.com");
        // Add actual code to simulate user navigation
    }

    @When("^the user clicks on Feedback, then the Feedback page opens$")
    public void the_user_clicks_on_Feedback_then_the_Feedback_page_opens() {
        System.out.println("User clicks on Feedback, Feedback page opens");
        
    }

    @When("^the user submits feedback message$")
    public void the_user_submits_feedback_message() {
        System.out.println("User submits feedback message");
        
    }

    @Then("^feedback should be received on the admin page$")
    public void feedback_should_be_received_on_the_admin_page() {
        System.out.println("Feedback received on admin page");
        
    }

    @Then("^admin can reply to the user$")
    public void admin_can_reply_to_the_user() {
        System.out.println("Admin replies to the user");
      
    }
    @After
    public void tearDown() {
        driver.quit();
        reporter.flush();
    }
}
