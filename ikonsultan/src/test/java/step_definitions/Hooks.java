package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "D:/QA/ikonsultan/driver/chromedriver");

        webDriver = new ChromeDriver();
        webDriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }
}
