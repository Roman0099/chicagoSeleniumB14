package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntroTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

       // driver.findElement(By.linkText("Store")).click();
       // driver.findElement(By.name("q")).sendKeys("apple.com");
        driver.findElement(By.linkText("Gmail")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }
        driver.navigate().back();
        String actualTitleGoogle = driver.getTitle();
        String expectedTitleGoogle = "Google";
        if(actualTitleGoogle.equals(expectedTitleGoogle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.navigate().forward();
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Passed again");
        }else{
            System.out.println("Failed");
        }


    }
}