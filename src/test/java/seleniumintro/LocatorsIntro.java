package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        //to open the browser
        WebDriver driver = new ChromeDriver();
        //maximize the window size
        driver.manage().window().maximize();

        // 2.Go  to  https://www.google.com
        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();
    }
}
