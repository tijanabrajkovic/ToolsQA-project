package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement textBox;
    WebElement checkBoxHomeButton;
    WebElement webTables;
    WebElement buttonsField;
    WebElement links;
    WebElement brokenLinks;
    WebElement uploadAndDownload;
    WebElement dynamicProperties;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submit;
    WebElement fullnameinTextForm;
    WebElement checkBoxField;
    WebElement plusButton;
    WebElement message;
    WebElement desktopButton;
    WebElement commandsButton;
    WebElement minusButton;
    WebElement notes;
    WebElement radioButtonField;
    WebElement radioButtonYes;
    WebElement messageYes;
    WebElement radioButtonImpressive;
    WebElement messageImpressive;
    WebElement addButton;
    WebElement firstNameRegistration;
    WebElement lastNameRegistration;
    WebElement emailRegistration;
    WebElement ageRegistration;
    WebElement salary;
    WebElement department;
    WebElement submitRegistration;
    WebElement nameOfNewPerson;
    WebElement doubleClickButton;
    WebElement messageDoubleClick;
    WebElement rightClickButton;
    WebElement messageRightClick;
    WebElement clickMeButton;
    WebElement messageClick;



    public Elements(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCommandsButton() {
        return driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-title"));
    }

    public WebElement getMessageClick() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
    }

    public WebElement getMessageRightClick() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getRightClickButton() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getMessageDoubleClick() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getDoubleClickButton() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getButtonsField() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getNameOfNewPerson() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(1)"));
    }

    public WebElement getSubmitRegistration() {
        return driver.findElement(By.cssSelector("#submit"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.cssSelector("#department"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.cssSelector("#salary"));
    }

    public WebElement getAgeRegistration() {
        return driver.findElement(By.cssSelector("#age"));
    }

    public WebElement getEmailRegistration() {
        return driver.findElement(By.cssSelector("#userEmail"));
    }

    public WebElement getLastNameRegistration() {
        return driver.findElement(By.cssSelector("#lastName"));
    }

    public WebElement getFirstNameRegistration() {
        return driver.findElement(By.cssSelector("#firstName"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector("#addNewRecordButton"));
    }

    public WebElement getMessageImpressive() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getRadioButtonImpressive() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label"));
    }

    public WebElement getMessageYes() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getRadioButtonYes() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label"));
    }

    public WebElement getRadioButtonField() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
    }

    public WebElement getNotes() {
        return driver.findElement(By.className("rct-title"));
    }

    public WebElement getMinusButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-collapse-all"));
    }

    public WebElement getDesktopButton() {
        return driver.findElement(By.xpath("//*[text()='Desktop']"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.cssSelector(".display-result.mt-4"));
    }

    public WebElement getCheckBoxField() {
        return driver.findElement(By.cssSelector("#item-1 > span"));
    }

    public WebElement getFullnameinTextForm() {
        return driver.findElement(By.cssSelector("#name"));
    }

    public WebElement getSubmit() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getFullName() {
        return driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }

    public WebElement getTextBox() {
        return driver.findElement(By.cssSelector("#item-0"));
    }

    public WebElement getCheckBoxHomeButton() {
        return driver.findElement(By.className("rct-title"));
    }

    public WebElement getPlusButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
    }


    public WebElement getWebTables() {
        return driver.findElement(By.cssSelector("#item-3"));
    }

    public WebElement getLinks() {
        return links;
    }

    public WebElement getBrokenLinks() {
        return brokenLinks;
    }

    public WebElement getUploadAndDownload() {
        return uploadAndDownload;
    }

    public WebElement getDynamicProperties() {
        return dynamicProperties;
    }
    /*
    ********************************  METODE  **********************************************************
     */
    public void clickOnTextBox(){
        getTextBox().click();
    }
    public void clickOnFullName(){
        getFullName().click();
    }
    public void clickOnEmailField(){
        getEmail().click();
    }
    public void clickOnCurrentAddress(){
        getCurrentAddress().click();
    }
    public void clickOnPermanentAddress(){
        getPermanentAddress().click();
    }
    public void clickOnSubmitButton(){
        getSubmit().click();
    }
    public void fullNameText(){
        getFullnameinTextForm().getText();
    }
    public void clickOnHomeButton(){
        getCheckBoxHomeButton().click();
    }
    public void clickOnCheckBoxField(){
        getCheckBoxField().click();
    }
    public void clickOnPlusButton(){
        getPlusButton().click();
    }
    public String getMessageeText(){
        return this.getMessage().getText();
    }
    public void clickOnMinusButton(){
        getMinusButton().click();
    }
    public void clickOnRadioButtonField(){
        getRadioButtonField().click();
    }
    public void clickOnRadioButtonYes(){
     getRadioButtonYes().click();
    }
    public String readMessage1(){
        return this.getMessageYes().getText();
    }
    public void clickOnRadioButtonImpressive(){
        getRadioButtonImpressive().click();
    }
    public String readMessage2(){
        return this.getMessageImpressive().getText();
    }
    public String getName(){
        return this.getNameOfNewPerson().getText();
    }
    public void clickOnButtonsField() {
        getButtonsField().click();
    }
    public String messageeDoubleClik(){
        return this.getMessageDoubleClick().getText();

    }
    public String messageeRightClick(){
        return this.getMessageRightClick().getText();
    }
    public String messageeClick(){
        return this.getMessageClick().getText();
    }
    public String fullNameTextFormMessage(){
        return  this.getFullnameinTextForm().getText();
    }

}
