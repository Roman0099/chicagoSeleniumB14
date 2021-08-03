package practice;

import org.openqa.selenium.By;
import utilities.Driver;

import java.util.Set;

public class WindowsHandlesEx {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainWindow = Driver.getDriver().getWindowHandle();
        System.out.println("main window " + mainWindow);
        Driver.getDriver().findElement(By.id("newWindowsBtn")).click();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for(String handle:handles){
            Driver.getDriver().switchTo().window("CDwindow-E6E6D50DFDEE27BD0408B2CB780A809E");

        }

    }
}
