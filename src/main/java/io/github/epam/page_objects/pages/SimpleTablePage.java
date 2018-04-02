package io.github.epam.page_objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleTablePage {
    WebDriver driver;
    public SimpleTablePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    /*@FindBy*/
}
