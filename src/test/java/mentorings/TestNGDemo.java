package mentorings;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }

    @Test(priority = 3)
    public void test1() {
        String word1 = "Java";
        String word2 = "Java";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);
    }
    @Test(priority = 2)
    public void test2() {
        String word1 = "Javascript";
        String word2 = "Javascript";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("test 3");
        Assert.assertTrue(55 > 10);
        throw new SkipException("just skipped");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }
}
