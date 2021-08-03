package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPrac {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Verification Passed!");
        } else {
            System.out.println("Verification Failed!");
        }
        deleteButton.click();
        try {
            WebElement deleteButton2 = driver.findElement(By.xpath("//button[@class='added-manually']"));
            if (!deleteButton2.isDisplayed()) {
                System.out.println("Verification is passed!");
            } else {
                System.out.println("Verification Failed!");
            }
        } catch (NoSuchElementException a) {
            System.out.println("Delete button is not displayed! Verification Passed!");
        }
    }
}
