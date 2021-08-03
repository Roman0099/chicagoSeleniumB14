package pages.practice_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoadingPage {
    public DynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), "this");

    }
        @FindBy(xpath = "//button[.='Start']")
                public WebElement Button;
     @FindBy(xpath = "//div/h4[.='Hello World!']")
            public WebElement helloWorldText;

}
