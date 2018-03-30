package io.github.epam.page_objects.bisnessLogic;

import io.github.epam.page_objects.blocks.HeaderPanelBlock;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BisnessLogicHeaderPanelBlock extends HeaderPanelBlock{

    public BisnessLogicHeaderPanelBlock(WebDriver driver) {
        super(driver);

    }

    public void loginUser(String login, String password){ //авторизация пользователя
        loginDropdownClick();
        loginFieldSendKeys(login);
        passwordFieldSendKeys(password);
        enterButtonClick();
        Assert.assertTrue(logoutButtonIsDisplayed());
    }

    public void logoutUser(){ //выход пользователя из системы
        if(!logoutButtonIsDisplayed()){ //проверяем что dropdown свёрнут, если нет то разворачиваем
            loginDropdownClick();
        }
        logoutButtonClick();
        Assert.assertFalse(logoutButtonIsDisplayed());
    }

    public void checkAllPagesFromHeader(){ //проверяем все страницы хедера на валидность
        contactFormLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Contact Form"));
        supportLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Support"));
        datesLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Dates"));
        complexTableLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Complex Table"));
        userTableLinkClick();
        Assert.assertTrue(driver.getTitle().equals("User Table"));
        tableWithPagesLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Table with pages "));
        differentElementsLinkClick();
        Assert.assertTrue(driver.getTitle().equals("Different Element "));
    }


}
