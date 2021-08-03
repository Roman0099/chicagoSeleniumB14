package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class HandalingMultipleWindows {
    public static void main(String[] args) throws InterruptedException{
        Driver.getDriver().get("http://demo.automationtesting.in/Windows.html");

        System.out.println(Driver.getDriver().getTitle());
        WebElement windowButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
        windowButton.click();
        Thread.sleep(3000);
        Set<String> windowIds =  Driver.getDriver().getWindowHandles();
        Iterator<String>itr = windowIds.iterator();
        String mainWindow = itr.next();
        String childWindow = itr.next();
        Driver.getDriver().switchTo().window(childWindow);
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().close();
        Thread.sleep(3000);
        Driver.getDriver().switchTo().window(mainWindow);
        System.out.println(Driver.getDriver().getTitle());



    }
}
