package com.flightStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Libglobal;
import cucumber.api.java.en.*;

public class flightStepDefinition extends Libglobal {
	WebDriver driver;

@Given("I verify makemytrip page")
public void i_verify_makemytrip_page() {
	getDriver();
	geturl("https://www.makemytrip.com/flights/?cmp=disp_dgm_DF&source=July-Aff-917127&gclid=EAIaIQobChMIjv3kv_eM6AIVAyUrCh0leQUKEAAYASAAEgKfDvD_BwE");
	driver.findElement(By.xpath("//a[text()='Search']")).click();
}

@When("I am entering the details {string},{string},{string},{string},{string},{string},{string},{string}")
public void i_am_entering_the_details(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
	
}

@Then("I should verify the messages")
public void i_should_verify_the_messages() {
}



}

