package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PracticeDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        String expectedDay = "27";
        String expectedMonth = "January";
        String expectedYear = "2020";
        Select dayDropdown = new Select(driver.findElement(By.id("day")));
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        String actualYear = yearDropdown.getFirstSelectedOption().getText();

        if(expectedDay.equals(actualDay) && expectedMonth.equals(actualMonth) && expectedYear.equals(actualYear)){
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!");
        }




    }
}
