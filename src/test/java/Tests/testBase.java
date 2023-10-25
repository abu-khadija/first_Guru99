package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class testBase {
    public static WebDriver driver;


    @BeforeSuite
    public void OpenBrowser(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterSuite
    public void CloseDriver(){
        driver.quit();
    }
}
