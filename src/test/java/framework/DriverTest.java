package framework;

import org.testng.annotations.Test;
import utilities.Driver;

public class DriverTest {
    @Test
    public void test(){
        Driver.getDriver().get("https://amazon.com");
    }
}
