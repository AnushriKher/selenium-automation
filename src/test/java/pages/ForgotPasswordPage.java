package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class ForgotPasswordPage extends BaseTest {

    private final By forgotPasswordLink = By.linkText("Forgot Password?");
    private final By emailField = By.id("id_email");
    private final By resetBtn = By.xpath("//button[contains(text(),'Reset Password')]");

    public void goToForgotPasswordPage() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void resetPassword(String email) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(resetBtn).click();
    }

}
