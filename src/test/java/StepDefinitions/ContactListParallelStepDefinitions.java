package StepDefinitions;

import Pages.ContactListContactPage;
import Pages.ContactListContactParallelPage;
import Pages.ContactListHomePage;
import Pages.ContactListHomeParallelPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactListParallelStepDefinitions {

    ContactListHomeParallelPage contactListHomePage = new ContactListHomeParallelPage();

    ContactListContactParallelPage contactListContactPage = new ContactListContactParallelPage();

    @Given("users goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));

    }
    @When("users enters valid username")
    public void user_enters_valid_username() {

        contactListHomePage.username.sendKeys(ConfigReader.getProperty("contact_list_username"));

    }
    @When("users enters valid password")
    public void user_enters_valid_password() {
        contactListHomePage.password.sendKeys(ConfigReader.getProperty("contact_list_password"));
    }
    @When("users clicks on submit button")
    public void user_clicks_on_submit_button() {
        contactListHomePage.submit.click();
    }
    @Then("users validates sign in")
    public void user_validates_sign_in() {
        assertTrue(contactListContactPage.logout.isDisplayed());
    }

    @Then("users validates error message")
    public void userValidatesErrorMessage() throws InterruptedException {
        Thread.sleep(500);
        String errorMessage = contactListHomePage.error.getText();
        assertEquals("Incorrect username or password",errorMessage);
    }

    @When("users enters invalid username")
    public void userEntersInvalidUsername() {
        contactListHomePage.username.sendKeys(ConfigReader.getProperty("contact_list_invalid_username"));
    }

    @When("users enters username {string}")
    public void userEntersUsername(String username) {
        contactListHomePage.username.sendKeys(username);
    }

    @And("users enters password {string}")
    public void userEntersPassword(String password) {
        contactListHomePage.password.sendKeys(password);
    }

    @When("users enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        contactListHomePage.username.sendKeys(username);
        contactListHomePage.password.sendKeys(password);
    }
}
