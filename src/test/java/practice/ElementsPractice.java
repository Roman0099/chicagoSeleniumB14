package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ElementsPractice {
    @Test
    public static void addElementTest(){
        Driver.getDriver().get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addEle = Driver.getDriver().findElement(By.xpath("//button[.='Add Element']"));
        addEle.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//button[.='Delete']")).isDisplayed());
    }

    @Test
    public static void basicAuth(){
        Driver.getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String pageText = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        System.out.println(pageText);

    }

    @Test
    public static void dragAndDrop()throws InterruptedException{
        Driver.getDriver().get("http://the-internet.herokuapp.com/drag_and_drop");
        WebElement imageA = Driver.getDriver().findElement(By.id("column-a"));
        WebElement imageB = Driver.getDriver().findElement(By.id("column-b"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(imageB,imageA).build().perform();



    }
    @Test
    public static void contextClick(){
        Driver.getDriver().get("http://the-internet.herokuapp.com/context_menu");
        WebElement rightClick = Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClick).perform();
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();

        jse.executeScript("alert(You selected a context menu);");


    }

    @Test
    public static void disappearingElements()throws InterruptedException{
        Driver.getDriver().get("http://the-internet.herokuapp.com/disappearing_elements");
       // Driver.getDriver().findElement(By.xpath("//a[.='Home']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[.='About']")).click();
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[.='Contact Us']")).click();
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[.='Portfolio']")).click();
    }



            }

