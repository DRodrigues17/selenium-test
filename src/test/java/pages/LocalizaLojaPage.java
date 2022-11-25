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

    public String vaidarMensagem(){
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
    }
}
