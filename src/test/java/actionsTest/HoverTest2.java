package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.HoverTest;
import utilities.Driver;

public class HoverTest2 {
    @Test
    public void hoverTest(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        HoverTest hoverTest = new HoverTest();
        Actions actions = new Actions(Driver.getDriver());

    }
}
