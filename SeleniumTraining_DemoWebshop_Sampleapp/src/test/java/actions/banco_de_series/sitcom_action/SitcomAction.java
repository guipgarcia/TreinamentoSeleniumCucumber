package actions.banco_de_series.sitcom_action;

import generic_methods.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.banco_de_series.sitcom_page.SitcomPage;

import static project_global_variables.GlobalVariables.SITCOM_TITLE;

public class SitcomAction extends SitcomPage {
    GenericMethods gm = new GenericMethods();

    public void validateSitcomTitle(){
        wait.until(ExpectedConditions.visibilityOf(sitcomTitle));
        Assert.assertEquals(gm.returnText(SITCOM_TITLE), sitcomTitle.getText());
    }
}
