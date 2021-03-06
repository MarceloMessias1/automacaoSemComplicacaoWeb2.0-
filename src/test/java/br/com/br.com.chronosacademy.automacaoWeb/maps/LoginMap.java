package br.com.br.com.chronosacademy.automacaoWeb.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "menuUserLink")
    public WebElement btnLogin;
    public WebElement btnFechar;
    public WebElement divFecharModal;
    public WebElement inpUserName;
    public WebElement inpPassword;
    public WebElement btnSignInp;
    public WebElement inpRemember;
    public WebElement linkCrateAccount;

}
