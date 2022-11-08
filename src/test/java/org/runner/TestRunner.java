package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature Files", 
glue="org.stepdefinition",monochrome=true, dryRun=true,
snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,tags = {"@Login"}, 
plugin = {"pretty","html:src\\test\\resources\\Reports\\HTMLReport"})

public class TestRunner {

}
