package runAllTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber.json"},
        glue = ("runAllTest"),
        features="/Users/markkofi/Documents/Applications/hmrc/valtechTest/src/main/resources/valtechTest.feature")

public class RunCukeTests {
}