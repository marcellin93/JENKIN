package com.adactin;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.Libglobal;
import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks extends Libglobal{
	
	@After
	public void afterscenario(Scenario sc) {
		if (!sc.isFailed()) {
    TakesScreenshot tk=(TakesScreenshot) driver;
	byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);
	System.out.println(b1);
	sc.embed(b1,"images/png");
}
	}
	}


