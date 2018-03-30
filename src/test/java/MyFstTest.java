
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test; org.testng.
//import org.testng
//import org.testng.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
//
//import static org.junit.Assert.assertFalse;
//import static org.openqa.selenium.support.ui.ExpectedConditions.*;


/**
 * Created by
 */
public class MyFstTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private FirefoxBinary bin;

    @BeforeMethod
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    @Test
    public void mySamTest() throws Exception {
// comm
// тест сборки
        driver.get("https://yandex.ru/");
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
