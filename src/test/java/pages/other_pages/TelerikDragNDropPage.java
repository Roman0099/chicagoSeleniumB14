package pages.other_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikDragNDropPage {
    public TelerikDragNDropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div[id='draggable']")
    public WebElement source;
    @FindBy(xpath = "//div[@id='droptarget']")
    public WebElement target;
    @FindBy(xpath = "//div[.='You did great!']")
    public WebElement youDidGreatText;
    @FindBy(css = "button[id='onetrust-accept-btn-handler']")
    public WebElement acceptCookiesButn;

}


