package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TechlisticLinksAutomation {
    @Test
    public static void menuLinks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/");

            WebElement javaLink = driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[2]/a"));
            javaLink.click();
            String expectedJavaTitle = "Java Tutorial For Beginners - Techlistic";
            String actualJavaTitle = driver.getTitle();
        if(expectedJavaTitle.equals(actualJavaTitle)){
            System.out.println(" java verification passed");
        }else{
            System.out.println("java verification failed");
        }
       driver.navigate().back();


       WebElement seleniumLink = driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[3]/a"));
       seleniumLink.click();
       String expectedSeleniumTitle = "Selenium Webdriver Tutorial - Techlistic";
       String actualSeleniumTitle = driver.getTitle();
       if(expectedSeleniumTitle.equals(actualSeleniumTitle)){
           System.out.println("selenium verification passed");
       }else{
           System.out.println("selenium verification failed");
       }
       driver.navigate().back();


       WebElement testNgLink = driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[4]/a"));
        testNgLink.click();
        String expectedTestngTitle = "Selenium-TestNG Framework - Techlistic";
        String actualtestngtitle = driver.getTitle();
        if(expectedTestngTitle.equals(actualtestngtitle)){
            System.out.println("testng verification passed");
        }else{
            System.out.println("testng verification failed");
        }
       driver.navigate().back();
        driver.close();

    }
}
