package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",//Scenario steplerini konsola renkli yazdırır
                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatında rapor için
                "json:target/reports/json-reports/cucumber1.json",//json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatında rapor için
                "rerun:target/failedScenarios.txt",//Fail olan scenarioların kaydını alır ve sadece bu testlerin koşulmasına yardımcı olur.
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //Spark peport için

        },
        monochrome = false,//Daha düzenli log işlemi için
        features = "src/test/Resources/Features",//Feature dosyalarının yolu buraya belirtilmelidir
        glue = "StepDefinitions",//Çalıştırılacak Java classlarının yolu buraya belirtilmelidir
        tags = "@Task_37",//Özel olarak çalıştırılacak Scenario yada Feature Tag'i buraya belirtilir
        dryRun = false//dryRun = true --> Testi çalıştırmaz, eksik step definitionları tespit eder.
)
public class Runner {

}