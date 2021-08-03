package synchronizationTest;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading1Page;
import utilities.Driver;

public class ExplicitWaitTests {
    @Test
    public void waitForInputBoxTest(){
//        //1- get the page
//        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
//        //2- create object to use webElements
//        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
//        //3- click to start button
//        dynamicLoading1Page.startButton.click();
//        //4- we create the WebDriverWait class object and pass driver and seconds
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));
//        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
//        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.passwordInput));
//        dynamicLoading1Page.passwordInput.sendKeys("123");
//
//   @Test
//    public void waitForInputBoxTest(){
       Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
       DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
       dynamicLoading1Page.startButton.click();
       dynamicLoading1Page.usernameBox.sendKeys("something");



}

}