package actionsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class ContextClick {
    @Test
    public void contextClick() throws InterruptedException{
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));
        //create actions class
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions.contextClick(box).perform();
        //switch to alert to handle it
        Alert alert = Driver.getDriver().switchTo().alert();
        //accept the alert
        alert.accept();
        }


    }

