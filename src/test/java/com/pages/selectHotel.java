package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Libglobal;

public class selectHotel extends Libglobal {
	public selectHotel() {
		PageFactory.initElements(driver, this);
	
}
	
	public WebElement getClickhotel() {
		return clickhotel;
	}


	public WebElement getClickbtn() {
		return clickbtn;
	}

	@FindBy(id="radiobutton_0")
	private WebElement clickhotel;
	

	@FindBy(id="continue")
	private WebElement clickbtn;
}
