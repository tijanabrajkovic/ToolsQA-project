package POMBase;

import POMPages.Elements;
import POMPages.Forms;
import POMPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ForkJoinPool;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public Elements elements;
    public String elementsURL;
    public Forms forms;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        wdwait= new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader= new ExcelReader("C:\\Users\\Budo\\Desktop\\TestBook11.xlsx");
        homeURL = excelReader.getStringData("URL",1,0);
        homePage= new HomePage(driver, wdwait);
        elements = new Elements(driver,wdwait);
        elementsURL= excelReader.getStringData("ELEMENTS",1,0);
        forms= new Forms(driver,wdwait);

    }
    public void waitVisibility(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitClick(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scroll(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public void click (WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    @AfterClass
    public void tearDown(){
        //driver.manage().deleteAllCookies();
       // driver.close();
        //driver.quit();
    }
}
