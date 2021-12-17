package pages.banco_de_series.home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@type = 'submit' and @value = 'Close ad']")
    protected WebElement closeAdButton;

    @FindBy(xpath = "//*[@id = 'dismiss-button']")
    protected WebElement dismissButton;

    @FindBy(xpath = "//div[@id = 'maincollapse']//a[text() = 'Criar Conta']")
    protected WebElement createAccountButton;

    @FindBy(id = "myModalLabelCadastro")
    protected WebElement registerModalTitle;
}
