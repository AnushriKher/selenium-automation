package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class SignupPage extends BaseTest {

    private final By signUpLink = By.linkText("Sign up");
    private final By usernameField = By.id("id_username");
    private final By emailField = By.id("id_email");
    private final By passwordField = By.id("id_password1");
    private final By signupBtn = By.xpath("//button[contains(text(),'Sign Up')]");

    public void goToSignupPage() {
        driver.findElement(signUpLink).click();
    }

    public void enterSignupDetails(String username, String email, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignup() {
        driver.findElement(signupBtn).click();
    } 

}
