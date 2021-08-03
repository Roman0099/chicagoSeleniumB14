package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShotUtil {

    public static void captureScreenShot(WebDriver driver, String screenshotName){
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshots/"+ screenshotName +".png"));
            System.out.println("Screenshot taken!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
