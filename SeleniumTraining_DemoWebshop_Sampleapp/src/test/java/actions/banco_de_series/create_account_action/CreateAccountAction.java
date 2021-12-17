package actions.banco_de_series.create_account_action;

import com.github.javafaker.Faker;
import pages.banco_de_series.create_account_page.CreateAccountPage;
import project_global_variables.GlobalVariables;
import static project_global_variables.GlobalVariables.BDS_EMAIL;
import static project_global_variables.GlobalVariables.BDS_PASSWORD;

public class CreateAccountAction extends CreateAccountPage {
    Faker faker = new Faker();
    public void fillInRequiredFields(){
        // Generate Fake data
        String login = faker.name().username();
        String email = login + System.nanoTime() + "@email.com";
        String password = faker.finance().creditCard();

        // Fill in the fields
        genericMethods.sendKeys(this.loginField,login);
        genericMethods.sendKeys(this.emailField, email);
        genericMethods.sendKeys(this.passwordField, password);
        genericMethods.sendKeys(this.repeatPasswordField, password);

        // Click Register Button
        genericMethods.click(this.registerButton);

        // Saving data on HashMap
        GlobalVariables.textManager.put(BDS_EMAIL, email);
        GlobalVariables.textManager.put(BDS_PASSWORD, password);

        // Writing on screen - IT will be deleted
        System.out.println("Email: " + BDS_EMAIL);
        System.out.println("Password: " + BDS_PASSWORD);
    }
}
