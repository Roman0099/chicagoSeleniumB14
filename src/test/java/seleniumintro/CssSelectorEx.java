package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CssSelectorEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com");
        WebElement regForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        regForm.click();
        WebElement firstNameBox = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameBox.sendKeys("Roman");
        WebElement lastNameBox = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameBox.sendKeys("Hope");
        WebElement usernameBox = driver.findElement(By.cssSelector("input[name='username']"));
        usernameBox.sendKeys("abcdefg");
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("abcd123@gmail.com");
        WebElement passwordBox = driver.findElement(By.cssSelector("input[name='password']"));
        passwordBox.sendKeys("abcd12300");
        WebElement phoneBox = driver.findElement(By.cssSelector("input[name='phone']"));
        phoneBox.sendKeys("777-111-2323");
        WebElement genderButton = driver.findElement(By.cssSelector("input[name='gender']"));
        genderButton.click();
        WebElement birthDayBox = driver.findElement(By.cssSelector("input[name='birthday']"));
        birthDayBox.sendKeys("03/12/2005");

        WebElement depDropMenu = driver.findElement(By.cssSelector("select[name='department']"));
        Select select = new Select(depDropMenu);
        select.selectByVisibleText("Department of Engineering");


       Select select1 = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
       select1.selectByVisibleText("SDET");

       WebElement checkBox = driver.findElement(By.xpath("//input[@value='java']"));
       checkBox.click();
       WebElement signUpBtn = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
       signUpBtn.click();







    }
}
