package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.SeleniumUtils;

public class LogCallsVytrack {
    public static void main(String[] args) {
        WebDriver driver;

        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        String tabLocatorXpath = "//span[contains(text(), 'Activities') and @class='title title-level-1']";
        String moduleLocatorXpath = "//span[.='Calls']";
        String logCallBtnLocatorCss = "a[title='Log call']";



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

       driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
       driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);

        SeleniumUtils.pause(5);

       driver.findElement(By.xpath(tabLocatorXpath)).click();

       SeleniumUtils.pause(2);

       driver.findElement(By.xpath(moduleLocatorXpath)).click();

       SeleniumUtils.pause(2);
       if(driver.findElement(By.cssSelector(logCallBtnLocatorCss)).isDisplayed()){
           System.out.println("Test 1 Passed");
       }else{
           System.out.println("Test 1 failed");
       }


    }
}
