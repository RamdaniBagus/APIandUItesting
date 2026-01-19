package ui.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"ui.steps"},
        plugin = {"pretty", "html:target/cucumber-report"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
