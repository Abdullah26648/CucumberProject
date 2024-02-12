package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",//Scenario steplerini konsola renkli yazdırır
                "html:target/reports/html-reports/default-cucumber-reports.html",
                "rerun:target/failedScenarios.txt"
        },
        features = "@target/failedScenarios.txt",
        glue = "StepDefinitions"
)
public class FailedTestsRunner {

}