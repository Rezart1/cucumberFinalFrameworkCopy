package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/api_features",
        glue={"api_automation.step_definitions"},
        dryRun = false,
        monochrome = true,
        tags = { "@ApiRegression" },
        plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json" }
)
public class APITestRunner {

}