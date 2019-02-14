package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage {

    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "BriteErpDemo")
    public WebElement briteErpDemoButton;

    @FindBy(linkText = "BriteErp")
    public WebElement britErp;

    @FindBy (linkText = "Test")
    public  WebElement test;

    @FindBy(xpath = "//a[@class]")
    public List<WebElement> dataBaseLinks;


}
