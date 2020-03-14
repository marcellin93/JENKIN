package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import BaseClass.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features2"},glue= {"com.facebookstep"},monochrome=true,plugin= {"json:src\\test\\resources\\Reporting\\new.json"},tags= {"~@Reg","~@Sanity"})
public class facebookrunner {
	
	
@AfterClass
	public static void aferclass() {
	JvmReport.generatejvmreport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\new.json");

}
}
