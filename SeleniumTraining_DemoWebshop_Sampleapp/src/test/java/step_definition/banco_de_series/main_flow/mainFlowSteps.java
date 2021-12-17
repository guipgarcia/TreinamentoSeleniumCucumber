package step_definition.banco_de_series.main_flow;

import actions.banco_de_series.home_action.HomeAction;
import actions.banco_de_series.sitcom_action.SitcomAction;
import base.BasePage;
import generic_methods.GenericMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static project_global_variables.GlobalVariables.BANCO_DE_SERIES_APPLICATION;

public class mainFlowSteps extends BasePage {
    GenericMethods gm = new GenericMethods();
    HomeAction homeAction = new HomeAction();
    SitcomAction sitcomAction = new SitcomAction();

    @Given("that I access banco de series")
    public void that_i_access_banco_de_series() {
        genericMethods.openUrl(BANCO_DE_SERIES_APPLICATION);
        homeAction.closeAds();
    }

    @When("I select a sitcom from more watched list")
    public void i_select_a_sitcom_from_more_watched_list() {
        homeAction.selectMostWatchedRandomSitcom();
    }

    @Then("The page redirects to the chosen sitcom")
    public void the_page_redirects_to_the_chosen_sitcom() {
        sitcomAction.validateSitcomTitle();
    }


}
