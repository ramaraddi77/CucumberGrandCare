package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\admin\\eclipse-workspace1\\CucumberGrandCare\\src\\main\\java\\Featurefile\\Featurefile.feature"},
                  glue = {"StepDefinition"},
                  dryRun = false,
                  monochrome = true,
                  plugin = {"pretty","html:ReportsGenerate/report.html"})
public class Runnerclass extends AbstractTestNGCucumberTests
{

}
