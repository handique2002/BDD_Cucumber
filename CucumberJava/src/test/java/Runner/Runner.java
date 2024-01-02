package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
glue= {"com.StepDefinition"},
monochrome = true,
plugin = {"html:Reports\\HTMLReports.html","json:Reports\\JsonReports.json"},
dryRun = true

)

public class Runner {

}
