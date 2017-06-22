package com.executor;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features={"src/features"},
		glue={"com.stepDefinations"}
		)
public class TestRunner {

	
}
