package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectDateOnDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
       String expectedDay = "30";
       String expectedMonth = "April";
       String expectedYear = "2020";

       Select dayDropdown = new Select(driver.findElement(By.id("day")));
       String actualDay = dayDropdown.getFirstSelectedOption().getText();
       Select monthDropdown = new Select(driver.findElement(By.id("month")));
       String actualMonth = monthDropdown.getFirstSelectedOption().getText();
       Select yearDropdown = new Select(driver.findElement(By.id("year")));
       String actualYear = yearDropdown.getFirstSelectedOption().getText();
       if(expectedDay.equals(actualDay)){
           System.out.println("Day verification Passed");
       }else{
           System.out.println("Day verification Failed");
       }
        if(expectedMonth.equals(actualMonth)){
            System.out.println("Month verification Passed");
        }else{
            System.out.println("Month verification Failed");
        }
        if(expectedYear.equals(actualYear)){
            System.out.println("Year verification Passed");
        }else{
            System.out.println("Year verification Failed");
        }

        yearDropdown.selectByValue("1921");
        monthDropdown.selectByIndex(11);
        dayDropdown.selectByVisibleText("31");
        String expectedDay2 = "31";
        String actualDay2 = dayDropdown.getFirstSelectedOption().getText();
        String expectedMonth2 = "December";
        String actualMonth2 = monthDropdown.getFirstSelectedOption().getText();
        String expectedYear2 = "1921";
        String actualYear2 = yearDropdown.getFirstSelectedOption().getText();
        if(expectedDay2.equals(actualDay2) && expectedMonth2.equals(actualMonth2) && expectedYear2.equals(actualYear2)){
            System.out.println("Changed date Passed");
        }else{
            System.out.println("Changed date failed");
        }





    }
}
