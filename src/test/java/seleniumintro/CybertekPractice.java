package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement headerForgotPassword = driver.findElement(By.xpath("//h2['Forgot Password']"));
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement cybertekSchool = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        if(homeLink.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }
         if(headerForgotPassword.isDisplayed()){
            System.out.println("Verification Passed!");
        }else
             System.out.println("Verification Failed!");
         if(emailText.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
             System.out.println("Verification Failed!");
         }
         if(inputBox.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
             System.out.println("Verification Failed!");
         }
         if(retrievePassword.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
             System.out.println("Verification Failed!");
         }
         if(cybertekSchool.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }

    }
}
