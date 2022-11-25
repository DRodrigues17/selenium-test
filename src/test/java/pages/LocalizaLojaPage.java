package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalizaLojaPage {
    static WebDriver driver;
    public LocalizaLojaPage(WebDriver driver) {
        LocalizaLojaPage.driver = driver;
    }

    public void preencherCampoBusca(String endereco){
        WebElement busca = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        busca.sendKeys(endereco);
        busca.sendKeys(Keys.ENTER);
    }

    public String validarMensagem(){
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
    }

    public void clicarEmBotaoDeTroca(){
        WebElement botao = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]"));
        botao.click();
    }

    public void preencherCampoDoPopup(String endereco){
        WebElement popup = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/input[1]"));
        popup.sendKeys(endereco);
        popup.sendKeys(Keys.ENTER);
    }
}
