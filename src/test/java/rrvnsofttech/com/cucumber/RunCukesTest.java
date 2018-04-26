package rrvnsofttech.com.cucumber;

import cucumber.api.CucumberOptions;

@CucumberOptions(monochrome = true, plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
        tags = {"@TestAPI"},features = "src/test/resources/feature")
public class RunCukesTest {

}