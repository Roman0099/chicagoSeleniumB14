package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.other_pages.W3schoolsDoubleClickPage;
import utilities.Driver;

public class DoubleClickTest {
    @Test
    public void doubleClickTest(){
        //get the Page
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //switch to iframe
        Driver.getDriver().switchTo().frame("iframeResult");
        //locate webelements
        W3schoolsDoubleClickPage w3schoolsDoubleClickPage = new W3schoolsDoubleClickPage();
        //Actions object
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(w3schoolsDoubleClickPage.doubleClickText).perform();
        System.out.println("The value of style atribute: " + w3schoolsDoubleClickPage.doubleClickText.getAttribute("style"));

    }
}
