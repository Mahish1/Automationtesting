package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",features = {"src/test/resources/files/login.feature"},
glue = {"Stepdif"},
plugin = {"pretty","html:target\\html.reports"})




public class Runner_1 extends  AbstractTestNGCucumberTests {

}
