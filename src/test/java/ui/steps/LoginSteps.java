package ui.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user open login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @When("user login using {string} and {string}")
    public void login(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Then("user should be redirected to inventory page")
    public void verifyLogin() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        DriverFactory.quitDriver();
    }
}
