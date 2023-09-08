package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility","StepDefinitions"},
        tags = {"@smoke"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class TestRunner {


}
