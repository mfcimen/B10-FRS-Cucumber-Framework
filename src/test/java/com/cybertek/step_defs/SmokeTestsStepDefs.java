package com.cybertek.step_defs;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.InventoryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SmokeTestsStepDefs {

    @Then("the manager should see Inventory tab on the navigation bar")
    public void the_manager_should_see_Inventory_tab_on_the_navigation_bar() {

        HomePage homePage = new HomePage();

        System.out.println(homePage.inventoryText.getText());

        Assert.assertTrue(homePage.inventoryText.isDisplayed());
    }

    @When("the manager clicks Inventory tab on the navigation tab")
    public void the_manager_clicks_Inventory_tab_on_the_navigation_tab() {
        HomePage homePage = new HomePage();

        homePage.inventoryText.click();

    }

    @Then("the manager should see following sections on the left navigation bar:")
    public void the_manager_should_see_following_sections_on_the_left_navigation_bar(List<String> expectedSections) {
        InventoryPage inventoryPage = new InventoryPage();

        System.out.println("From feature file: " + expectedSections);

        for (WebElement section : inventoryPage.actualSections) {
            System.out.println("From website: " + section.getText());
        }


        List<String> sections = new ArrayList<>();

        sections.addAll(expectedSections);

        Assert.assertEquals(expectedSections, sections);


    }



}
