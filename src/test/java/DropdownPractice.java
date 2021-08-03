import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractice {
     static WebDriver driver;
    public static void main(String[] args) throws Exception {
        dropdown();
        //multipleSelection();


    }

    public static void setUp()  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

        public static void dropdown() throws Exception {
        setUp();
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(simpleDropdown);
            Thread.sleep(2000);
            select.selectByVisibleText("Option 1");
        }
        public static void multipleSelection() throws Exception{
        setUp();
        Select select1 = new Select(driver.findElement(By.name("Languages")));
        List<WebElement>multipleOptions = select1.getOptions();
        for (WebElement option: multipleOptions){
            Thread.sleep(2000);
            select1.selectByVisibleText(option.getText());
        }
        driver.close();

    }
    }

