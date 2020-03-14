package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Libglobal;

public class paymentpage extends Libglobal{

	public paymentpage() {
		PageFactory.initElements(driver, this);
	
}
	
	
	@FindBy(id="first_name")
	private WebElement firstname;

	@FindBy(id="last_name")
	private WebElement lastname;

	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement cardno;

	@FindBy(id="cc_type")
	private WebElement cardtype;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getSubmit() {
		return submit;
	}


	@FindBy(id="cc_exp_month")
	private WebElement month;

	@FindBy(id="cc_exp_year")
	private WebElement year;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement submit;

}
