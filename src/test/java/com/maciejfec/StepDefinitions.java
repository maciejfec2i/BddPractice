package com.maciejfec;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

public class StepDefinitions extends BaseClass {

    @Before
    public void setUp() {

        super.setUp();
    }

    @After
    public void tearDown() {

        super.tearDown();
    }

    @Given("^(?i)i am on the login page$")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I input a {string}")
    public void i_input_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("^(?i)i press the login button$")
    public void i_press_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("^(?i)an error should appear$")
    public void an_error_should_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("^(?i)i should be on the products page$")
    public void i_should_be_on_the_products_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
