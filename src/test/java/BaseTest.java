import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setup_initiateDrier() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/products");
    }
    @AfterMethod
    public void a_takeScreenshotForFailedTests(ITestResult result) {
        String destination = "./screenshots/" + result.getName() + ".png";
        if (result.getStatus() == ITestResult.FAILURE) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File(destination));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @AfterMethod
    public void z_quitDriver() {
        driver.quit();


    }
}
