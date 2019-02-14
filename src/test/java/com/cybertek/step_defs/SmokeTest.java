package com.cybertek.step_defs;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SmokeTest {

    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();



    @Given("the user opens a browser")
    public void the_user_opens_a_browser() {

    }

    @When("the user goes to http://52.39.162.23/")
    public void the_user_goes_to_http() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("the page should contain <links> to databases")
    public void the_page_should_contain_links_to_databases(List<String> databaseNames) {
        List<WebElement> links = landingPage.dataBaseLinks;
        Assert.assertEquals(databaseNames.size(), links.size());
        for(int i=0; i<links.size(); i++){
            //System.out.println(links.get(i).getText());
            Assert.assertEquals(links.get(i).getText(), databaseNames.get(i));
        }
        /*
        Solution #2:
        List <String> linksNames = new ArrayList();
        for(int i=0; i<links.size(); i++){
            linksNames.add(links.get(i).getText());
        }
        Assert.asserTrue(linksNames.containsAll(databaseNames));
         */

    }



    @Given("the user clicks on BriteErpDemo")
    public void the_user_clicks_on_BriteErpDemo() {
       landingPage.briteErpDemoButton.click();
    }


    @When("the user enters valid {string} and {string}")
    public void the_user_enters_valid_and(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("the url is correct")
    public void the_url_is_correct() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        String expectedUrl = "http://52.39.162.23/web?#menu_id=115&action=120&active_id=channel_inbox";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
       Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    @Then("the title contains {string}")
    public void the_title_contains(String string) {
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

 //BREAK TILL 2:05pm
}
