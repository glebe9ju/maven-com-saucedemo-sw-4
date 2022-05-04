package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.xpath("//input[@id='user-name']");
    By passWord = By.xpath("//input[@id='password']");
    By logIn = By.xpath("//input[@id='login-button']");
    By verifyText = By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String user) {
        sendTextToElement(userName, user);
    }

    public void enterPassWord(String pass) {
        sendTextToElement(passWord, pass);
    }

    public void clickOnLoginButton() {
        clickOnElement(logIn);
    }

    public String verifyProductTextDisplay() {
        return getTextFromElement(verifyText);
    }

}
