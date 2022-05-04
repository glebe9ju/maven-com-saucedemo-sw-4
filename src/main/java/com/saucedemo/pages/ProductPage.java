package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends Utility
{
    By productsName = By.xpath("//span[contains(text(),'Products')]");


    public int getProductList(){

        List<WebElement> itemLists = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        //div[@class='inventory_item']
        //number of item displayed
        //if you enter wrong number then number of items are not six message will appear
//        System.out.println("Number of items displayed : " + itemLists.size());
        int i = itemLists.size();
        return i;
     }
}