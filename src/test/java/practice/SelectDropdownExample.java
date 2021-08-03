package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectDropdownExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        List<WebElement> allOptions = select.getOptions();
        select.selectByIndex(4);
        System.out.println("select by index " + select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Magenta");
        System.out.println("select by text " + select.getFirstSelectedOption().getText());
        select.selectByValue("9");
        System.out.println("select by value " + select.getFirstSelectedOption().getText());
        driver.close();

    }
}
