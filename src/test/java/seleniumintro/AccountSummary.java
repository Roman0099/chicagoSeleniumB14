package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountSummary {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).submit();
        if(driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("username is displayed");
        }else{
            System.out.println("failed");
        }
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed");

        }else{
            System.out.println("Verification failed");
        }
        String actualLink = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
        String expectedLink = "account - summary";
        if(actualLink.equals(expectedLink)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }




    }
}
