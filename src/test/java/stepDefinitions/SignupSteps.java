package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;
import utils.DataGenerator;

public class SignupSteps {
	
	SignupPage signup = new SignupPage();
    String username = DataGenerator.generateUsername();
    String email = DataGenerator.generateEmail();
    String password = DataGenerator.generatePassword();

    @Given("user launches the Leetcode site")
    public void user_launches_the_leetcode_site() {
        // already handled in Hooks
    }

    @When("user navigates to signup page")
    public void user_navigates_to_signup_page() {
        signup.goToSignupPage();
    }

    @And("user enters dynamic user data and submits")
    public void user_enters_dynamic_user_data_and_submits() {
        signup.enterSignupDetails(username, email, password);
        signup.clickSignup();

        // Save the registered credentials to use later
        Hooks.registeredEmail = email;
        Hooks.registeredPassword = password;
    }

    @Then("user account should be created successfully")
    public void user_account_should_be_created_successfully() {
        System.out.println("Signup completed with: " + email + " / " + password);
    }

}
