package io.github.epam.page_objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*класс описывает страницу https://epam.github.io/JDI/different-elements.html , только то что находится на этой странице, не включает в себя хедер, футор, блоки слева и справа*/

public class DefferentElementsPage {
    WebDriver driver;
    public DefferentElementsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //описание элементов
    @FindBy(css = "div.main-content div.checkbox-row label.label-checkbox:nth-child(1) input") // "флажок" выборки с названием Water
    private WebElement waterCheckBox;

    @FindBy(css = "div.main-content div.checkbox-row label.label-checkbox:nth-child(2) input") // "флажок" выборки с названием Earth
    private WebElement earthCheckBox;

    @FindBy(css = "div.main-content div.checkbox-row label.label-checkbox:nth-child(3) input") // "флажок" выборки с названием Wind
    private WebElement windCheckBox;

    @FindBy(css = "div.main-content div.checkbox-row label.label-checkbox:nth-child(4) input") // "флажок" выборки с названием Fire
    private WebElement fireCheckBox;

    @FindBy(css = "div.main-content div.checkbox-row label.label-radio:nth-child(1) input") // "радиокнопка" взаимоисключающих элементов выборки с названием Gold
    private WebElement goldRadio;

    @FindBy(css = "div.main-content div.checkbox-row label.label-radio:nth-child(2) input") // "радиокнопка" взаимоисключающих элементов выборки с названием Silver
    private WebElement silverRadio;

    @FindBy(css = "div.main-content div.checkbox-row label.label-radio:nth-child(3) input") // "радиокнопка" взаимоисключающих элементов выборки с названием Bronze
    private WebElement bronzeRadio;

    @FindBy(css = "div.main-content div.checkbox-row label.label-radio:nth-child(4) input") // "радиокнопка" взаимоисключающих элементов выборки с названием Selen
    private WebElement selenRadio;

    @FindBy(css = "div.main-content button[name='Default Button']") // кнопка сброса результатов выборки пользователя "DEFAULT BUTTON"
    private WebElement defaultButton;

    @FindBy(css = "div.main-content input[class=\"uui-button\"]") // кнопка сброса результатов выборки пользователя "BUTTON"
    private WebElement button;

    @FindBy(css = "div.main-content select[class=\"uui-form-element\"]") // строка состояния с вариантами выбора (Red, Green, Blue, Yellow)
    private WebElement select;

    //описание методов на уровне UI

    protected void waterCheckBoxclick(){
        waterCheckBox.click();}

    protected void earthCheckBoxclick(){
        earthCheckBox.click();}

    protected void windCheckBoxclick(){
        windCheckBox.click();}

    protected void fireCheckBoxclick(){
        fireCheckBox.click();}

    protected void goldRadioclick(){
        goldRadio.click();}

    protected void silverRadioclick(){
        silverRadio.click();}

    protected void bronzeRadioclick(){
        bronzeRadio.click();}

    protected void selenRadioclick(){
        selenRadio.click();}

    protected void defaultButtonclick(){
        defaultButton.click();}

    protected void buttonclick(){
        button.click();}

    protected void selectclick(){
        select.click();}



    }



}
