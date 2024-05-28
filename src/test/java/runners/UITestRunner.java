package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber.json"},
        features="src/test/resources/ui_features",
        glue="ui_automation",
        tags={"@regression"},
        dryRun = false,
        monochrome = true
)

public class UITestRunner { }
