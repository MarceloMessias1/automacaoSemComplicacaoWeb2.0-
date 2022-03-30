package br.com.br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.StringValueExp;

import static org.junit.Assert.assertEquals;


public class testeWeb {

    @Test


    public void primeiroTeste() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");


        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);

        driver.quit();

    }

    @Test

    public void clicarBotao() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");

        String xpathBotao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a/span/span[2]";
        WebElement clickBotao = driver.findElement(By.xpath(xpathBotao));
        clickBotao.click();

        driver.quit();


    }

    @Test


    public void validarTexto() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chronosacademy.orbitpages.online/cursos");

        String validarTexto = "//*[@id=\"navbar-209\"]/ul/li[1]/a";
        WebElement validaTxt = driver.findElement(By.xpath(validarTexto));
        String titulo = validaTxt.getText();
        assertEquals("Produtos", titulo);

        driver.quit();

    }

}