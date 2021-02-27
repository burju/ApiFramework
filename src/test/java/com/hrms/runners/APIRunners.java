package com.hrms.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions ( features = "src/test/resources/features",
        glue= {"com.hrms.api.steps.practice"},
        dryRun = false,
        tags = "@APITest")

public class APIRunners {
}
