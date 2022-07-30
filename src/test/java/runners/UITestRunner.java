package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber",
                "json:target/cucumber.json"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@smoke",
        dryRun = false,
        monochrome = true
)

public class UITestRunner {
    //features="src/test/resources/features",

}