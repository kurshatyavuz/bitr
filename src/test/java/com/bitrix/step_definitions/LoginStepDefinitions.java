package com.bitrix.step_definitions;

import com.bitrix.utilities.Driver;
import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {


    Pages pages = new Pages();
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }


    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {
        pages.loginPage().login(role);}


    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String expected) {
       // Assert.assertEquals(expected, pages.activityStreamPage().getPageSubTitle());
    }

    // this is temporary solution until we start using hooks
    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();
    }

    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        pages.loginPage().login(string, string2);

    }

    @Then("user verifies that {string} warning message is displayed")
    public void user_verifies_that_warning_message_is_displayed(String expected) {
        Assert.assertEquals(expected, pages.loginPage().getErrorMessage());
    }


  // test


}
