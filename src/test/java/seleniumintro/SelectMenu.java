package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectMenu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropDownLink.click();
       WebElement facebookLink =  driver.findElement(By.xpath("//a[.='Facebook']"));
       facebookLink.click();

       String expectedTitle = "Facebook - Log In or Sign Up";
       String actualTitle = driver.getTitle();
       if(expectedTitle.equals(actualTitle)){
           System.out.println("Title verification Passed");
       }else{
           System.out.println("Title verification Failed");
       }



    }
}
