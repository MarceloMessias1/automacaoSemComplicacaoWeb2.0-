package br.com.br.com.chronosacademy.automacaoWeb.pages;

import br.com.br.com.chronosacademy.automacaoWeb.maps.CursoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String getTitulo2() {
        return cursoMap.txtTitulo.getText();
    }
}