package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\MphasisPractice Eclipse\\Phase2EndProjectPart1\\src\\test\\java\\features\\starHealthfile.feature",
glue = {"steps"}, //packagename where the steps are
plugin= {"pretty","html:target/cucumberreport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"}
		)
public class StarHealthRunner {

}
