package mentorings;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
    WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("instantiating the driver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }
    @After
    public void tearDown(){
        System.out.println("quiting the browser");
        driver.quit();
    }
    @Test
    public void navigateTo(){
        driver.get("https://www.amazon.com/");

    }


}
