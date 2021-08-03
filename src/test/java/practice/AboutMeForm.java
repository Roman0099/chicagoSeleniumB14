package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AboutMeForm {
    @Test
    public static void formAboutMe()throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement firstNameBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameBox.sendKeys("Roman");
        WebElement lastNameBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameBox.sendKeys("Yus");
        Thread.sleep(2000);
        WebElement maleRadioButton = driver.findElement(By.id("sex-0"));
        maleRadioButton.click();
        WebElement yersOfExRadioButton = driver.findElement(By.id("exp-4"));
        yersOfExRadioButton.click();
        WebElement dateBox = driver.findElement(By.id("datepicker"));
        dateBox.sendKeys("01/08/2020");
        WebElement professionBox = driver.findElement(By.id("profession-1"));
        professionBox.click();
        WebElement automationToolBox = driver.findElement(By.id("tool-0"));
        automationToolBox.click();
        Select select = new Select(driver.findElement(By.id("continents")));
        select.selectByVisibleText("North America");
        Thread.sleep(2000);
        Select select1 = new Select(driver.findElement(By.id("selenium_commands")));
        select1.getOptions();
//        List<WebElement>seleniumcommands = select1.getOptions();
//        for (WebElement option:seleniumcommands){
//            System.out.println(option.getText());
        }



    }

