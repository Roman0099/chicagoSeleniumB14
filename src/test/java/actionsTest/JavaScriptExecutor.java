package actionsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void jse1(){
        driver.get("http://practice.cybertekschool.com");
        //javascript executor object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse will execute the command we pass in the string
        jse.executeScript("alert('I am an alert box!');");

    }
    @Test
    public void scroll() throws  InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        Thread.sleep(4000);
        for (int i = 0; i < 5; i++) {
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            Thread.sleep(1000);
        }
    }
       @Test
        public void scrollToElement() throws  InterruptedException{
           JavascriptExecutor jse = (JavascriptExecutor)driver;
           driver.get("http://practice.cybertekschool.com/large");
           WebElement link = driver.findElement(By.linkText("Cybertek School"));
           Thread.sleep(1000);
           //execute script is overloaded method and can take string and webelement params
           jse.executeScript("arguments[0].scrollIntoView(true)", link);
    }
    @Test
    public void click() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://practice.cybertekschool.com/large");
        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(1000);
        //execute script is overloaded method and can take string and webelement params
        jse.executeScript("arguments[0].click()", link);
    }
    @Test
    public void type() throws  InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        Thread.sleep(1000);
        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));
        String string = "something cool";
        jse.executeScript("arguments[0].setAttribute('value','"+string+"')", input);


    }
}
