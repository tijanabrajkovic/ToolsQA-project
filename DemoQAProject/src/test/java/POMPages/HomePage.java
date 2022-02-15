package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement elementsCard;
    WebElement formCard;
    WebElement alertCard;
    WebElement  widgetsCard;
    WebElement interactionsCard;
    WebElement bookStoreAplicationsCard;
    WebElement joinButton;
    public List<WebElement> listOfCards;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getJoinButton() {
        return driver.findElement(By.className("banner-image"));
    }

    public List<WebElement> listOfCard(){
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }

    public void clickOnElements(int n) {
        listOfCard().get(n).click();
    }
    public void clickOnJoinButton(){
        getJoinButton().click();
    }




}
