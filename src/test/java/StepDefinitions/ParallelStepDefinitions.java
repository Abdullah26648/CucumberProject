package StepDefinitions;

import Pages.FormHomeParallelPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ParallelDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ParallelStepDefinitions {

    FormHomeParallelPage formHomePage = new FormHomeParallelPage();

    @Given("user goes to home page")
    public void user_goes_to_home_page() {

        ParallelDriver.getDriver().get(ConfigReader.getProperty("form_page_url"));

    }

    @When("user enters username")
    public void user_enters_username() {

        formHomePage.username.sendKeys("Ali");

    }

    @When("user enters password")
    public void user_enters_password() {

        formHomePage.password.sendKeys("123");


    }

    @And("user enters comment")
    public void userEntersComment() {

        formHomePage.comments.clear();
        formHomePage.comments.sendKeys("Hello, My name is Ali");

    }

    @Then("user closes driver")
    public void user_closes_driver() throws InterruptedException {

        Thread.sleep(2000);
        ParallelDriver.closeDriver();

    }


    @When("user verifies title contains {string}")
    public void userVerifiesTitleContains(String title) {

        assertTrue(ParallelDriver.getDriver().getTitle().contains(title));

    }

    @Given("user goes to url {string}")
    public void userGoesToUrl(String url) {

        ParallelDriver.getDriver().get(url);

    }

    @When("user enters username ,user enters password ,user enters comment")
    public void userEntersUsernameUserEntersPasswordUserEntersComment(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> rows = dataTable.asLists();


        for (List<String> w : rows) {
            String username = w.get(0);
            String password = w.get(1);
            String comment = w.get(2);

            formHomePage.username.sendKeys(username);
            formHomePage.password.sendKeys(password);
            formHomePage.comments.clear();
            formHomePage.comments.sendKeys(comment);

            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            ParallelDriver.getDriver().navigate().refresh();
        }

        ParallelDriver.closeDriver();
    }

}
