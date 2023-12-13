package step_definition;

import static Factory.LoginFactory.*;
import static Module.Hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	

	
	
	//Test 1 connection : enters invalid username and valid password
	

	
	@Given("User enters  invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {
		enterinvalidEmail();
		enterPassword ();
		loginIn();
	}

	
	
	

	@When("System should display an appropriate error message is Utilisateur non trouvé")
	public void system_should_display_an_appropriate_error_message_is_Utilisateur_non_trouvé() throws InterruptedException {
	  checkMessageinvalidEmail();
	}

	@Then("User clicks ok button")
	public void user_clicks_ok_button() {
		clickOk();
	  
	}
	

	
	//Test 2 connection :  enters a valid username and valid password 

	@Given("User enters a valid username and invalid password")
	public void user_enters_a_valid_username_and_invalid_password() {
	  enterEmail();
	  enterinvalidPassword();
	  loginIn();
	}
	

	@When("System should display an appropriate error message Svp vérifiez votre mot de passe")
	public void system_should_display_an_appropriate_error_message_Svp_vérifiez_votre_mot_de_passe() throws InterruptedException {
		checkMessageinvalidPassword();
	}
	
	//Test 3 connection : enters a valid password and empty username

	@Given("User enters a valid password  and empty username")
	public void user_enters_a_valid_password_and_empty_username() {
		enterEmptyUsername();
		enterPassword();
		loginIn();
	   
	}

	
	
	@When("System should display an appropriate error message Svp vérifiez votre email")
	public void system_should_display_an_appropriate_error_message_Svp_vérifiez_votre_email() throws InterruptedException {
		checkMessageEmptyUsername();
	}
	
	
	
   //Test 4 connection : enters a valid username and password

	@Given("User enters a valid username and password")
	public void user_enters_a_valid_username_and_password() throws InterruptedException {
		enterEmail();
		enterPassword ();
		loginIn();
		Thread.sleep(2000);
	
	}

	
	@When("Successful login into the system and appropriate successful message Vous êtes connecté")
	public void successful_login_into_the_system_and_appropriate_successful_message_Vous_êtes_connecté() {
		checkMessage();
	}


	@Then("User clicks ok button and navigate to home page")
	public void user_clicks_ok_button_and_navigate_to_home_page() throws InterruptedException {
		clickOk();
		Thread.sleep(2000);
	}
	
	
	

	
	

}
