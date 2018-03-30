import base.BaseDriverClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




//Тестовый класс, удалить за ненужностью

public class TestFurs extends BaseDriverClass {

    @BeforeMethod
    public void beforeMethod(){
        setupDriver();
        driver.get("https://epam.github.io/JDI/index.html");
    }

    @AfterMethod
    public void afterMethod(){
        //driver.manage().deleteAllCookies();
        //driver.quit();
    }

    @Test
    public void autorization(){
        bisnessLogicHeaderPanelBlock.loginUser("epam", "1234");
        //bisnessLogicHeaderPanelBlock.logoutUser();
        //bisnessLogicHeaderPanelBlock.checkAllPagesFromHeader();
        //bisnessLogicHeaderPanelBlock.doSerch("support");
        headerPanelBlock.differentElementsLinkClick();
        defferentElementsPage.setSelectColor("Blue");
        defferentElementsPage.goldRadioclick();
    }
}
