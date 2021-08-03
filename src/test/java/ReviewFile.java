import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ReviewFile {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("review.properties");
        properties.load(file);
        String s = properties.getProperty("day");
        System.out.println(s);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.name("q")).sendKeys(properties.getProperty("item") + Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
