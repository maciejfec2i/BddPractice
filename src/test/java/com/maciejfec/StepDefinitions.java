package com.maciejfec;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StepDefinitions extends BaseClass {

    private LoginPOM loginPage;
    private ProductsPOM productsPage;
    @Before
    public void setUp() {

        super.setUp();
        loginPage = new LoginPOM(super.getDriver());
        productsPage = new ProductsPOM(super.getDriver());
    }

    @After
    public void tearDown() {

        super.tearDown();
    }

    @Given("^(?i)i am on the login page$")
    public void i_am_on_the_login_page() {

        super.getDriver().get(super.getBaseUrl());
        StaticHelpers.waitForElement(super.getDriver(), 3, By.id("login-button"));
        assertThat("Login page was not loaded", loginPage.getLoginBtnText().equals("Login"));
    }
    @Given("I input username {string}")
    public void i_input_username(String username) {

        loginPage.inputUsername(username);
    }

    @Given("I input password {string}")
    public void i_input_password(String password) {

        loginPage.inputPassword(password);
    }
    @When("^(?i)i press the login button$")
    public void i_press_the_login_button() {

        loginPage.clickLoginBtn();
    }
    @Then("^(?i)an error should appear$")
    public void an_error_should_appear() {

        StaticHelpers.waitForElement(super.getDriver(), 3, By.cssSelector("h3[data-test='error']"));
        assertThat("Error not present", loginPage.getLoginError().isDisplayed(), is(true));
    }

    @Then("^(?i)i should be on the products page$")
    public void i_should_be_on_the_products_page() {

        StaticHelpers.waitForElement(super.getDriver(), 3, By.cssSelector("#shopping_cart_container > a"));
        assertThat("Not logged in", productsPage.getShoppingCart().isDisplayed(), is(true));
    }
}
