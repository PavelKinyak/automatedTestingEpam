package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootterPanelBlock {
    protected WebDriver driver;
    public FootterPanelBlock(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //описание элементов

    @FindBy(css = ".uui-pagination .fa-long-arrow-left")
    private WebElement leftArrow;

    @FindBy(css = ".uui-pagination .fa-long-arrow-right")
    private WebElement rightArrow;

    public void clickLeftArrow(){
        leftArrow.click();
    }

    public void clickRightArrow(){
        rightArrow.click();
    }

}
