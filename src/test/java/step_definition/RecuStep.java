package step_definition;

import static Factory.LoginFactory.checkMessage;
import static Factory.LoginFactory.checkMessageEmptyUsername;
import static Factory.LoginFactory.checkMessageinvalidEmail;
import static Factory.LoginFactory.clickOk;
import static Factory.LoginFactory.enterEmail;
import static Factory.LoginFactory.enterEmptyUsername;
import static Factory.LoginFactory.enterPassword;
import static Factory.LoginFactory.enterinvalidEmail;
import static Factory.LoginFactory.enterinvalidPassword;
import static Factory.LoginFactory.loginIn;
import static Factory.ProfilFactory.Btn_insdisabl;
import static Factory.ProfilFactory.Changelogo;
import static Factory.ProfilFactory.ClicksBtn_Apercu;
import static Factory.ProfilFactory.Clicks_registrationbtn;
import static Factory.ProfilFactory.Clickscompanybtn;
import static Factory.ProfilFactory.Clicksprofilbtn;
import static Factory.ProfilFactory.Clickupdate;
import static Factory.ProfilFactory.EmptyCompany;
import static Factory.ProfilFactory.EmptyNumber;
import static Factory.ProfilFactory.EmptySiret;
import static Factory.ProfilFactory.InvalidNumber;
import static Factory.ProfilFactory.InvalidSiret;
import static Factory.ProfilFactory.InvalidSiretrmessage;
import static Factory.ProfilFactory.Invalidnumbermessage;
import static Factory.ProfilFactory.Popup_verification;
import static Factory.ProfilFactory.enteradress;
import static Factory.ProfilFactory.entermobile;
import static Factory.ProfilFactory.enterscountry;
import static Factory.ProfilFactory.entersdescreption;
import static Factory.ProfilFactory.enterssiret;
import static Factory.ProfilFactory.verification_Description;
import static Factory.ProfilFactory.verification_adress;
import static Factory.ProfilFactory.verification_country;
import static Factory.ProfilFactory.verification_logo;
import static Factory.ProfilFactory.verification_phone;
import static Factory.ProfilFactory.verification_siret;
import static Factory.RecuFactory.SideRecu;
import static Factory.RecuFactory.chooseDate;
import static Factory.RecuFactory.chooseTechnician;
import static Factory.RecuFactory.clickAjouterrec;
import static Factory.RecuFactory.clicksAjouterrecu;
import static Factory.RecuFactory.enterCategorie;
import static Factory.RecuFactory.enterPicture;
import static Factory.RecuFactory.enterPrice;
import static Factory.RecuFactory.enterTva;
import static Module.Hooks.driver;

import java.awt.AWTException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecuStep {
	

	
	@Given("user clicks recu link")
	public void user_clicks_recu_link() throws InterruptedException {
	   SideRecu();
	   Thread.sleep(2000);
	}

	@Then("user clicks ajouter recu")
	public void user_clicks_ajouter_recu() throws InterruptedException {
		clickAjouterrec();
	}


	//Test 1  recu :  Test a valid forme "recu" 
	
	
	
	@Given("User enters a valid technicien")
	public void user_enters_a_valid_technicien() throws InterruptedException {
	    chooseTechnician();
	}


	@And("user enters a valid date")
	public void user_enters_a_valid_date() {
		chooseDate ();
		
	}
	
	
	@And("user enter a valid categorie")
	public void user_enter_a_valid_categorie() throws InterruptedException {
		enterCategorie ();
	}

	

	@And("user enter a valid picture")
	public void user_enter_a_valid_picture() throws AWTException {
		enterPicture();
		
		
		
	}

	@And("user enter a valid price")
	public void user_enter_a_valid_price() {
		enterPrice();
		
	}
     
	
	@And("user enter a valid TVA")
	public void user_enter_a_valid_TVA() {
	    enterTva();
	}
	
	

	@Then("user clicks ajouter un recu")
	public void user_clicks_ajouter_un_recu() throws InterruptedException {
		clicksAjouterrecu();
	}
	
	
	
	@Given("user leaves the picture field blank")
	public void user_leaves_the_picture_field_blank() {
	
		
	}	
	   
	

	@Then("The boutton ajouter un recu isdisabel")
	public void the_boutton_ajouter_un_recu_isdisabel() {
		
	}

	@Given("user leaves the price field blank")
	public void user_leaves_the_price_field_blank() {
	    
	}

	@Given("user leaves the TVA field blank")
	public void user_leaves_the_TVA_field_blank() {
	  
	}

	


	
	


	
}
