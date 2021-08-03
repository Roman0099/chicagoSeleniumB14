package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //sets up the driver for us.

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
       // Thread.sleep(2000);

        driver.navigate().forward();
        //Thread.sleep(200);
        driver.navigate().refresh();
        //Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");

        driver.manage().window().maximize();

    }
}
