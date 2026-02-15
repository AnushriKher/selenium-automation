package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	LoginPage login = new LoginPage();

    @When("user navigates to login page")
    public void user_navigates_to_login_page() {
        login.goToLoginPage();
    }

    @And("user enters valid login credentials and submits")
    public void user_enters_valid_login_credentials_and_submits() {
        login.enterLoginDetails(Hooks.registeredEmail, Hooks.registeredPassword);
        login.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful with: " + Hooks.registeredEmail);
    }

}
