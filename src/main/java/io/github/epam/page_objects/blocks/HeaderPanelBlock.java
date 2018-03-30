package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//класс описывает блок хедер

public class HeaderPanelBlock {
    protected WebDriver driver;
    public HeaderPanelBlock(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //описание элементов

    @FindBy(xpath = "//header//a[text() = 'Home']")
    private WebElement homeLink;

    @FindBy(xpath = "//header//a[text() = 'Contact form']")
    private WebElement contactFormLink;

    @FindBy(xpath = "//header//a[normalize-space(text()) = 'Service']")
    private WebElement serviceDropDown;

    @FindBy(xpath = "//header//a[text() = 'Support']")
    private WebElement supportLink;

    @FindBy(xpath = "//header//a[text() = 'Dates']")
    private WebElement datesLink;

    @FindBy(xpath = "//header//a[text() = 'Complex Table ']")
    private WebElement complexTableLink;

    @FindBy(xpath = "//header//a[text() = 'Simple Table ']")
    private WebElement simpleTableLink;

    @FindBy(xpath = "//header//a[text() = 'User Table ']")
    private WebElement userTableLink;

    @FindBy(xpath = "//header//a[text() = 'Table with pages']")
    private WebElement tableWithPagesLink;

    @FindBy(xpath = "//header//a[text() = 'Different elements']")
    private WebElement differentElementsLink;

    @FindBy(xpath = "//header//a[text() = 'Metals & Colors']")
    private WebElement metalsAndColorsLink;

    @FindBy(css = "header div.search>span.icon-search") //иконка лупы
    private WebElement searchIcon;

    @FindBy(css = "header div.search div.search-field input") //поле поиска, открывается по иконке лупы
    private WebElement searchField;

    @FindBy(css = "header ul.navbar-right a.dropdown-toggle")
    private WebElement loginDropdown;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login div.logout button") //кнопка логаута доступна только для авторизованных пользователю
    private WebElement logoutButton;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login form#login-form input#Name") //поле логина, доступно только НЕавторизованному пользователю
    private WebElement loginField;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login form#login-form input#Password") //поле пароля, доступно только НЕавторизованному пользователю
    private WebElement passwordField;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login form#login-form button.btn-login") //кнока Enter, доступно только НЕавторизованному пользователю
    private WebElement enterButton;


    //действия с элементами на странице на уровке UI

    protected void homeLinkClick(){
        homeLink.click();
    }

    protected void contactFormLinkClick(){
        contactFormLink.click();
    }

    protected void supportLinkClick(){
        serviceDropDown.click();
        supportLink.click();
    }

    protected void datesLinkClick(){
        serviceDropDown.click();
        supportLink.click();
    }

    protected void complexTableLinkClick(){
        serviceDropDown.click();
        complexTableLink.click();
    }

    protected void simpleTableLinkClick(){
        serviceDropDown.click();
        simpleTableLink.click();
    }

    protected void userTableLinkClick(){
        serviceDropDown.click();
        userTableLink.click();
    }

    protected void tableWithPagesLinkClick(){
        serviceDropDown.click();
        tableWithPagesLink.click();
    }

    protected void differentElementsLinkClick(){
        serviceDropDown.click();
        differentElementsLink.click();
    }

    protected void MetalsAndColorsLinkClick(){
        metalsAndColorsLink.click();
    }

    protected void searchIconClick(){
        searchIcon.click();
    }

    protected void searchFieldSendKeys(String request){ //ввести в поле поиска запрос, доступно только после нажатия иконки лупы
        searchField.sendKeys(request);
    }

    protected void loginDropdownClick(){
        loginDropdown.click();
    }

    protected void loginFieldSendKeys(String login){ //заполнить поле логин, только для НЕавторизованного пользователя
        loginField.sendKeys(login);
    }

    protected void passwordFieldSendKeys(String password){ //заполнить поле пароль, только для НЕавторизованного пользователя
        passwordField.sendKeys(password);
    }

    protected void enterButtonClick(){ //нажать кнопку Enter, только для НЕавторизованного пользователя
        enterButton.click();
    }

    protected void logoutButtonClick(){ //нажать кнопку logout, только для авторизованного пользователя
        logoutButton.click();
    }

    protected boolean logoutButtonIsDisplayed(){
       return logoutButton.isDisplayed();
    }

}
