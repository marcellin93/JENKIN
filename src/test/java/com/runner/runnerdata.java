package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\data.feature"},glue= {"C:\\Users\\Marcellin\\eclipse-workspace\\cucumber\\src\\test\\java\\stepdef2"},monochrome=true)
public class runnerdata {

}
