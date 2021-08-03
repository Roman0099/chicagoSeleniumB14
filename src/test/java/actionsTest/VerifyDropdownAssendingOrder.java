package actionsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VerifyDropdownAssendingOrder {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select state = new Select(stateDropdown);

        List actual = new ArrayList();

        List<WebElement> allStates = state.getOptions();
        for(WebElement ele : allStates){
            String data = ele.getText();
            actual.add(data);

        }

        List temp = new ArrayList();
        temp.addAll(actual);
        //by default sorts in ascending order!
        Collections.sort(temp);
        Assert.assertTrue(actual.equals(temp));

    }
}
