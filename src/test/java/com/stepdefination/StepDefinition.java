package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
@Given("user is on hotel page")
public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://adactin.com/HotelApp/");
}

@When("user enter username and password")
public void userpass() {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("marcellin");

	WebElement userpass = driver.findElement(By.id("password"));
	userpass.sendKeys("1234567");
}

@Then("user should click the login button")
public void click() {
	WebElement clickbtn = driver.findElement(By.id("login"));
	clickbtn.click();
}




}
