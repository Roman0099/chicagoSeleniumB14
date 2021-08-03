package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VyTrackUtils;

import java.util.concurrent.TimeUnit;

public class CreateCalendarBtnTest {
    public static void main(String[] args) {
        WebDriver driver;
        String CreateCalendarBtnLocatorsxPath = "//a[@title='Create Calendar event']";
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        VyTrackUtils.login(driver,"storemanager85","UserUser123");
        VyTrackUtils.navigateToModule(driver, "Customers","Accounts");

        if(driver.findElement(By.xpath("//a[@title='Create Calendar event']")).isDisplayed()){
            System.out.println("Test 2 - Pass!");
        }else{
            System.out.println("Test 2 - Failed!");
        }
    }
}
