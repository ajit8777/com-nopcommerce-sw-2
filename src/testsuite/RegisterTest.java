package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

/**
 * userShouldNavigateToRegisterPageSuccessful
 * ly
 * click on the ‘Register’ link
 * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * Select gender radio button
 * Enter First name
 * Enter Last name
 * Select Day Month and Year
 * Enter Email address
 * Enter Password
 * Enter Confirm password
 * Click on REGISTER button
 * Verify the text 'Your registration completed’
 */

public class RegisterTest extends BaseTest {

    // Launch baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Verify the text ‘Register’
        String expectedText = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Register text not found", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // random number generator
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Select gender radio button
        driver.findElement(By.id("gender-male")).click();
        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Ajit");
        // Enter Last name
        driver.findElement(By.name("LastName")).sendKeys("Patel");
        // Select Day Month and Year
        driver.findElement(By.xpath("//option[text()='15']")).click();
        driver.findElement(By.xpath("//option[text()='November']")).click();
        driver.findElement(By.xpath("//option[text()='1995']")).click();
        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("ajit" + randomInt + "@gmail.com");
        // Enter Password
        driver.findElement(By.name("Password")).sendKeys("AjitPatel9");
        // Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("AjitPatel9");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        //Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void close() {
        closeBrowser();
    }
}
