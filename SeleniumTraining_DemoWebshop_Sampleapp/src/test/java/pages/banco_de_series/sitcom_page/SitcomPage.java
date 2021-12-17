package pages.banco_de_series.sitcom_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitcomPage extends BasePage {

    @FindBy(xpath = "//div[@class='panel-footer']/h3/b")
    protected WebElement sitcomTitle;
}
