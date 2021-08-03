package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumintro.SmartBearMain;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTest2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearMain.loginToSmartBear(driver);
    }

    @Test
    public void deleteOrder() {
        WebElement markSmithCheckBox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        markSmithCheckBox.click();
        WebElement deleteSelected = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        deleteSelected.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement name : allNames) {
            System.out.println(name.getText());
            Assert.assertFalse(name.getText().equals("Mark Smith"), "The name is on the list, Test Failed!");

        }
    }

    @Test
    public void editOrder() {
        String xpathEditForSteveJohns = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Steve Johns']/../td[13]";
        WebElement editButtonSteveJohns = driver.findElement(By.xpath(xpathEditForSteveJohns));
        editButtonSteveJohns.click();
        WebElement customerNameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerNameInput.clear();
        customerNameInput.sendKeys("Michael Jordan");
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement name : allNames) {
            System.out.println(name.getText().equals("Michael Jordan"));
            if (name.getText().equals("Michael Jordan")) {
                Assert.assertTrue(name.getText().equals("Michael Jordan"), "The name is not on the list, test failed!");
            }
        }


    }

    @Test
    public void removeNameTest() {

    }

    public void removeName(WebDriver driver, String nameToBeDeleted) {
        WebElement markSmithCheckBox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        markSmithCheckBox.click();
        WebElement deleteSelected = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        deleteSelected.click();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement name : allNames) {
            System.out.println(name.getText());
            Assert.assertFalse(name.getText().equals("Mark Smith"), "The name is on the list, Test Failed!");


        }


    }
}
