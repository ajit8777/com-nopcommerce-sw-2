package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * click on the ‘Login’ link
 * Enter valid username
 * Enter valid password
 * Click on ‘LOGIN’ button
 * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * click on the ‘Login’ link
 * Enter invalid username
 * Enter invalid password
 * Click on Login button
 * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */


public class LoginTest extends BaseTest {

    //baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
// Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Welcome message not display", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd987@gmail.com");
        // Enter valid password
        driver.findElement(By.name("Password")).sendKeys("Prime1234");
        Thread.sleep(3000);
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        WebElement actualTextElement = driver.findElement(By.linkText("Log out"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Log out message not displays", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("ajitpatel99@gmail.com");
        // Enter invalid password
        driver.findElement(By.name("Password")).sendKeys("Ajit999");
        // Click on Login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();

        // Verify the error message ‘Login was unsuccessful. Please correct the errors and try again.
        // No customer account found’
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']"));
        String actualText = actualTextElement.getText();

        Assert.assertEquals("Error message not display", expectedText, actualText);
    }

    @After
    public void close() {
        closeBrowser();
    }

}
