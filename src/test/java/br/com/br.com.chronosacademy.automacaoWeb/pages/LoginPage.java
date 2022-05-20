package br.com.br.com.chronosacademy.automacaoWeb.pages;

import br.com.br.com.chronosacademy.automacaoWeb.core.Driver;
import br.com.br.com.chronosacademy.automacaoWeb.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickDivFecharModal(){
        loginMap.divFecharModal.click();
    }

    public void setInpUserName(String username){
        loginMap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password){
        loginMap.inpPassword.sendKeys(password);
    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount(){
        loginMap.linkCrateAccount.click();
    }

    public void clickBtnSignIn(){
        loginMap.btnSignInp.click();
    }

    public boolean isBtnSignIn(){
        return loginMap.btnSignInp.isEnabled();
    }
}