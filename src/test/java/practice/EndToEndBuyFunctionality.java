package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class EndToEndBuyFunctionality {
    @Test
    public static void endToEndTest() {
        Driver.getDriver().get(" http://automationpractice.com/index.php");
        WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
        loginLink.click();
        WebElement emailInput2 = Driver.getDriver().findElement(By.id("email"));
        emailInput2.sendKeys("rom@yahoo.com");
        WebElement passwordInput = Driver.getDriver().findElement(By.id("passwd"));
        passwordInput.sendKeys("12345");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        WebElement womenLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(womenLink).perform();

        Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();

        WebElement moreImage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        WebElement moreBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span"));
        actions.moveToElement(moreImage).moveToElement(moreBtn).perform();
        moreBtn.click();
        WebElement increaseBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
        increaseBtn.click();
        WebElement sizeSelector = Driver.getDriver().findElement(By.id("group_1"));
        Select size = new Select(sizeSelector);
        size.selectByValue("3");
        WebElement colorSelector = Driver.getDriver().findElement(By.xpath("//*[@id=\"color_14\"]"));
        colorSelector.click();
        WebElement addToCartBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCartBtn.click();
        WebElement proceedToCheckoutBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        proceedToCheckoutBtn.click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        WebElement agreementBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"cgv\"]"));
        agreementBtn.click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        String confirmationTxt = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
        if (confirmationTxt.contains("complete")) {
            System.out.println("order completed, test passed");
        } else {
            System.out.println("order incomplete, test failed");
        }
    }

    @Test
    public static void addToWishListTest() {
        Driver.getDriver().get(" http://automationpractice.com/index.php");
        WebElement womenLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(womenLink).perform();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
        WebElement moreImage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.moveToElement(moreImage).perform();
        WebElement wishListBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[3]/div[1]/a"));
        wishListBtn.click();
        WebElement mustBeLoginTxt = Driver.getDriver().findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div/div/p"));

        Assert.assertTrue(mustBeLoginTxt.isDisplayed());
    }

    @Test
    public static void priceVerification()throws Exception{
        Driver.getDriver().get(" http://automationpractice.com/index.php");
        WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
        loginLink.click();
        WebElement emailInput2 = Driver.getDriver().findElement(By.id("email"));
        emailInput2.sendKeys("rom@yahoo.com");
        WebElement passwordInput = Driver.getDriver().findElement(By.id("passwd"));
        passwordInput.sendKeys("12345");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        WebElement womenLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(womenLink).perform();

        Driver.getDriver().findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();

        WebElement moreImage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        WebElement moreBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span"));
        actions.moveToElement(moreImage).moveToElement(moreBtn).perform();
        moreBtn.click();
        String number = Driver.getDriver().findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).getAttribute("value");
        System.out.println(number);
        WebElement sizeSelector = Driver.getDriver().findElement(By.id("group_1"));
        Select size = new Select(sizeSelector);
        size.selectByValue("2");
        WebElement colorSelector = Driver.getDriver().findElement(By.xpath("//*[@id=\"color_14\"]"));
        colorSelector.click();
        WebElement addToCartBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCartBtn.click();
        WebElement proceedToCheckoutBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        proceedToCheckoutBtn.click();
        //String beforePrice = Driver.getDriver().findElement(By.xpath("//*[@id=\"total_price\"]")).getText();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@id=\"cart_quantity_up_1_4_0_430105\"]/span")).click();
        Thread.sleep(2000);
        String afterPrice = Driver.getDriver().findElement(By.xpath("//*[@id=\"total_price\"]")).getText();
        System.out.println(afterPrice);


    }
}



