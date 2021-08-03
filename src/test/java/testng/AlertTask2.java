package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTask2 {
    WebDriver driver;
    @Test
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void informationAlert(){
       WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
       infoAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();
        WebElement resultTask = driver.findElement(By.id("result"));
        String expectedText = "you clicked ok";
        String actualText = resultTask.getText();
        Assert.assertEquals(actualText,expectedText,"Texts are not matching , Assertion is failed!");



    }
    }

