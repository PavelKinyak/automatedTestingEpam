package base;

import io.github.epam.page_objects.bisnessLogic.BisnessLogicHeaderPanelBlock;
import io.github.epam.page_objects.blocks.FootterPanelBlock;
import io.github.epam.page_objects.blocks.HeaderPanelBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseDriverClass {
    public static WebDriver driver;
    //добавляем классы с бизнес-логикой
    protected static BisnessLogicHeaderPanelBlock bisnessLogicHeaderPanelBlock;
    protected static FootterPanelBlock footterPanelBlock;


    protected static void setupDriver(){
        driver = new ChromeDriver();
        //инициализация страниц
        footterPanelBlock = new FootterPanelBlock(driver);
        //инициализируем классы с бизнес-логикой
        bisnessLogicHeaderPanelBlock = new BisnessLogicHeaderPanelBlock(driver);
        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
