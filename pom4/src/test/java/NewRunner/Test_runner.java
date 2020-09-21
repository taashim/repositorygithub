package NewRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"C:\\Workspace\\pom4\\src\\test\\resources\\Newlogin\\newlogin.feature"},
	glue={"stepdefinition"},
	tags="@Login",
	dryRun=false,//To check weather you have missed an steps in the scenarion
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check wether any step is not defined in step definition
	plugin = {"html:testoutput","junit:junit_xml/cucumber_xml","json:json_output/cucumnber.json"}
	)

public class Test_runner {

}


