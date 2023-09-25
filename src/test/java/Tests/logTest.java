package Tests;

import Pages.logInPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logTest extends testBase{

    @Test
    public void Login(){
        logInPage login;
        login = new logInPage(driver);

        login.login();


        //assertion
        String expectedResult = "Welcome To Manager's Page of Guru99 Bank";
        String actualResult = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
