package actions.demo_webshop.home_action;

import generic_methods.GenericMethods;
import pages.demo_webshop.home_page.HomePage;

public class HomeAction extends HomePage {

    public GenericMethods genericMethods = new GenericMethods();

    public void clickOnLoginLink(){
        // Click on login link
        genericMethods.click(loginLink);

        // Validate Login Screen Visibility
        genericMethods.validateVisibilityOfElement(validateLoginScreen);

    }

    public void sucessLoginValidation(){
        genericMethods.validateVisibilityOfElement(logouButton);
    }
}
