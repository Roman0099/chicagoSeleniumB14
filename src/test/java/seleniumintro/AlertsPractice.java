package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractice {
    WebDriver driver;
        @BeforeClass
                public  void setUP(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void alertPopUP(){
            WebElement jsButtonAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
            jsButtonAlert.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement resultText = driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));
            String expectedText = "You successfuly clicked an alert";
            String actualText = resultText.getText();
            Assert.assertEquals(actualText,expectedText, "Texts are not matching! Assertion failed!");
        }
        @Test
    public void informationAlert(){
            WebElement jsConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            jsConfirmButton.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement resultText = driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
            String expectedText1 = "You clicked: Ok";
            String actualText1 = resultText.getText();
            Assert.assertEquals(expectedText1,actualText1, "Texts are not matching! Assertion failed!");
            WebElement jsConfirmButton1 = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            jsConfirmButton.click();
            alert.dismiss();
            WebElement text = driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));
            String expected = "You clicked: Cancel";
            String actual = text.getText();
            Assert.assertEquals(actual,expected, "Texts are not matching! Assertion failed!");


        }
        @Test
    public void promptAlert(){
            WebElement promptText = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
            promptText.click();
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Test test");
            alert.accept();
            WebElement prompt = driver.findElement(By.xpath("//p[.='You entered: Test test']"));
            String expectedPromptMessage = "You entered: Test test";
            String actualPromptMessage = prompt.getText();
            Assert.assertEquals(expectedPromptMessage,actualPromptMessage, "Texts are not matching! Assertion failed!");

        }
}
