package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        WebElement etsySearchBox =driver.findElement(By.xpath("//input[@name='search_query']"));
        etsySearchBox.sendKeys("wooden spoon");
        WebElement etsySearchButton =driver.findElement(By.xpath("//button[@value='Search']"));
        etsySearchButton.click();
        String actualTitle = driver.getTitle();
        String expectedInTitle= "Wooden spoon";
        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }
    }
}
