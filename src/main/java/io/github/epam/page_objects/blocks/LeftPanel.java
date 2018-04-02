package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel {
    WebDriver driver;
    public LeftPanel(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Описание элементов:

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Home']") // "кнопка-пролет" боковой панели инструментов "Home", осуществляющая переход пользователя на "Домашнюю страницу"
    private WebElement homeSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Contact form']") // "кнопка-пролет" боковой панели инструментов "Contact form", осуществляющая переход на страницу с "Формой обратной связи"
    private WebElement contactFormSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Service']") // "кнопка-пролет" боковой панели инструментов "Service", скрывающая\раскрывающая список всех доступных сервисов сайта Epam...
    private WebElement serviceSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Support']") // "кнопка-пролет" боковой панели инструментов "Support", переводящая на страницу "Поддержка"
    private WebElement supportSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Dates']") // "кнопка-пролет" боковой панели инструментов "Dates", переводящая на страницу с полем "Даты"
    private WebElement datesSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Complex Table']") // "кнопка-пролет" боковой панели инструментов "Complex Table", переводящая на страницу "Сложная Таблица"
    private WebElement complexTableSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Simple Table']") // "кнопка-пролет" боковой панели инструментов "Simple Table", переводящая на страницу "Простая Таблица"
    private WebElement simpleTableSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='User Table']") // "кнопка-пролет" боковой панели инструментов "User Table", перевожящая на страницу "Таблица пользователей"
    private WebElement userTableSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Table with pages']") // "кнопка-пролет" боковой панели инструментов "Table with pages", перевожящая на страницу "Таблица со страницами"
    private WebElement tableWithPagesSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Different elements']") // "кнопка-пролет" боковой панели инструментов "Different elements", перевожящая на страницу "Разные элементы"
    private WebElement differentElementsSpan;

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text()='Metals & Colors']") // "кнопка-пролет" боковой панели инструментов "Metals $ Colors", перевожящая на страницу "Металлы и цвета"
    private WebElement metalsColorsSpan;

    // Описание методов на уровне UI:

    protected void homeSpan(){
        homeSpan.click();}

    protected void contactFormSpan(){
        contactFormSpan.click();}

    protected void serviceSpan(){
        serviceSpan.click();}

    protected void supportSpan(){
        supportSpan.click();}

    protected void datesSpan(){
        datesSpan.click();}

    protected void complexTableSpan(){
        complexTableSpan.click();}

    protected void simpleTableSpan(){
        simpleTableSpan.click();}

    protected void userTableSpan(){
        userTableSpan.click();}

    protected void tableWithPagesSpan(){
        tableWithPagesSpan.click();}

    protected void differentElementsSpan(){
        differentElementsSpan.click();}

    protected void metalsColorsSpan(){
        metalsColorsSpan.click();}

}



