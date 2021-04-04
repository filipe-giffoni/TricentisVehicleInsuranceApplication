package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/AutoInsuranceApplication.feature"},
		glue =  "stepDefs"
		)
public class AutoInsuranceApplicationTestRunner {
}