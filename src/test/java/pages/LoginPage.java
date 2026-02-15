package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class LoginPage extends BaseTest {

    private final By signInLink = By.linkText("Sign in");
    private final By usernameOrEmailField = By.id("id_login");
    private final By passwordField = By.id("id_password");
    private final By loginBtn = By.xpath("//button[contains(text(),'Sign In')]");

    public void goToLoginPage() {
        driver.findElement(signInLink).click();
    }

    public void enterLoginDetails(String email, String password) {
        driver.findElement(usernameOrEmailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    } 

}
