package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTaskTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement CheckAllButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        String expectedText = "Check All";
        String actualText = CheckAllButton.getAttribute("value");
        if(expectedText.equals(actualText)){
            System.out.println("Check all button verification passed");
        }else{
            System.out.println("Check all button verification Failed");
        }
        if (CheckAllButton.isDisplayed()) {
            System.out.println("CheckAllButton is displayed! Passed!");
        } else {
            System.out.println("CheckAllButton is not displayed! Failed");
        }
        CheckAllButton.click();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@class='cb1-element'][1]"));
        if (checkBox1.isSelected()) {
            System.out.println("CheckBox1 is checked. Passed");
        } else {
            System.out.println("CheckBox1 is not checked. Failed");
        }
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
        if (checkBox1.isSelected()) {
            System.out.println("CheckBox2 is checked. Passed");
        } else {
            System.out.println("CheckBox2 is not checked. Failed");
        }
        WebElement checkBox3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
        if (checkBox1.isSelected()) {
            System.out.println("CheckBox3 is checked. Passed");
        } else {
            System.out.println("CheckBox3 is not checked. Failed");
        }
        WebElement checkBox4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));
        if (checkBox1.isSelected()) {
            System.out.println("CheckBox4 is checked. Passed");
        } else {
            System.out.println("CheckBox4 is not checked. Failed");
        }

        String expectedValueAfterClick = "Uncheck All";
        String actualValueAfterClick = CheckAllButton.getAttribute("value");
        if(expectedValueAfterClick.equals(actualValueAfterClick)){
            System.out.println("Button text changed to uncheck all. Passed");
        }else{
            System.out.println("Button text changed to uncheck all.Failed");
        }


    }
}
