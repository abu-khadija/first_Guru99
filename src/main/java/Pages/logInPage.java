package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInPage extends pageBase{
    public logInPage(WebDriver driver) {super(driver);}

    private final By username = By.name("uid");
    private final By password = By.name("password");
    private final By LoginButton = By.name("btnLogin");


    public void login(){
        driver.findElement(username).sendKeys("mngr485368");
        driver.findElement(password).sendKeys("emasabE");
        driver.findElement(LoginButton).click();
    }
}
