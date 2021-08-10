package pages.demo_webshop.home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='header-links']//a[text() = 'Log in']")
    protected WebElement loginLink;

    @FindBy(xpath =  "//div[@class='page-title']/*[contains(text(), 'Please Sign In')]")
    protected WebElement validateLoginScreen;

    @FindBy(xpath = "//div[@class='header-links']//a[@class='ico-logout']")
    protected WebElement logouButton;
}
