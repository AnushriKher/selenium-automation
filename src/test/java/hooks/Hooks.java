package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    public static String registeredEmail;
    public static String registeredPassword;

    @Before
    public void setUp() {
        initializeDriver();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed() || !scenario.isFailed()) { // always take
            byte[] screenshot = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Step Screenshot");
        }
    }


    @After
    public void tearDown() {
        quitDriver();
    } 

}
