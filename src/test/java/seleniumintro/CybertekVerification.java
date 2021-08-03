package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {
    public static void main(String[] args) {
        //1- open the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //2- go to cybertek website
        driver.get("https://www.cybertekschool.com");

        //3- verify title: Expected: Cybertek
        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Cybertek title verification PASSED!");
        }else{
            System.out.println("Cybertek title verification FAILED!");
        }

        //4- verify url: Expected Contains : cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("Cybertek URL verification PASSED!");
        }else{
            System.out.println("Cybertek URL verification FAILED!");
        }
    }
}

