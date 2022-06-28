package com.maciejfec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

    private WebDriver driver;

    public LoginPOM(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-test='username']")
    private WebElement usernameField;

    @FindBy(css = "input[data-test='password']")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(css = "h3[data-test='error']")
    private WebElement loginError;

    public void inputUsername(String username) {

        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {

        passwordField.sendKeys(password);
    }

    public void clickLoginBtn() {

        loginBtn.click();
    }

    public void login(String username, String password) {

        inputUsername(username);
        inputPassword(password);
        clickLoginBtn();
    }

    public String getLoginBtnText() {

        return loginBtn.getAttribute("value");
    }

    public WebElement getLoginError() {

        return loginError;
    }
}
