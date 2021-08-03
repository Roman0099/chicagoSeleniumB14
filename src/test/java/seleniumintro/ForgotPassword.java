package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPasswordText = driver.findElement(By.xpath("//div[@class='example']/h2"));
        WebElement emailText = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/label"));
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement poweredByCybertekTxt = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        if(homeLink.isDisplayed() && forgotPasswordText.isDisplayed() && emailText.isDisplayed() && emailInputBox
                .isDisplayed() && passwordButton.isDisplayed()&& poweredByCybertekTxt.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed");
        }
    }
}
