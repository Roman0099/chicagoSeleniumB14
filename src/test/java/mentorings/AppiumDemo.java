package mentorings;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDemo {

    public static AppiumDriverLocalService appiumDriverLocalService;
    public static AndroidDriver androidDriver;



    @Before
    public void setUp() throws MalformedURLException {

        //set default service
        appiumDriverLocalService = AppiumDriverLocalService.buildDefaultService ();
        //initiating capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //start the service
        appiumDriverLocalService.start();

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel XL");
        desiredCapabilities.setCapability("avd", "Pixel XL");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability("appPackage", "com.google.android.apps.maps");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability("appActivity", "com.google.android.maps.MapsActivity");

        desiredCapabilities.setCapability("autoGrantPermissions", true);
        //desiredCapabilities.setCapability("autoAcceptAlerts", true);
        desiredCapabilities.setCapability("newCommandTimeout", 60000);
        desiredCapabilities.setCapability("noReset", true);
        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        androidDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
    }

    @Test
    public void test() {

        System.out.println ("Launching appium emulator");
        androidDriver.findElement (By.xpath ("//[*text='SKIP']"));
        androidDriver.findElement (By.xpath ("//*[content-desc='Menu']"));

    }


    @After
    public void tearDown(){

        androidDriver.quit ();
        appiumDriverLocalService.stop ();

    }

}