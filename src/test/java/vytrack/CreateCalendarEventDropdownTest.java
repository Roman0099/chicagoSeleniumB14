package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VyTrackUtils;

public class CreateCalendarEventDropdownTest {
    public static void main(String[] args) {
        WebDriver driver;
        String CreateCalendarBtnLocatorsxPath = "//a[@title='Create Calendar event']";
        String saveAndCloseButtonXPath = "//div/button[contains(text(), 'Save and Close')]";
        String saveAndCloseDropdownxPath = "//a[@class='btn-success btn dropdown-toggle']";
        String saveAndCloseInListxPath = "//button[@class='action-button dropdown-item']";
        String saveAndNewOption = "//button[@class='main-group action-button dropdown-item']";
        String saveOption = "(//button[@class='main-group action-button dropdown-item'])[2]";



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        VyTrackUtils.login(driver,"storemanager85","UserUser123");
        VyTrackUtils.navigateToModule(driver, "Activities","Calendar Events");
        driver.findElement(By.xpath(CreateCalendarBtnLocatorsxPath)).click();
        SeleniumUtils.pause(3);
        if(driver.findElement(By.xpath(saveAndCloseButtonXPath)).isDisplayed()){
            System.out.println("Save and Close btn - Pass");
        }else{
            System.out.println("Save and Close btn - Failed");
        }
        driver.findElement(By.xpath(saveAndCloseDropdownxPath)).click();
//        SeleniumUtils.pause(
        if(driver.findElement(By.xpath(saveAndCloseDropdownxPath)).isDisplayed()){
            System.out.println("Save and Close Dropdown - Pass");
        }else{
            System.out.println("Save and Close dropdown - Failed");
        }
        if(driver.findElement(By.xpath(saveAndCloseInListxPath)).isDisplayed()){
            System.out.println("Save and Close in List - Pass");
        }else{
            System.out.println("Save and Close in List- Failed");
        }
        if(driver.findElement(By.xpath(saveAndNewOption)).isDisplayed()){
            System.out.println("Save and New Option - Pass");
        }else{
            System.out.println("Save and New Option- Failed");
        }
        if(driver.findElement(By.xpath(saveOption)).isDisplayed()){
            System.out.println("Save Option - Pass");
        }else{
            System.out.println("Save Option - Failed");
        }



    }
}
