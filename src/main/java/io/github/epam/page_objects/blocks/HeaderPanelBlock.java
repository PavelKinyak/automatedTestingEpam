package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//класс описывает блок хедер

public class HeaderPanelBlock {
    WebDriver driver;
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
    private WebElement MetalsAndColorsLink;

    @FindBy(css = "header div.search>span.icon-search")
    private WebElement searchIcon;

    @FindBy(css = "header div.search div.search-field input")
    private WebElement searchField;

    @FindBy(css = "header ul.navbar-right a.dropdown-toggle")
    private WebElement loginDropdown;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login div.logout button") //кнопка логаута доступна только для авторизованных пользователю
    private WebElement logoutButton;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login form#login-form input#Name") //поле логина, доступно только неавторизованному пользователю
    private WebElement loginField;

    @FindBy(css = "header ul.navbar-right div.dropdown-menu-login form#login-form input#Password") //поле пароля, доступно только неавторизованному пользователю
    private WebElement passwordField;


    //действия с элементами на странице на уровке UI

    public void homeLinkClick(){
        homeLink.click();
    }
}
