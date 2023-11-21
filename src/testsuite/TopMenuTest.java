package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * click on the ‘Computers’ Tab
 * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * click on the ‘Electronics’ Tab
 * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * click on the ‘Apparel’ Tab
 * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * click on the ‘Digital downloads’ Tab
 * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * click on the ‘Books’ Tab
 * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * click on the ‘Jewelry’ Tab
 * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * click on the ‘Gift Cards’ Tab
 * Verify the text ‘Gift Cards’
 */

public class TopMenuTest extends BaseTest {

    // Launch baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[@href='/computers']")).click();
        // Verify the text ‘Computers’
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[text()='Computers ']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Computers key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[@href='/electronics']")).click();
        // Verify the text ‘Electronics’
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[text()='Electronics ']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Electronics key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//a[@href='/apparel']")).click();
        // Verify the text ‘Apparel’
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Apparel key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Digital downloads key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[@href='/books']")).click();
        // Verify the text ‘Books’
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Books key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[@href='/jewelry']")).click();
        // Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Jewelry key word not found", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//a[@href='/gift-cards']")).click();
        // Verify the text ‘Register’
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Gift Cards key word not found", actualText, expectedText);
    }

    @After
    public void close() {
        closeBrowser();
    }
}
