package synchronizationTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoadingPage;
import utilities.Driver;

public class ThreadSleepTest2 {
    @Test
    public void threadSleepTest() throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.Button.click();
        Assert.assertTrue(dynamicLoadingPage.helloWorldText.isDisplayed(),
                "text is not displayed!");

    }
}
