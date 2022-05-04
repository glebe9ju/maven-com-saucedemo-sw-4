package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyUserShouldLogInWithValidCredential(){
        homePage.enterUserName("standard_user");
        homePage.enterPassWord("secret_sauce");
        homePage.clickOnLoginButton();
        String expectedMessage = "PRODUCTS";
        String actualMessage = homePage.verifyProductTextDisplay();
        Assert.assertEquals(expectedMessage,actualMessage,"Text is correct");
    }
    @Test
    public void userCanVerifyItems(){
        homePage.enterUserName("standard_user");
        homePage.enterPassWord("secret_sauce");
        homePage.clickOnLoginButton();
        int expectedItem=6;
        int actualItem= productPage.getProductList();
//        Assert.assertTrue(expectedItem==actualItem,"Item is not matched");
        Assert.assertTrue(actualItem==expectedItem,"item is not matched");

        Assert.assertEquals(actualItem,expectedItem,"item is not matched");
    }



}

