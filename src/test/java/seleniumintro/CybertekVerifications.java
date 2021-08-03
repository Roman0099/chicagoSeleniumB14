package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");
        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification failed");
        }

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification failed");
        }
    }
}
