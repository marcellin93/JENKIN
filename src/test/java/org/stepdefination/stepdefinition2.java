package org.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition2 {
	WebDriver driver;
	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactin.com/HotelApp/");
	}
@When("user enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(s1);

		WebElement userpass = driver.findElement(By.id("password"));
		userpass.sendKeys(s2);
		WebElement clickbtn = driver.findElement(By.id("login"));
		clickbtn.click();
}
@When("user enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys(s1);
		WebElement hot = driver.findElement(By.id("hotels"));
		hot.sendKeys(s2);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.sendKeys(s3);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		roomno.sendKeys(s4);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys(s5);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys(s6);
		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.sendKeys(s7);
	    WebElement children = driver.findElement(By.id("child_room"));
	    children.sendKeys(s8);
	    WebElement submit = driver.findElement(By.id("Submit"));
	    submit.click();
	    WebElement bookhotel = driver.findElement(By.id("radiobutton_0"));
	    bookhotel.click();
	    WebElement continue1 = driver.findElement(By.id("continue"));
	    continue1.click(); 
	}
	
	


	@When("user enter details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter1(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8) throws InterruptedException {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys(a1);
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(a2);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(a3);
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys(a4);
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		cardtype.sendKeys(a5);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		expyear.sendKeys(a6);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		expmonth.sendKeys(a7);
		Thread.sleep(3000);
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.sendKeys(a8);
        WebElement booknow = driver.findElement(By.id("book_now"));
		 booknow.click();
		 Thread.sleep(10000);
		 WebElement order = driver.findElement(By.id("order_no")); 
		 String attribute = order.getAttribute("value");
		 System.out.println(attribute);
		 
	}


@Then("user should verify the messages")
	public void user_should_verify_the_messages() {
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("HotelApp");
		Assert.assertTrue("verify url",contains);
	}

	
	






}
