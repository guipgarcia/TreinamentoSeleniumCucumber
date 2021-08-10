package pages.demo_webshop.login_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "Email")
    protected WebElement emailField;

    @FindBy(id = "Password")
    protected WebElement passwordField;

    @FindBy(id = "RememberMe")
    protected WebElement rememberMeField;

    @FindBy(xpath = "//a[text() = 'Forgot password?']")
    protected WebElement forgotPasswordLink;

    @FindBy(xpath = "//input[@value = 'Log in']")
    protected WebElement loginButton;

}
