package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Login.feature"
		,glue="com/syntax/steps"
		//,dryRun=true
		,monochrome=true
		,tags= {"@temp"}
		)

public class TestRunner {

}
