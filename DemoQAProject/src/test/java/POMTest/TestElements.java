package POMTest;

import POMBase.BasePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElements extends BasePage {
    @BeforeMethod
    public void setUpPageElements(){
        driver.manage().window().maximize();
        driver.navigate().to(elementsURL);
    }

    @Test
    public void canUserClickOnFullNameField(){
        elements.clickOnTextBox();
        elements.clickOnFullName();
        Assert.assertTrue(elements.getFullName().isDisplayed());
    }
    @Test
    public void canUserFillTextBoxForm(){
        elements.clickOnTextBox();
        elements.clickOnFullName();
        elements.getFullName().clear();
        elements.getFullName().sendKeys(excelReader.getStringData("TEXTBOX",1,0));
        elements.getEmail().click();
        elements.getEmail().clear();
        elements.getEmail().sendKeys(excelReader.getStringData("TEXTBOX",1,1));
        elements.getCurrentAddress().click();
        elements.getCurrentAddress().clear();
        elements.getCurrentAddress().sendKeys(excelReader.getStringData("TEXTBOX",1,2));
        elements.getPermanentAddress().click();
        elements.getPermanentAddress().clear();
        elements.getPermanentAddress().sendKeys(excelReader.getStringData("TEXTBOX",1,3));
        scroll(elements.getSubmit());
        elements.clickOnSubmitButton();
        Assert.assertTrue(elements.fullNameTextFormMessage().equals("Name:Tijana Brajkovic"));

    }
    @Test
    public void canUserClickOnHomeButton() throws InterruptedException {
       elements.clickOnCheckBoxField();
       elements.getCheckBoxHomeButton().click();
       Assert.assertTrue(elements.getMessage().isDisplayed());
    }
    @Test
    public void canUserClickOnPlusButton(){
        elements.clickOnCheckBoxField();
        elements.clickOnPlusButton();
        Assert.assertTrue(elements.getDesktopButton().isDisplayed());
    }

    @Test
    public void canUserClickOnRadioButtonYes(){
        elements.clickOnRadioButtonField();
        elements.clickOnRadioButtonYes();
        Assert.assertTrue(elements.readMessage1().equals("You have selected Yes"));
    }
    @Test
    public void canUserClickOnRadioButtonImpressive(){
        elements.clickOnRadioButtonField();
        elements.clickOnRadioButtonImpressive();
        Assert.assertTrue(elements.readMessage2().equals("You have selected Impressive"));

    }
    @Test
    public void canUserAddANewPersonToTheWebTablesField(){
        elements.getWebTables().click();
        elements.getAddButton().click();
        elements.getFirstNameRegistration().clear();
        elements.getFirstNameRegistration().sendKeys(excelReader.getStringData("REGISTRATION FORM",1,0));
        elements.getLastNameRegistration().clear();
        elements.getLastNameRegistration().sendKeys(excelReader.getStringData("REGISTRATION FORM",1,1));
        elements.getEmailRegistration().clear();
        elements.getEmailRegistration().sendKeys(excelReader.getStringData("REGISTRATION FORM",1,2));
        elements.getAgeRegistration().clear();
        Integer validAge=excelReader.getIntegerData("REGISTRATION FORM",1,3);
        elements.getAgeRegistration().sendKeys(validAge.toString());
        Integer validSalary=excelReader.getIntegerData("REGISTRATION FORM",1,4);
        elements.getSalary().sendKeys(validSalary.toString());
        elements.getDepartment().sendKeys(excelReader.getStringData("REGISTRATION FORM",1,5));
        elements.getSubmitRegistration().click();
        Assert.assertTrue(elements.getNameOfNewPerson().isDisplayed());

    }

    @Test

    public void canUserAddANewPersonToTheWebTablesFieldEnteringOnlyFirstName(){
        elements.getWebTables().click();
        elements.getAddButton().click();
        elements.getFirstNameRegistration().clear();
        elements.getFirstNameRegistration().sendKeys(excelReader.getStringData("REGISTRATION FORM",1,0));
        elements.getSubmitRegistration().click();
        Assert.assertTrue(elements.getSubmitRegistration().isDisplayed());
    }

    @Test
    public void canUserClickTwiceOnDoubleClickButton() {
        scroll(elements.getButtonsField());
        elements.clickOnButtonsField();
        Actions act = new Actions(driver);
        act.doubleClick(elements.getDoubleClickButton()).perform();
        Assert.assertTrue(elements.getMessageDoubleClick().isDisplayed());
        Assert.assertTrue(elements.messageeDoubleClik().equals("You have done a double click"));
    }

    @Test
    public void canUserRightClickOnRightClickButton(){
        scroll(elements.getButtonsField());
        elements.clickOnButtonsField();
        Actions actions = new Actions(driver);
        actions.contextClick(elements.getRightClickButton()).perform();
        Assert.assertTrue(elements.getMessageRightClick().isDisplayed());
        Assert.assertTrue(elements.messageeRightClick().equals("You have done a right click"));
    }
    @Test
    public void canUserClickOnClickMeButton(){
        scroll(elements.getButtonsField());
        elements.clickOnButtonsField();
        elements.getClickMeButton().click();
        Assert.assertTrue(elements.getMessageClick().isDisplayed());
        Assert.assertTrue(elements.messageeClick().equals("You have done a dynamic click"));

    }

}
