package org.support.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import org.support.browser.Browser;
import org.support.pages.HomePage;
import org.support.pages.LoginPage;

import static org.support.browser.Browser.quitBrowser;


public class Sample extends Browser{

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("^I visit the page$")
    public void i_visit_the_page() throws Throwable {
        Browser.openBrowser();
        Browser.navigateToURL("https://phptravels.org/clientarea.php");
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" in login fields$")
    public void i_enter_and_in_login_fields(String mail, String pwd) throws Throwable {
        loginPage.email.sendKeys(mail);
        loginPage.password.sendKeys(pwd);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
        quitBrowser();
    }

    @And("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        loginPage.submit();
    }

    @Then("^I should see the home page$")
    public void i_should_see_the_home_page() throws Throwable {
        Assert.assertTrue("Not on Home Page", homePage.welcomeServiceLabel.exists());
    }

}