package runAllTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber.json"},
        glue = ("stepDefTest"),
        features="/Users/markkofi/Documents/Applications/valtechTest/src/test/resources/features",
        tags ="@Test")
public class RunCukeTest {
}