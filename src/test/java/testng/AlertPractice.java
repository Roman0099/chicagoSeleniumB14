package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void warningAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();
    }

    @Test(dependsOnMethods = "warningAlert")
    public void promptAlert() throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Alert thirdAlert = driver.switchTo().alert();
        thirdAlert.sendKeys("This is test");
        Thread.sleep(Long.parseLong("2000"));
        thirdAlert.accept();
    }
}
