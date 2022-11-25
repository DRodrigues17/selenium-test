
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LocalizaLojaPage;

import java.time.Duration;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(localizaLojaPage.vaidarMensagem(), "1 Americanas perto de você");
        String endereco = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/h3[1]")).getText();
        System.out.println("foi buscado por " + endereco +" e achamos o total de " + localizaLojaPage.vaidarMensagem());
    }
}
