package testng;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {
    @Test
    public void test1() {
        System.out.println("Test1 is starting");
        Assert.assertEquals(4, 5);

        System.out.println("Test1 is middle ");
        Assert.assertTrue(false);
        System.out.println("Tesrt1 is ending....");
    }

    @Test
    public void test2() {
        System.out.println("Test2 is starting...");
    }

    @Test
    public void test3() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Test3 is starting...");
        softAssert.assertEquals(4,5);

        System.out.println("Test3 is middle..");
        softAssert.assertTrue(false);

        System.out.println("Test3 is ending...");
        softAssert.assertAll();

    }
}