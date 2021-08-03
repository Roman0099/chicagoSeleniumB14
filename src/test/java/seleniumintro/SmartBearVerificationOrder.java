package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmartBearVerificationOrder {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearTaskOne.loginToSmartBear(driver);
        WebElement susansDay = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
        String expectedDay = "01/05/2010";
        String actualDay = susansDay.getText();
        if(actualDay.equals(expectedDay)){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }
    }
}
