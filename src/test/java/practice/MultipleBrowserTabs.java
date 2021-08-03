package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class MultipleBrowserTabs {
    public static void main(String[] args) throws Exception{
        Driver.getDriver().get("http://www.google.com");
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

    }
}
