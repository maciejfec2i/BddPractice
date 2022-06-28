package com.maciejfec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPOM {

    private WebDriver driver;

    public ProductsPOM(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#shopping_cart_container > a")
    private WebElement shoppingCart;

    public WebElement getShoppingCart() {

        return shoppingCart;
    }
}
