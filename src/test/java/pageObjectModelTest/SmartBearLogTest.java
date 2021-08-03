package pageObjectModelTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.SmaBear_pages.LogPage;
import utilities.Config;
import utilities.Driver;

public class SmartBearLogTest {
    LogPage logPage = new LogPage();

    @BeforeMethod
    public void setUp() {

        Driver.getDriver().get(Config.getProperty("smartbearUrl"));
    }

    @Test
    public void wrongUserName(){
     logPage.username.sendKeys(Config.getProperty("wrongUsername"));
     logPage.password.sendKeys(Config.getProperty("correctPassword"));
     logPage.LogButton.click();
     Assert.assertTrue(logPage.errorMessage.isDisplayed(), "Error message is not displayed!");

    }
  @Test
    public void wrongPassword(){
        logPage.username.sendKeys(Config.getProperty("correctUsername"));
        logPage.password.sendKeys(Config.getProperty("wrongPassword"));
        logPage.LogButton.click();
        Assert.assertTrue(logPage.errorMessage.isDisplayed(), "Error message is not displayed!");
    }

}
