package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
       WebElement checkBoxText =  driver.findElement(By.xpath("//input[@id='check1']"));
       WebElement uncheckAllText = driver.findElement(By.xpath("//input[@id='check1']"));
       checkBoxText.click();
      WebElement checkBox2 =  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
      WebElement checkBox3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
      WebElement checkBox4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
      WebElement checkBox5 = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));

       if(checkBoxText.isDisplayed()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
       if(uncheckAllText.isDisplayed()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
       if(checkBox2.isSelected()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
       if(checkBox3.isSelected()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
       if(checkBox4.isSelected()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
       if(checkBox5.isSelected()){
           System.out.println("Verification Passed!");
       }else{
           System.out.println("Verification Failed!");
       }
    }
}
