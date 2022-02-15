package POMTest;

import POMBase.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @BeforeClass
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }
    @Test
    public void canUserClickOnElementsCard() throws InterruptedException {
        homePage.clickOnElements(0);
        Thread.sleep(2000);
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/elements";
        Assert.assertEquals(actualURL,expectedURL);

    }
    @Test
    public void canUserClickOnFormsCard() throws InterruptedException {
        homePage.clickOnElements(1);
        Thread.sleep(2000);
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/forms";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @Test
    public void canUserClickOnAlertCard() throws InterruptedException {
        homePage.clickOnElements(2);
        Thread.sleep(2000);
        String actualURL=driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/alertsWindows";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @Test
    public void canUserClickOnWidgetsCard() throws InterruptedException {
        homePage.clickOnElements(3);
        Thread.sleep(2000);
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/widgets";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @Test
    public void canUserClickOnInteractionsCard() throws InterruptedException {
        homePage.clickOnElements(4);
        Thread.sleep(2000);
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/interaction";
        Assert.assertEquals(actualURL,expectedURL);

    }
    @Test
    public void canUserClickOnBookStoreApplicationCard() throws InterruptedException {
        homePage.clickOnElements(5);
        Thread.sleep(2000);
        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/books";
        Assert.assertEquals(actualURL,expectedURL);
    }

}
