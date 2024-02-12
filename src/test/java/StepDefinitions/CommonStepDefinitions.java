package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonStepDefinitions {
    @And("user closes browser")
    public void userClosesBrowser() {

        Driver.closeDriver();

    }

    @Given("go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(url);
    }

}
