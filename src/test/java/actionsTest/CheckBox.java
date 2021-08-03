package actionsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
        Thread.sleep(1000);

        //FInd all elements with the TAGname input
        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        //loop through these list of elements
        for(WebElement checkbox: checkboxes){
            Thread.sleep(1000);
            if(!checkbox.isSelected()){
                checkbox.click();

            }
        }
        driver.quit();

    }
}
