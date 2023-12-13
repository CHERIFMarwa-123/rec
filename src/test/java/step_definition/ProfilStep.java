package step_definition;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Factory.LoginFactory.*;
import static Factory.ProfilFactory.*;
import static Factory.RecuFactory.*;
import static Module.Hooks.driver;

public class ProfilStep {
	
	



	
	
	@Given("user clicks company link")
	public void user_clicks_company_link() throws InterruptedException {
		Clickscompanybtn();
	    Thread.sleep(2000);
	}

	@Then("user clicks profile link")
	public void user_clicks_profile_link() throws InterruptedException {
		btn_profil.click();
		Thread.sleep(2000);
	}
	
	

	
	// Test 2 profil :  Test a valid forme "profil" 

	


	
	
	@Given("user update new logo")
	public void user_update_new_logo() throws AWTException {
		Changelogo();
	   
	}

	@When("user clicks mis a jours link")
	public void user_clicks_mis_a_jours_link() {
		 Clickupdate();
	}

	@And("user enters description")
	public void user_enters_description() {
	    entersdescreption();
	}

	@And("user enters company")
	public void user_enters_company() {
	    enterscountry();
	}
	

	@And("user enters siret")
	public void user_enters_siret() {
	    enterssiret();
	}

	@And("user enters adress")
	public void user_enters_adress() {
		enteradress ();
	}

	@And("user enters phone number")
	public void user_enters_phone_number() {
	   entermobile();
	}

	@And("user clicks enregistrer les changements")
	public void user_clicks_enregistrer_les_changements() {
	  Clicks_registrationbtn();
	}

	@And("verify that a success message is displayed Votre compte est mis à jour ! and clicks ok boutton")
	public void verify_that_a_success_message_is_displayed_Votre_compte_est_mis_à_jour_and_clicks_ok_boutton() throws InterruptedException {
		Popup_verification();
	}

	@Then("verify that the new information is disable in the profile page")
	public void verify_that_the_new_information_is_disable_in_the_profile_page() throws InterruptedException {
		ClicksBtn_Apercu();
	    verification_logo();
	    verification_Description();
	    verification_siret();
	    verification_country();
	    verification_adress();
	    verification_phone();
	    
	    
		

	    
	}
	
	
	

	@When("user leaves the country field blank")
	public void user_leaves_the_country_field_blank() { 
		EmptyCompany();
		
	    
	}

	@When("the bouton enregistrer les changements is desabled")
	public void the_bouton_enregistrer_les_changements_is_desabled() {
		Btn_insdisabl();
	}

	

	@When("user leaves the siret field blank")
	public void user_leaves_the_siret_field_blank() {
	   EmptySiret();
	}

	@When("user leaves the phone number field blank")
	public void user_leaves_the_phone_number_field_blank() {
		EmptyNumber();
		
	   
	}

	@When("user enters invailed siret")
	public void user_enters_invailed_siret() throws InterruptedException {
		InvalidSiret();
	  
	}

	@Then("verify that a erreur message is displayed Le champ SIRET doit contenir uniquement {int} chiffres ! and clicks ok boutton")
	public void verify_that_a_erreur_message_is_displayed_Le_champ_SIRET_doit_contenir_uniquement_chiffres_and_clicks_ok_boutton(Integer int1) throws InterruptedException {
		InvalidSiretrmessage();
	}

	@When("user enters invailed phone number")
	public void user_enters_invailed_phone_number() throws InterruptedException {
		InvalidNumber();
	    
	}

	@Then("verify that a erreur message is displayed Le champ MOBILE doit contenir uniquement {int} chiffres ! and clicks ok boutton")
	public void verify_that_a_erreur_message_is_displayed_Le_champ_MOBILE_doit_contenir_uniquement_chiffres_and_clicks_ok_boutton(Integer int1) throws InterruptedException {
		Invalidnumbermessage();
	}
	
	


	



	
}	