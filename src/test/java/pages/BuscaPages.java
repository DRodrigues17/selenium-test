package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaPages {

    static WebDriver driver;

    public BuscaPages(WebDriver driver) {
        BuscaPages.driver = driver;
    }

    public void PreencherCampoBusca(){
        WebElement produto = driver.findElement(By.xpath("//input[@id='auto-complete']"));
        produto.sendKeys("asdfrwqw");
    }

    public void ClicarEmBuscar(){
        WebElement buscar = driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/button[1]"));
        buscar.click();
    }

    public String vaidarMensagem(){
        return driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/h1[1]")).getText();
    }
}
