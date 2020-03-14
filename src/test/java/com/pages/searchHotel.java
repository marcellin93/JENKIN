package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Libglobal;

public class searchHotel extends Libglobal{

	public searchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement loc;
	

	@FindBy(id="hotels")
	private WebElement hot;
	

	@FindBy(id="room_type")
	private WebElement roomtype;
	

	@FindBy(id="room_nos")
	private WebElement noofrooms;
	

	@FindBy(id="datepick_in")
	private WebElement checkin;
	public WebElement getLoc() {
		return loc;
	}
public WebElement getHot() {
		return hot;
	}
public WebElement getRoomtype() {
		return roomtype;
	}
public WebElement getNoofrooms() {
		return noofrooms;
	}


	public WebElement getCheckin() {
		return checkin;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAdult() {
		return adult;
	}


	public WebElement getChildren() {
		return children;
	}


	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="datepick_out")
	private WebElement checkout;
	

	@FindBy(id="adult_room")
	private WebElement adult;
	

	@FindBy(id="child_room")
	private WebElement children;
	

	@FindBy(id="Submit")
	private WebElement submit;
	
}
