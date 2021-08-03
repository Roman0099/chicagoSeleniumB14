package seleniumintro;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNav {
    //    TC#3:	Back	and	forth	navigation
//    1-Open	a	chrome	browser

//    2-Go	to:	https://google.com

//    3-Click to	Gmail	from	top	right.

//    4- Verify title	contains:Expected:	Gmail


//    5-Go	back	to	Google by	using	the	.back();
//
//    6-Verify	title	contains:Expected:	Google
//    7-Go	back	to	Gmail	using
//    // 	the	Forward	button
//    8-Verify	title
//    // 	contains:Expected:	Gm
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup(); //sets up the driver for us.

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement gmailLink = driver.findElement(By.xpath("(//a[.='Gmail'])[1]"));
        gmailLink.click();
        String expectedTitle = "Gmail - Email from Google";
        String actualTitle = driver.getTitle();
        if(expectedTitle.contains(actualTitle)){
            System.out.println("Verification passed!");
        }else{
            System.out.println("Verification failed!");

        }
        driver.navigate().back();
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        if(expectedTitle2.contains(actualTitle2)){
            System.out.println("Verification passed!");
        }else{
            System.out.println("Verification failed!");
        }
        driver.navigate().forward();
        String expectedTitle3 = "Gmail - Email from Google";
        String actualTitle3 = driver.getTitle();
        if(expectedTitle3.contains(actualTitle3)){
            System.out.println("Verification passed!");
        }else{
            System.out.println("Verification failed!");
        }



    }
}
