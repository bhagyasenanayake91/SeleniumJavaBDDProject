package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility","StepDefinitions"},
//        tags = "@smoke",
        plugin = {"pretty", "json:target/cucumber/report.json", "html:target/cucumber/report.html"}
)
public class TestRunner {


}
