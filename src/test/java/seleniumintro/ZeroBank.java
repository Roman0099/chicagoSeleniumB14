package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        String actualHeader = driver.findElement(By.className("page-header")).getText();
        String expectedHeader = "Log in to ZeroBank";
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
