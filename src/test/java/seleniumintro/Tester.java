package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Passed!!");
        } else {
            System.out.println("Failed!");
        }


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expected2Title = "Web Orders";
        String actual2Title = driver.getTitle();
        if (actual2Title.equals(expected2Title)) {
            System.out.println("Passed!!");
        } else {
            System.out.println("Failed!");
        }

        driver.close();





    }
}
