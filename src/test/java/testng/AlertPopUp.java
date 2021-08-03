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

public class AlertPopUp {
    WebDriver driver;
    @Test
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
    }
    @Test
    public void signIn(){
       WebElement signIn =  driver.findElement(By.xpath("//a[@class='signin']"));
       signIn.click();
       WebElement signInButton =  driver.findElement(By.xpath("//input[@value='Sign in']"));
       signInButton.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();//will click on ok btn
        String expectedMessage = "Please enter a valid user name";
        String actualMessage = driver.getTitle();
        Assert.assertEquals(expectedMessage, actualMessage, "Texts are not matching, Assertion failed!");



    }


}
