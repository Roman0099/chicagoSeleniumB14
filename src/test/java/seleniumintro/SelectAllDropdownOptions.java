package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectAllDropdownOptions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select multipleSelectDropdown = new Select(driver.findElement(By.name("Languages")));
        List<WebElement>options =  multipleSelectDropdown.getOptions();
        for(WebElement option: options){
            multipleSelectDropdown.selectByVisibleText(option.getText());
            List<WebElement>allSelectedOptions = multipleSelectDropdown.getAllSelectedOptions();
            for(WebElement selectedOption: allSelectedOptions){
                System.out.println(selectedOption.getText());

            }
            multipleSelectDropdown.deselectAll();
        }
    }
}

