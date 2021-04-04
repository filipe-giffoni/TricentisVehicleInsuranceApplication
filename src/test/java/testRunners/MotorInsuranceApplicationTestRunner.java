package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/MotorInsuranceApplication.feature"},
		glue =  "stepDefs"
		)
public class MotorInsuranceApplicationTestRunner {
}