package pages.SmaBear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogPage {
    //When we are creating PageObjectModelPage, we have 2 steps
    //1.Create constructor and call page factory method
    public LogPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //2.@FindBy annotation to locate webelements
    @FindBy(id = "ctl00_MainContent_username")
        public WebElement username;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;
    @FindBy (id="ctl00_MainContent_login_button")
    public WebElement LogButton;
    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMessage;
    }


