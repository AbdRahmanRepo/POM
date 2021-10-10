package com.Runner2.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\FbFeature.feature", glue = "stepDeff")
public class Runner2 {

}
