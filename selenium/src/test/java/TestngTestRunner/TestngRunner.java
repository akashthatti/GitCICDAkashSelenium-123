package TestngTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/feature/newFeatures.feature",glue="stepdefinitions",monochrome = true,
dryRun = false)
public class TestngRunner extends AbstractTestNGCucumberTests {

}
