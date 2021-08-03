package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonPractice {

    @Test
    public static void amazonLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        String title1 = driver.getTitle();
        System.out.println(title1);
        WebElement amazonPayLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
        amazonPayLink.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        String title2 = driver.getTitle();
        if(title1.equals(title2)){
            System.out.println("Titles match!");
        }else{
            System.out.println("Titles mismatch!");

            driver.close();
        }
    }

}
