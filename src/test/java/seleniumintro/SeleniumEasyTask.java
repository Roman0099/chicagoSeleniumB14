package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement successCheckBox = driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!successCheckBox.isDisplayed()){
            System.out.println("SuccessCheckBox is not displayed! Passed!");
        }else{
            System.out.println("SuccessCheckBox is displayed! Failed!");
        }
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox.click();
        if(successCheckBox.isDisplayed()){
            System.out.println("SuccessCheckBox is  displayed! Passed!");
        }else{
            System.out.println("SuccessCheckBox is not displayed! Failed!");
        }

    }
}
