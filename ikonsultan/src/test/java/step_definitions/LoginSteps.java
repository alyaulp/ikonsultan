package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website cura healthcare service")
    public void verifyLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User copy username and password to column and click login button")
    public void inputCredential() {
        LoginPage loginPage = new LoginPage(webDriver);
        String usernameCopied = loginPage.getUsername();
        String passwordCopied = loginPage.getPassword();
        loginPage.setUsername(usernameCopied);
        loginPage.setPassword(passwordCopied);
        loginPage.clickLogin();
    }

    @Then("^User already on landing page$")
    public void userAlreadyOnLandingPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingPage());
    }
}
