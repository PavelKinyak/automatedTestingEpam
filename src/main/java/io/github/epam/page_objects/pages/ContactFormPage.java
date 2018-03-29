package io.github.epam.page_objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/*класс описывает страницу https://epam.github.io/JDI/contacts.html , только то что находится на этой странице, не включает в себя хедер, футор, блоки слева и справа*/
//sfddsfsfdwerwer

public class ContactFormPage {
    WebDriver driver;
    public ContactFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //описание элементов
    @FindBy(css = "div.main-content-hg form#contact-form input#Name")  //форма name
    private WebElement name;

    @FindBy(css="div.main-content-hg form#contact-form input#LastName") // форма last name
    private WebElement lastNameField;

    @FindBy(css="div.main-content-hg form#contact-form input#Position")  // форма position
    private WebElement positionField;

    @FindBy(css="div.main-content-hg form#contact-form input#Passport")  //checkbox passport
    private WebElement passportCheckbox;

    @FindBy(css="div.main-content-hg form#contact-form input#Number")  // форма Number
    private WebElement numberField;

    @FindBy(css="div.main-content-hg form#contact-form input#Seria")  // форма Seria
    private WebElement seriaField;

    @FindBy(css="div.main-content-hg form#contact-form input#gender")  // выпадающий список gender
    private WebElement genderDropdown;

    @FindBy(css="div.main-content-hg form#contact-form input#religion")  // комбинированный список  Religion
    private WebElement genderReligion;

    @FindBy(css="div.main-content form.form div#wheather button")
    private WebElement wheatherButton;

    @FindBy(css="div.main-content form.form div#Description")
    private WebElement descriptionButton;




















    )  // комбинированный список  Religion
    private WebElement genderReligion;

    //действия с элементами на странице на уровке UI
    public void nameFieldSendKeys(String name){//ввод в форму имени
        nameField.sendKeys(name);
    }
}
