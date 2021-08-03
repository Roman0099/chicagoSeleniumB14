package actionsTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class Frames {
    @Test
    public void frameTest1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/iframe");
        Driver.getDriver().switchTo().frame("mce_0_ifr");
        Driver.getDriver().findElement(By.id("tinymce")).clear();
        Driver.getDriver().findElement(By.id("tinymce")).sendKeys("Test automation");
        Driver.getDriver().switchTo().defaultContent();
    }
}
