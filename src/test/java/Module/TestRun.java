package Module;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue={"Module","step_definition"},tags ={"@smoke"},
monochrome=true, strict = true,             
//create report


plugin = {"json:target/cucumber.json"}
)

public class TestRun {
	
	


}
