package actionsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownEx {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select select = new Select(stateDropdown);
        select.selectByValue("DC");
        String expectedVal = "District Of Columbia";
        String actualVal = select.getFirstSelectedOption().getText();
        System.out.println(actualVal);
        Thread.sleep(1000);
       // driver.close();
        List<WebElement> options = select.getOptions();
        for(WebElement option: options){
            select.selectByVisibleText(option.getText());

        }
        Thread.sleep(2000);
        List<WebElement>selectedOptions = select.getAllSelectedOptions();
        for(WebElement option:selectedOptions){
            System.out.println(option.getText());
        }
        select.deselectAll();
        Thread.sleep(2000);
        //driver.close();

        WebElement dropDown = driver.findElement(By.id("dropdownMenuLink"));
        WebElement option = driver.findElement(By.xpath("//a[text()='Google']"));
        dropDown.click();
        Thread.sleep(2000);
        option.click();

        driver.close();

    }

}
