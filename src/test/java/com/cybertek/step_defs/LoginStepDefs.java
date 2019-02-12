package com.cybertek.step_defs;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class LoginStepDefs {

    @Given("manager is on the landing page")
    public void manager_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("manager clicks on BriteErpDemo button")
    public void manager_clicks_on_BriteErpDemo_button() {

        LandingPage landingPage = new LandingPage();

        landingPage.briteErpDemoButton.click();
    }

    @Then("the title should be Login Website localhost")
    public void the_title_should_be_Login_Website_localhost() {

        assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }


    @Then("the database should be {string}")
    public void the_database_should_be(String expectedText) {

        LoginPage loginPage = new LoginPage();

        assertEquals(expectedText, loginPage.databaseText.getAttribute("value"));
    }

    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        LoginPage loginPage = new LoginPage();

        loginPage.emailInput.sendKeys(ConfigReader.getProperty("manager-username"));
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        LoginPage loginPage = new LoginPage();

        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("manager-password"));
    }

    @When("the manager clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();

    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() {
        assertEquals("Login | Website localhost", Driver.getDriver().getTitle());

    }


    //USER

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user clicks on BriteErpDemo button")
    public void user_clicks_on_BriteErpDemo_button() {
        LandingPage landingPage = new LandingPage();
        landingPage.briteErpDemoButton.click();
        BrowserUtils.wait(3);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("the user enters valid email address")
    public void the_user_enters_valid_email_address() {
        LoginPage loginPage = new LoginPage();

        loginPage.emailInput.sendKeys(ConfigReader.getProperty("user-username"));
    }

    @When("the user enters valid password")
    public void the_user_enters_valid_password() {
        LoginPage loginPage = new LoginPage();

        loginPage.passwordInput.sendKeys("user-password");
    }

    @When("the user clicks Log in button")
    public void the_user_clicks_Log_in_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
    }



}
