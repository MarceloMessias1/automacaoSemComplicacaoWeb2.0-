package br.com.br.com.chronosacademy.automacaoWeb;

import br.com.br.com.chronosacademy.automacaoWeb.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.StringValueExp;

import static org.junit.Assert.assertEquals;//40


public class testeWeb {

    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("firefox");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
}
    @Test
    public void primeiroTeste() {


        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);


    }

    @Test

    public void clicarBotao() {

        String xpathBotao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a/span/span[2]";
        WebElement clickBotao = driver.findElement(By.xpath(xpathBotao));
        clickBotao.click();




    }

    @Test


    public void validarTexto() {
        driver.get("https://chronosacademy.orbitpages.online/cursos");
        String validarTexto = "//*[@id=\"navbar-209\"]/ul/li[1]/a";
        WebElement validaTxt = driver.findElement(By.xpath(validarTexto));
        String titulo = validaTxt.getText();
        assertEquals("Produtos", titulo);


    }
@After
    public void finalizaTeste(){
    driver.quit();

}
}
