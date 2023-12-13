package Factory;

import static Factory.LoginFactory.enterEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {

	
	
	@FindBy(id="email_field")
	private static WebElement  email;
	
	@FindBy(id="password_field")
	private static WebElement password;
	
	@FindBy(xpath="/html/body/app-root/app-login/main/div/section/div[2]/div/div/form/div[3]/button")
	private static WebElement btn_login;
	
	@FindBy(id="swal2-html-container")
	private static WebElement message;
	
	@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	private static WebElement btn_ok;
	
	
	
	//Invalid email  and Valid password
	
	public static void enterinvalidEmail() {
		email.sendKeys("marwacherif@gmail.com");
	} 
	
	
	
	
	public static void checkMessageinvalidEmail() throws InterruptedException {
    String expectedText = "Utilisateur non trouvé !";
    	
    	if (expectedText.equals(message.getText())) {   
    		
    		System.out.println("The message erreur is good :" +message.getText());
    		}
    		else {
    			System.out.println("The message erreur is not good you have to be : " +expectedText);	
    		}
    	
    	
    	Thread.sleep(2000);
	
	}
	
	//Valid user name and Invalid Password 
	
	public static void enterinvalidPassword() {
		password.sendKeys("youssef1");
	}
	
	public static void checkMessageinvalidPassword() throws InterruptedException {
    	
    	String expectedText2 = "Svp vérifiez votre mot de passe!";
    	if (expectedText2.equals(message.getText())) {
    		
    		System.out.println("The message erreur is good :" +message.getText());
    		}
    		else {
    			System.out.println("The message erreurrrrrr is not good you have to be : "+expectedText2);	
    		}
    	
    	Thread.sleep(2000);
    }
	
	
	//Empty username and Valid password
	public static void enterEmptyUsername () {
		email.sendKeys("");
	}
	
	public static void checkMessageEmptyUsername() throws InterruptedException {
	
	
	String expectedText3 = "Svp vérifiez votre email !";
	if (expectedText3.equals(message.getText())) {
		
		System.out.println("The message erreur is good :" +message.getText());
		}
	else {
		System.out.println("The message erreur is not good you have to be : "+expectedText3);	
	}
	
}
	
    
	// Valid user name and password
	
	
	
	
	public static void enterEmail() {
		email.sendKeys("youssefmehri27@gmail.com");
	} 
	
	public static void enterPassword () {
		password.sendKeys("youssefmehri27@gmail");
	}
	
	public static void loginIn() {
		btn_login.click();
	}
	
	
	public static void checkMessage() {
		String expectedText = "Vous êtes connecté!";
		if (expectedText.equals(message.getText())) {
			System.out.println("The successful message is good :" +message.getText());
		}
		 else {
				System.out.println("The message is not goode you have to be:" +expectedText);
			  }
		
	}
	
	
	public static void clickOk() {
		btn_ok.click();
	}
	
	
	

}
	
	
	

