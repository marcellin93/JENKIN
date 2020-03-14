package stepdef2;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef2 {


@Given("user is on facebook page")
public void user_is_on_facebook_page() {
   
}

@When("user enter the username")
public void user_enter_the_username(io.cucumber.datatable.DataTable data) {
	 List<String> l = data.asList();
	 String text = l.get(2);
	 System.out.println(text);}

@When("user should click the login button")
public void user_should_click_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user should verify the message")
public void user_should_verify_the_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}



}
