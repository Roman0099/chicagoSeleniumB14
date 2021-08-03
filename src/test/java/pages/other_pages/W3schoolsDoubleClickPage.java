package pages.other_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class W3schoolsDoubleClickPage {
    public W3schoolsDoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="demo")
    public WebElement doubleClickText;
}
