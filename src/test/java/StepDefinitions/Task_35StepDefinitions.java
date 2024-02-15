package StepDefinitions;


import Pages.Task_35Page;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class Task_35StepDefinitions {

    Task_35Page inputPage = new Task_35Page();
    @Given("user goes to page")
    public void user_goes_to_page() {
        Driver.getDriver().get(ConfigReader.getProperty("input_validation_url"));
    }
    @When("enter firstname {string} and lastname {string}")
    public void enter_firstname_and_lastname(String firstname, String lastname) {
        inputPage.firstName.sendKeys(firstname);
        inputPage.lastName.sendKeys(lastname);
    }
    @When("enter age {string}")
    public void enter_age(String age) {
        inputPage.age.sendKeys(age);
    }
    @When("select country {string}")
    public void select_country(String country) {
        Select select = new Select(inputPage.country);
        select.selectByVisibleText(country);
    }
    @When("enter note {string}")
    public void enter_note(String note) {
        inputPage.notes.sendKeys(note);
    }
    @When("click send button")
    public void click_send_button() {
        inputPage.sendButton.click();
    }
    @When("user validates submission")
    public void user_validates_submission() {
        assertTrue(inputPage.inputValidation.isDisplayed());
    }
    @Then("user quits browser")
    public void user_quits_browser() {
       Driver.closeDriver();
    }

}
