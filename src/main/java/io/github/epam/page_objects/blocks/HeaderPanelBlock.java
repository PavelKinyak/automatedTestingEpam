package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPanelBlock {
    WebDriver driver;
    public HeaderPanelBlock(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    
}
