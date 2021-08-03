package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;

import java.util.concurrent.TimeUnit;

public class VyTrackPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        username.sendKeys("storemanager85");
        password.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();
        WebElement activitiesTab = driver.findElement(By.xpath("//span[contains(text(), 'Activities') and @class='title title-level-1']"));
        activitiesTab.click();
        WebElement callsModule = driver.findElement(By.xpath("//span[.='Calls']"));
        callsModule.click();
        SeleniumUtils.pause(5);
        WebElement callLogsButton = driver.findElement(By.xpath("//a[@title='Log call']"));
        if(callLogsButton.isDisplayed()){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }
    }

}
