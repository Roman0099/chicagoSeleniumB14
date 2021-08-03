package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.HoverTest;
import utilities.Driver;

public class HoverCheck {
    @Test
    public void hoverCheck()throws Exception{
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        HoverTest hoverTest = new HoverTest();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hoverTest.image1).perform();
        Assert.assertTrue(hoverTest.user1Text.isDisplayed());
        Thread.sleep(2000);
        actions.moveToElement(hoverTest.image2).perform();
        Assert.assertTrue(hoverTest.user2Text.isDisplayed());
        Thread.sleep(2000);
        actions.moveToElement(hoverTest.image3).perform();
        Assert.assertTrue(hoverTest.user3Text.isDisplayed());
    }
}
