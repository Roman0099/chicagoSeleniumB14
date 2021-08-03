package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class PracticeTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.className("gb_g")).click();
        driver.navigate().back();
        String aboutLink=driver.findElement(By.linkText("about")).getAttribute("href");
        System.out.println(aboutLink);
        String ping=driver.findElement(By.linkText("about")).getAttribute("ping");
        System.out.println("Value of ping attribute " + ping);
    }
}
