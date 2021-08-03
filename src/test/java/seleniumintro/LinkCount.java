package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkCount {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com");
       List<WebElement> links =  driver.findElements(By.xpath("//body//a"));
       int expectedLinkCount = 188;
       int actualLinkCount = links.size();
       if(expectedLinkCount == actualLinkCount){
           System.out.println("List size is verified =188");
       }else{
           System.out.println("List size is not verified: " + actualLinkCount);
       }
       for(WebElement link: links){
           System.out.println(link.getText());
       }
       int counter = 0;
       for(WebElement link: links){
           if(link.getText().equals("")){
               counter++;

           }
       }
       int expectedNumber = 109;
        int actualLinkCountNoText = counter;
        if(expectedNumber == actualLinkCountNoText){
            System.out.println("Links without text verification Passed");
        }else{
            System.out.println("Links without text verification Failed");
        }

    }
}
