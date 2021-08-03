package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {
    @Test
    public void login(){
        System.out.println("Loging in");
        Assert.fail("On purpose fail");
    }

    @Test(dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Making purchase");

    }

    @Test
    public void homePage(){
        System.out.println("Home page is tested");
    }
}
