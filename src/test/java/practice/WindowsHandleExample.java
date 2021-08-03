package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandleExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");

        //open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        //get handles of the windows
        String mainHandle = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String>it = allWindows.iterator();

        //here we will check if child window has another child window and will fetch the heading of the child window
        while (it.hasNext()){
            String childWindow = it.next();
            if(!mainHandle.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println(text);
                String mainWindowTitle = driver.switchTo().window(mainHandle).getTitle();
                System.out.println(mainWindowTitle);
                String childWindowUrl = driver.switchTo().window(childWindow).getCurrentUrl();
                System.out.println(childWindowUrl);




            }

        }


    }


}
