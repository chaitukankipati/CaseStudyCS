package org.support.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.support.browser.Browser;

public class Hooks extends Browser {

    @BeforeClass
    public static void beforeScenario() {
        System.out.println("Scenario started: ");
    }

    @AfterClass
    public static void afterScenario() {
        Browser.quitBrowser();
    }
}
