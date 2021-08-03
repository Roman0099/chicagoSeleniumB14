package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class AjaxGoogleSearch {
    @Test
    public static void googleSearchBoxTest( ){
        Driver.getDriver().get("http://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("tec");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("erkvQe")));
        List<WebElement> suggestions = Driver.getDriver().findElements(By.className("erkvQe"));
        for(WebElement option:suggestions){
            System.out.println(option.getText());
        }

    }
}
