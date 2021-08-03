package seleniumintro.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScript_Alerts {

    WebDriver driver;

    @Test
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraph =  driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.isDisplayed());
    }

//    @Test
//    public void informationAlert()  {
//        WebElement jsAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
//        jsAlert.click();
//
//        Alert alerts = driver.switchTo().alert();
//        alerts.accept();
//        WebElement successMessage = driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));
//        String actualMessage = successMessage.getText();
//        String expectedMessage = "You successfuly clicked an alert";
//        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }



