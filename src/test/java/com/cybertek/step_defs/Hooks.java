package com.cybertek.step_defs;

import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {

       Driver.closeDriver();

    }

}
