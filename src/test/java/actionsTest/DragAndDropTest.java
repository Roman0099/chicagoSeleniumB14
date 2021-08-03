package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.other_pages.TelerikDragNDropPage;
import utilities.Driver;

public class DragAndDropTest {
    @Test
    public void DragAndDropTest() throws InterruptedException{
        //get the page
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //locate the webelements, instantiate the class
        TelerikDragNDropPage telerikDragNDropPage = new TelerikDragNDropPage();
        //Actions class object creating
        Actions actions = new Actions(Driver.getDriver());
        //use drag and drop method
        telerikDragNDropPage.acceptCookiesButn.click();
        Thread.sleep(2000);
        actions.dragAndDrop(telerikDragNDropPage.source,telerikDragNDropPage.target).build().perform();
        Assert.assertTrue(telerikDragNDropPage.youDidGreatText.isDisplayed(), "Message is not displayed");

    }
}
