package io.github.epam.page_objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    private WebElement Name;

    @FindBy(css="div.main-content-hg form#contact-form input#LastName") //last name
    private WebElement LastName;

    @FindBy(css="div.main-content-hg form#contact-form input#Position")  //position
    private WebElement Position;

    @FindBy(css="div.main-content-hg form#contact-form input#Passport")  //checkbox passport
    private WebElement Passport;

    @FindBy(css="div.main-content-hg form#contact-form input#Passport")  //checkbox passport
    private WebElement Passport;




    //действия с элементами на странице на уровке UI
    public void nameFieldSendKeys(String name){//ввод в форму имени
        nameField.sendKeys(name);
    }
}
