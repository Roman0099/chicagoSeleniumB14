package practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class UserRegistrationExample {
    @Test
    public static void positiveRegistrationForm(){
        Driver.getDriver().get(" http://automationpractice.com/index.php");
        WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
        loginLink.click();
        WebElement createAccountEmailBox = Driver.getDriver().findElement(By.id("email_create"));
        createAccountEmailBox.sendKeys("rom@yahoo.com");
        WebElement createaccountBtn = Driver.getDriver().findElement(By.id("SubmitCreate"));
        createaccountBtn.click();
        WebElement genderCheckBox = Driver.getDriver().findElement(By.id("id_gender1"));
        genderCheckBox.click();
        WebElement firstNameInput = Driver.getDriver().findElement(By.id("customer_firstname"));
        firstNameInput.sendKeys("Adam");
        WebElement lastNameInput = Driver.getDriver().findElement(By.id("customer_lastname"));
        lastNameInput.sendKeys("Madam");
        WebElement passwordInput = Driver.getDriver().findElement(By.id("passwd"));
        passwordInput.sendKeys("12345");
        Select date = new Select(Driver.getDriver().findElement(By.id("days")));
        date.selectByValue("4");
        Select month = new Select(Driver.getDriver().findElement(By.id("months")));
        month.selectByValue("12");
        Select year = new Select(Driver.getDriver().findElement(By.id("years")));
        year.selectByValue("2020");
        WebElement streetInputBox = Driver.getDriver().findElement(By.id("address1"));
        streetInputBox.sendKeys("123 Oak St");
       WebElement cityBox =  Driver.getDriver().findElement(By.id("city"));
       cityBox.sendKeys("Chicago");
       Select statedropdown = new Select(Driver.getDriver().findElement(By.id("id_state")));
       statedropdown.selectByVisibleText("Illinois");
       WebElement zipcode = Driver.getDriver().findElement(By.id("postcode"));
       zipcode.sendKeys("60634");
      WebElement phoneInput =  Driver.getDriver().findElement(By.id("phone_mobile"));
      phoneInput.sendKeys("1233450000");
      WebElement addressAlias = Driver.getDriver().findElement(By.id("alias"));
      addressAlias.sendKeys("myAddress");
      WebElement registerBtn = Driver.getDriver().findElement(By.id("submitAccount"));
      registerBtn.click();


    }

    @Test
    public static void negativeRegistrationForm() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
        WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
        loginLink.click();
        WebElement emailInput2 = Driver.getDriver().findElement(By.id("email"));
        emailInput2.sendKeys("rom@yahoo.com");
        WebElement passwordBox = Driver.getDriver().findElement(By.id("passwd"));
        passwordBox.sendKeys("12345");
        WebElement signInBtn = Driver.getDriver().findElement(By.id("SubmitLogin"));
        signInBtn.click();
        String expectedErrorMessage = "Authentication failed.";
        String actualErrorMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        System.out.println(actualErrorMessage);
        if (expectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");

        }

//        WebElement logoutBtn = Driver.getDriver().findElement(By.xpath("//a[@class='logout']"));
//        logoutBtn.click();
    }
        @Test
        public static void mandatoryFieldError(){
            Driver.getDriver().get(" http://automationpractice.com/index.php");
            WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
            loginLink.click();
            WebElement createAccountEmailBox = Driver.getDriver().findElement(By.id("email_create"));
            createAccountEmailBox.sendKeys("rom@gmail.com");
            WebElement createaccountBtn = Driver.getDriver().findElement(By.id("SubmitCreate"));
            createaccountBtn.click();
            WebElement registerBtn = Driver.getDriver().findElement(By.id("submitAccount"));
            registerBtn.click();
            WebElement errorMessage =Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-danger']/p"));
            System.out.println(errorMessage.getText());
            Assert.assertTrue(errorMessage.isDisplayed());

    }

    @Test
    public static void multipleErrorMessages(){
        Driver.getDriver().get(" http://automationpractice.com/index.php");
        WebElement loginLink = Driver.getDriver().findElement(By.xpath("//a[@class='login']"));
        loginLink.click();
        WebElement createAccountEmailBox = Driver.getDriver().findElement(By.id("email_create"));
        createAccountEmailBox.sendKeys("rom@gmail.com");
        WebElement createaccountBtn = Driver.getDriver().findElement(By.id("SubmitCreate"));
        createaccountBtn.click();
        WebElement firstNameInput = Driver.getDriver().findElement(By.id("customer_firstname"));
        firstNameInput.sendKeys("Adam2");
        WebElement zipcode = Driver.getDriver().findElement(By.id("postcode"));
        zipcode.sendKeys("60634klllll");
        WebElement registerBtn = Driver.getDriver().findElement(By.id("submitAccount"));
        registerBtn.click();
        WebElement firstNameErrorMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[3]"));
        WebElement zipErrorMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[7]"));
        Assert.assertTrue(zipErrorMessage.isDisplayed());
        Assert.assertTrue(firstNameErrorMessage.isDisplayed());
        System.out.println(firstNameErrorMessage.getText());
        System.out.println(zipErrorMessage.getText());






    }
}
