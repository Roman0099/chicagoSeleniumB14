package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        //we need to locate a dropdown
        WebElement stateDropDown = driver.findElement(By.id("state"));
        Select select = new Select (stateDropDown);

        //To get default value

        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);

        //select by visible text

        select.selectByVisibleText("Florida");

        select.selectByIndex(13);

        select.selectByValue("AR");
        String expectedOption = "Arkansas";
        String actualOption = select.getFirstSelectedOption().getText();

        if(expectedOption.equals(actualOption)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification failed");
        }


    }
}
