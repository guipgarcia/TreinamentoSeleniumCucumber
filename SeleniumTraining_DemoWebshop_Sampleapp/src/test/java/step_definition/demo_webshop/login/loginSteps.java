package step_definition.demo_webshop.login;

import actions.demo_webshop.home_action.HomeAction;
import actions.demo_webshop.login_action.LoginAction;
import base.BasePage;
import generic_methods.GenericMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static project_global_variables.GlobalVariables.DEMO_WEBSHOP_APPLICATION;

public class loginSteps extends BasePage {

    public GenericMethods genericMethods = new GenericMethods();
    private HomeAction homeAction = new HomeAction();

    @Given("that I access demo webshop application")
    public void that_i_access_demo_webshop_application() {
        // Passar demo webshop application
        genericMethods.openUrl(DEMO_WEBSHOP_APPLICATION);
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {

        homeAction.clickOnLoginLink();
    }

    @And("input my {string} and {string}")
    public void inputMyAnd(String username, String password) {
        LoginAction loginAction = new LoginAction();
        loginAction.fillLoginForm(username, password);
    }

    @Then("I can see the post login screen")
    public void iCanSeeThePostLoginScreen() {
        homeAction.sucessLoginValidation();
    }

}
