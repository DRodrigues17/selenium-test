import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BuscaPages;

import static org.junit.Assert.assertEquals;


public class AcessarPaginaTest {

    static WebDriver driver;
    static BuscaPages buscaPages;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/DLAR-/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.canecadodev.com");
        driver.manage().window().maximize();
        buscaPages = new BuscaPages(driver);
    }

    @Test
    public void devePreencherCampoEPesquisar(){
        buscaPages.PreencherCampoBusca();
        buscaPages.ClicarEmBuscar();
        assertEquals(buscaPages.vaidarMensagem(), "Sua busca por: \"asdfrwqw\" não encontrou nenhum resultado");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // driver.quit();
    }
}
