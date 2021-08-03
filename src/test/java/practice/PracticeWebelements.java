package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Iterator;
import java.util.List;

public class PracticeWebelements {
    @Test
            public static void elementsTest()throws InterruptedException {
        Driver.getDriver().get("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement clickOnMe = Driver.getDriver().findElement(By.xpath("//button[.='Click Me!']"));
        clickOnMe.click();
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();
        WebElement raiseBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"button2\"]"));
        raiseBtn.click();
        Driver.getDriver().navigate().back();
        WebElement clickBtnUsingId = Driver.getDriver().findElement(By.id("idExample"));
        clickBtnUsingId.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.xpath("//button[@class='buttonClass']")).click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.name("button1")).click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.xpath("//a[.='Click Me']")).click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.id("simpleElementsLink")).click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.xpath("//a[.='Clickable Icon']")).click();
        Driver.getDriver().navigate().back();
        WebElement maleRadioBtn = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        Assert.assertTrue(maleRadioBtn.isDisplayed());
        WebElement checkBoxCar = Driver.getDriver().findElement(By.xpath("//input[@value='Car']"));
        Assert.assertTrue(checkBoxCar.isDisplayed());
        WebElement tableId = Driver.getDriver().findElement(By.id("htmlTableId"));
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//table[@id='htmlTableId']"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }
        @Test
                public static void webtableTest(){
        Driver.getDriver().get("http://demo.automationtesting.in/WebTable.html");
        List <WebElement> tableElements = Driver.getDriver().findElements(By.xpath("//*[@id=\"1610415372142-grid-container\"]//div/div/div/div/div/div/div"));
           for(WebElement element:tableElements){

                System.out.println(element.getSize());
            }


        }

    }

