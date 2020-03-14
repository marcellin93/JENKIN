package com.adactin;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.loginpage;
import com.pages.pageobjecrmanager;
import com.pages.paymentpage;
import com.pages.searchHotel;
import com.pages.selectHotel;

import BaseClass.Libglobal;
import cucumber.api.java.en.*;

public class adactin extends Libglobal {
	WebDriver driver;
	pageobjecrmanager page;
	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
		driver=getDriver();
		geturl("https://adactin.com/HotelApp/");
	}

	@When("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable data) throws InterruptedException {
		
		//login page 
		
		List<Map<String, String>> emp = data.asMaps();
		page=new pageobjecrmanager();
		
	     String s1 = emp.get(0).get("userName");
		String s2 = emp.get(0).get("passWord");
		fill(page.getLoginpage().getTxtusername(), s1);
		fill(page.getLoginpage().getTxtuserpass(), s2);
		click(page.getLoginpage().getLoginbtn());

		//search hotel page
	  String s3 = emp.get(0).get("location");
	  fill(page.getSearchHotel().getLoc(), s3);
		String s4 = emp.get(0).get("hotel");
		fill(page.getSearchHotel().getHot(), s4);
		String s5 = emp.get(0).get("roomType");
		fill(page.getSearchHotel().getRoomtype(), s5);
		String s6 = emp.get(0).get("noOfRoom");
		fill(page.getSearchHotel().getNoofrooms(), s6);
		String s7 = emp.get(0).get("checkInDate");
		fill(page.getSearchHotel().getCheckin(), s7);
		String s8 = emp.get(0).get("checkoutDate");
		fill(page.getSearchHotel().getCheckout(), s8);
		String s9 = emp.get(0).get("adultPerRoom");
		fill(page.getSearchHotel().getAdult(), s9);
		String s10 = emp.get(0).get("childrenPerRoom");
		fill(page.getSearchHotel().getChildren(), s10);
		click(page.getSearchHotel().getSubmit());
		
	
	   //select hotel page
	   click(page.getSelectHotel().getClickhotel());
	   click(page.getSelectHotel().getClickbtn());
	  
	 
	  //payment page
	  String a1 = emp.get(0).get("firstName");
	  fill(page.getPaymentpage().getFirstname(),a1);
	  String a2 = emp.get(0).get("lastName");
	  fill(page.getPaymentpage().getLastname(),a2);
	  String a3 = emp.get(0).get("address");
	  fill(page.getPaymentpage().getAddress(),a3);
	  String a4 = emp.get(0).get("cardNo");
	  fill(page.getPaymentpage().getCardno(),a4);
	  String a5 = emp.get(0).get("cardType");
	  fill(page.getPaymentpage().getCardtype(),a5);
	  String a6 = emp.get(0).get("expiremonth");
	  fill(page.getPaymentpage().getMonth(),a6);
	  String a7 = emp.get(0).get("expireYear");
	  fill(page.getPaymentpage().getYear(),a7);
	  String a8 = emp.get(0).get("ccvNo");
	  fill(page.getPaymentpage().getCvv(),a8);
	  click(page.getPaymentpage().getSubmit());
	 
	  
	}

	@Then("user should verify the messages")
	public void user_should_verify_the_messages() throws InterruptedException {
		Thread.sleep(10000);
		 WebElement order = driver.findElement(By.id("order_no")); 
		 String attribute = order.getAttribute("value");
		 System.out.println(attribute);
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		WebElement ff = driver.findElement(By.xpath("//input[@value='"+attribute+"']/parent::td/preceding-sibling::td"));
		ff.click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	
		Alert a = driver.switchTo().alert();
		a.accept();
	}



}
