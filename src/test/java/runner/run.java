package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = { "src/test/resources/" }, monochrome = true, plugin = { "pretty","json:target/jsonFolder/index.json" }, glue = {
		"def" })
public class run {

}
