package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkboxOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if(!checkboxOne.isSelected()){
            System.out.println("CheckboxOne is not selected. Passed");
        }else{
            System.out.println("CheckboxOne selected. Failed");
        }
        WebElement checkboxTwo = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(checkboxTwo.isSelected()){
            System.out.println("CheckBoxTwo is selected.Passed!");
        }else{
            System.out.println("CheckBoxTwo is not selected. Failed!");
        }
        checkboxOne.click();
        if(checkboxOne.isSelected()){
            System.out.println("CheckBoxOne is selected! Passed");
        }else{
            System.out.println("CheckBoxOne is not selected! Failed");
        }
        checkboxTwo.click();
        if(!checkboxTwo.isSelected()){
            System.out.println("CheckBoxTwo is not selected! Passed");
        }else{
            System.out.println("CheckboxTwo is selected! Failed");
        }

    }

}
