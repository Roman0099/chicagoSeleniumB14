package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MultiSelectExample {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("cars")));
        System.out.println(select.isMultiple());
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("saab");
        Thread.sleep(2000);
        select.deselectByValue("saab");
        Thread.sleep(2000);
        select.deselectAll();
        Thread.sleep(2000);
        driver.close();
    }
}
