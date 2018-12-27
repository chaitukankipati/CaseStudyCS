package org.support.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static WebDriver driver;

    private WebDriver initializeBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void openBrowser() {
        Browser browser = new Browser();
        browser.initializeBrowser("Chrome");
    }

    public static void quitBrowser() {
        driver.quit();
    }

    public static void navigateToURL(String URL) {
        driver.navigate().to(URL);
    }

}
