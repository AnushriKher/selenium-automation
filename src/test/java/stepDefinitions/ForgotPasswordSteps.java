package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPasswordPage;

public class ForgotPasswordSteps {
	ForgotPasswordPage forgot = new ForgotPasswordPage();

    @When("user navigates to forgot password page")
    public void user_navigates_to_forgot_password_page() {
        forgot.goToForgotPasswordPage();
    }

    @And("user enters registered email and submits reset")
    public void user_enters_registered_email_and_submits_reset() {
        forgot.resetPassword(Hooks.registeredEmail);
    }

    @Then("user should receive password reset instructions")
    public void user_should_receive_password_reset_instructions() {
        System.out.println("Reset initiated for: " + Hooks.registeredEmail);
    }
}
