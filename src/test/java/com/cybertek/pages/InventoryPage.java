package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage {

    public InventoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".o_sub_menu_content .oe_secondary_menu:nth-child(6)>div")
    public List<WebElement> actualSections;



}
