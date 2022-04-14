package br.com.br.com.chronosacademy.automacaoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {

    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String cssTítulo = "div.text-center>div.large-h1";
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTítulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

}
