package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGoogleTitleVer {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/www.google.com");
        driver.findElement(By.id("gb_70")).click();
        driver.navigate().back();
        String actualTitle=driver.getTitle();
        String expectedTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }

    }
}