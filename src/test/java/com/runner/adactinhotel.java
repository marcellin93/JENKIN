package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import BaseClass.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "com.adactin" }, monochrome = true, plugin = {
		"json:src\\test\\resources\\Reporting\\marcellin.json" })
public class adactinhotel {

	@AfterClass
	public static void afterclass() {

		JvmReport.generatejvmreport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting\\marcellin.json");
	}

}
