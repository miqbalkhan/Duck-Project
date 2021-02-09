package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions

(features = "C:\\Users\\15164\\eclipse-workspace\\duck-project\\src\\main\\java\\Features",

		glue = ("StepDefinitations"), tags = { "@smookTest" }, format = { "pretty", "html:test-output",
				"json: json_output/cucumber.json",
				"junit: junit_xml/cucumber.xml" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {

}
