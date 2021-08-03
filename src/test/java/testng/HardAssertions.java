package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    public void Test1(){
        System.out.println("Test1 is starting");
        Assert.assertEquals(4,5);
        System.out.println("Test1 middle");
        Assert.assertTrue(false);
        System.out.println("Testing1 is ending");
    }
    @Test
    public void Test2(){
        System.out.println("Test2 is starting");
    }
}
