package seleniumintro;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CybertekLocatorsPractice {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com");
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(headerText.getText());
        WebElement contextLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        contextLink.click();
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement dragAndDropLink = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
        dragAndDropLink.click();
        System.out.println(dragAndDropLink.getText());
        driver.close();
        }
    }

