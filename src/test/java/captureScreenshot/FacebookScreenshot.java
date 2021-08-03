package captureScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ScreenShotUtil;

import javax.swing.text.Utilities;
import java.io.File;
import java.io.IOException;

public class FacebookScreenshot {

    @Test
    public void captureScreenShot() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http://www.facebook.com"));
        ScreenShotUtil.captureScreenShot(driver,"browserStarted");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("learn automation");
        ScreenShotUtil.captureScreenShot(driver,"userLoginPage");
        driver.quit();

    }

}
