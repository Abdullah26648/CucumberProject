package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features",
        glue = "StepDefinitions",
        tags = "@PositiveLoginParam2",
        dryRun = false
)
public class Runner {

}