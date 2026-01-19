package ui.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    // JANGAN INISIALISASI DI SINI - ini penyebab error
    WebDriver driver;
    LoginPage loginPage;

    // Constructor kosong WAJIB
    public LoginSteps() {
        // Biarkan kosong
    }

    @Given("user open login page")
    public void openLoginPage() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
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