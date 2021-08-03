package seleniumintro;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearch {
//    TC#2 Search ETSY
//        1. Open browser
//        2. Go to https://etsy.com
//            3. Enter any search term
//        4. Click search button
//        5. Verify title contains the search term
//    USE XPATH TO LOCATORS TO LOCATE WEBELEMENTS
//
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.etsy.com");
    WebElement etsySearchBox=driver.findElement(By.xpath("//input[@name='search_query']"));
    etsySearchBox.sendKeys("wooden spoon");

}












}
