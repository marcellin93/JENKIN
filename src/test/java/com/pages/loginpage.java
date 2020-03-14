package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Libglobal;

public class loginpage extends Libglobal {

	
	public loginpage() {
		PageFactory.initElements(driver, this);
	
}
	
	@FindBy(id="username")
	private WebElement txtusername;
	

	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getTxtuserpass() {
		return txtuserpass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(id="password")
	private WebElement txtuserpass;
	

	@FindBy(id="login")
	private WebElement loginbtn;
}
