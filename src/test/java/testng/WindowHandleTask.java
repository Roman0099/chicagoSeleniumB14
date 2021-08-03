package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandleTask {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void windowHandle(){
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Verification failed");
        WebElement clickHereText = driver.findElement(By.linkText("Click Here"));
        driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
        }


    }


}
