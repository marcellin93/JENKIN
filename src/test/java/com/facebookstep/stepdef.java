package com.facebookstep;

import cucumber.api.java.en.*;

public class stepdef {
	
	@Given("user is on the flipkart setting page")
	public void a() {
	   System.out.println("user_is_on_the_flipkart_setting_page");
	}

	@When("user click the change password")
	public void b() {
		System.out.println("user_click_the_change_password");
	}

	@When("user enter the old password,new password and confirm password and click the change password")
	public void c() {
		System.out.println("user enter the old password,new password and confirm password and click the change password");}

	@Then("user verify the success message of the password changed")
	public void d() {
		System.out.println("user verify the success message of the password changed");}

	@Given("user is on facebook")
	public void a1() {
		System.out.println("user is on facebook");	}

	@When("user enter credential")
	public void b1() {
		System.out.println("user enter credential");}

	@When("user click the login")
	public void c1() {
		System.out.println("user click the login");}

	@Then("user verify the success message")
	public void d1() {
		System.out.println("user verify the success message");	}

	@Given("user is on netbanking page")
	public void a2() {
		System.out.println("user is on netbanking page");	}

	@When("user enter details")
	public void b2() {
		System.out.println("user enter details");	}

	@Given("user is on debit card page")
	public void c2() {
		System.out.println("user is on debit card page");}

	@Given("user is on credit card page")
	public void d2() {
		System.out.println("user is on credit card page");}

	@Given("user is on debit card VISA page")
	public void e2() {
		System.out.println("user is on debit card VISA page");	}

	@Given("user is on debit card MASTER page")
	public void f2() {
		System.out.println("user is on debit card MASTER page");}


}
