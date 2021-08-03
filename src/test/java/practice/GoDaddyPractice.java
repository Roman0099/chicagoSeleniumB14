package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoDaddyPractice {
    @Test
    public static void goDaddyValidation(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://www.godaddy.com/");

        String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
        String actualTitle = driver.getTitle();

        String expectedUrl = "https://www.godaddy.com/";
        String actualUrl = driver.getCurrentUrl();

        String actualPageSourceTitle = driver.getPageSource();
        String expectedPageSourceTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";


        Assert.assertTrue(actualPageSourceTitle.contains(expectedPageSourceTitle));
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        Assert.assertTrue(expectedUrl.equalsIgnoreCase(actualUrl));


    }

}
