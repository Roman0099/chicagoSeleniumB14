package testng;

import org.testng.annotations.Test;

public class OrderOfThings {
    @Test(priority = 5)
    public void firstTest(){
        System.out.println("first test is running");

    }
    @Test(priority = 10)
    public void secondTest(){
        System.out.println("second test is running");

    }
    @Test(priority = 0)
    public void thirdTest(){
        System.out.println("third test is running");

    }
}
