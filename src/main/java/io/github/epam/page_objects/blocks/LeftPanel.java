package io.github.epam.page_objects.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel {
    WebDriver driver;
    public LeftPanel(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @F
}
