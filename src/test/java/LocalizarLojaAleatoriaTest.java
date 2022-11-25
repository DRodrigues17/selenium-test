
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LocalizaLojaPage;

import static org.junit.Assert.assertEquals;

public class LocalizarLojaAleatoriaTest {

    static WebDriver driver;
    static LocalizaLojaPage localizaLojaPage;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/DLAR-/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas");
        driver.manage().window().maximize();
        localizaLojaPage = new LocalizaLojaPage(driver);
    }

    @Test
    public void devePesquisarPorPalavraAleatoria() throws Exception {
        localizaLojaPage.preencherCampoBusca("martello");
        Thread.sleep(5000);
        assertEquals(localizaLojaPage.vaidarMensagem(), "1 Americanas perto de você");
        System.out.println(localizaLojaPage.vaidarMensagem());
    }
}
