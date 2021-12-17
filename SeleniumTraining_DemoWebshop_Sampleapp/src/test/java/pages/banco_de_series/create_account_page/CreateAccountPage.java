package pages.banco_de_series.create_account_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

    @FindBy(xpath = "//div[@id = 'myModalCadastro']//input[@name = 'login']")
    protected WebElement loginField;

    @FindBy(xpath = "//div[@id = 'myModalCadastro']//input[@name = 'email']")
    protected WebElement emailField;

    @FindBy(xpath = "//div[@id = 'myModalCadastro']//input[@name = 'pw']")
    protected WebElement passwordField;

    @FindBy(xpath = "//div[@id = 'myModalCadastro']//input[@name = 'pw2']")
    protected WebElement repeatPasswordField;

    @FindBy(xpath = "//div[@id = 'myModalCadastro']//button[text() = 'Cadastre-se']")
    protected WebElement registerButton;
}
