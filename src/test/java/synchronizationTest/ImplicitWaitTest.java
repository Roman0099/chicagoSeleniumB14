package synchronizationTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading2Page;
import utilities.Driver;

public class ImplicitWaitTest {
//    @Test
//    public void threadSleepTest()  throws InterruptedException{
//        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
//        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();
//        dynamicLoading2Page.startButton.click();
//        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(),"Text is not displayed on the page!");
//    }
//}
@Test
public void threadSleepTest() throws InterruptedException{
    Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
    DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();
    dynamicLoading2Page.startButton.click();
    Assert.assertTrue(dynamicLoading2Page.helloText.isDisplayed(),"Text is not displayed!");


}
}