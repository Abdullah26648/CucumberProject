package StepDefinitions;

import Utilities.Driver;
import Utilities.ParallelDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonParallelStepDefinitions {
    @And("users closes browser")
    public void userClosesBrowser() {

        ParallelDriver.closeDriver();

    }

    @Given("goes to {string}")
    public void goTo(String url) {
        ParallelDriver.getDriver().get(url);
    }

}
