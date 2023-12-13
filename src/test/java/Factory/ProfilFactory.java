package Factory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilFactory {
	
	
	
	
	@FindBy(xpath="//*[@id=\"sidebar-nav\"]/li[1]/div[1]/a/span")
	public static WebElement btn_company;
 
	
	@FindBy(xpath="//*[@id=\"sidebar-nav\"]/li[1]/div[2]/li[2]/a/span")
	public static WebElement btn_profil;
	
	
	@FindBy(xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[1]/div/div/label")
	public static WebElement logo;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/ul/li[2]/button")
	public static WebElement btn_update;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[3]/form/div[2]/div/textarea")
	public static WebElement Descreption; 
	
	@FindBy (name="pays")
	public static WebElement Country;
	
	@FindBy (name="siret")
	public static WebElement Siret;
	
	@FindBy (name="adresse")
	public static WebElement Adress;
	
	@FindBy (name="mobile")
	public static WebElement Phone;
	
	
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[3]/form/div[7]/button")
	public static WebElement btn_registration;
	
	
	@FindBy (xpath="/html/body/div/div/div[6]/button[1]")
	public static WebElement btn_ok;
	
	@FindBy (xpath="//*[@id=\"swal2-html-container\"]")
	public static WebElement message;
	
	@FindBy (xpath="//*[@id=\"main\"]/section/div/div[2]/div/div/ul/li[1]/button")
	public static WebElement btn_apercu;
	
	@FindBy (xpath="//*[@id=\"main\"]/section/div/div[1]/div/div/img")
	public static WebElement New_log;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[1]/div[1]/div[2]")
	public static WebElement New_Description;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[1]/div[4]/div[2]")
	public static WebElement New_Country;
	
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[1]/div[3]/div[2]")
	public static WebElement New_Siret;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[1]/div[5]/div[2]")
	public static WebElement New_Adress;
	
	@FindBy (xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[2]/div/div/div/div[1]/div[6]/div[2]")
	public static WebElement New_Phone;

	

	
	
	
	public static void Clickscompanybtn () throws InterruptedException {
	
		btn_company.click();
		Thread.sleep(2000);
	}
	
	public static void Clicksprofilbtn () {
		btn_profil.click();
	}
	
	public static void Changelogo () throws AWTException {
	
		// Localisez l'élément d'entrée de type "file" (utilisé pour le téléchargement)
        //click action on the button
		logo.click();
       //Copy the path
        Robot rb = new Robot();
        rb.delay(1000);
       
       //put path to file in a clipbord / mettre le chemin d'accès au fichier dans un presse-papiers
    
        // StringSelection  ss=new StringSelection("C:\\Users\\tekniva\\Pictures\\ins solution");fuj
        StringSelection  ss=new StringSelection("C:\\Users\\tekniva\\Pictures\\fuj");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
       
       //Crier le path de image dans le " file name " ctrl+v
        rb.keyPress(KeyEvent.VK_CONTROL); //press on ctrlKey
        rb.keyPress(KeyEvent.VK_V); //press on ctrlKey
        rb.delay(2000);
      
        rb.keyRelease(KeyEvent.VK_CONTROL); 
        rb.keyRelease(KeyEvent.VK_V); 
        rb.delay(2000);
       
       //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        
        System.out.println("Verify the popup for the registration of the new logo");
        String message_New = "logo est ajoutée avec succès !" ;
		if (message_New.equals(message.getText())) {
			System.out.println("the message erreur is goode : "+message.getText());
		    }
			else
			{
				System.out.println("the message erreur is not goode : "+message_New);	
			}
		
		System.out.println("Clicks ok boutton");
		btn_ok.click();
		
      
		 
	}
	
	public static void Clickupdate () {
		btn_update.click();
		
	}
	
	public static void entersdescreption () {
		
		Descreption.clear();
		Descreption.sendKeys("ins solustionssss1212");
	}
	
	public static void enterscountry () {
		Country.clear();
		Country.sendKeys("paris1");
	}
	
	public static void enterssiret () {
		Siret.clear();
		Siret.sendKeys("12345678978945");
	}
	
	public static void enteradress () {
		Adress.clear();
		Adress.sendKeys("20 rue ampaire");
	}
	
	public static void entermobile () {
		Phone.clear();
		Phone.sendKeys("7235689784");
	}
	
	public static void Clicks_registrationbtn () {
		btn_registration.click();
	}
	
	public static void Popup_verification() throws InterruptedException {
	    
		String message_New1 = "Votre compte est mis à jour !" ;
		if (message_New1.equals(message.getText())) {
			System.out.println("the message erreur is goode : "+message.getText());
		    }
			else
			{
				System.out.println("the message erreur is not goode : "+message_New1);	
			}
		
		
    	
    	Thread.sleep(2000);
    
    
		
		btn_ok.click();
		
	}
	
	
	public static void ClicksBtn_Apercu() throws InterruptedException {
		btn_apercu.click();
		Thread.sleep(1000);
	}
	
	
	
   public static void verification_logo () {
	 System.out.println ("verifier image avec  ahmed ") ;
	 
   }
   
   public static void verification_Description () {
	 
	   String new_des = "ins solustionssss1212";
	   if  (new_des.equals(New_Description.getText())) {
		   System.out.println("The description is good :" +New_Description.getText());
	   }
	   else
		   System.out.println("The description is not good it mast be : " +new_des );
	   }
	   
	   
	   
	   public static void verification_country () {
			 
		   String new_con = "paris1";
		   if  (new_con.equals(New_Country.getText())) {
			   System.out.println("The description is good :" +New_Country.getText());
		   }
		   else
			   System.out.println("The description is not good it mast be : " +new_con );
		   }
	   
	   
	   
	   public static void verification_siret () {
			 
		   String new_ser = "12345678978945";
		   if  (new_ser.equals(New_Siret.getText())) {
			   System.out.println("The description is good :" +New_Siret.getText());
		   }
		   else
			   System.out.println("The description is not good it mast be : " +new_ser );
		   }
	   
	   
	   public static void verification_adress() {
			 
		   String new_adre = "20 rue ampaire";
		   if  (new_adre.equals(New_Adress.getText())) {
			   System.out.println("The description is good :" +New_Adress.getText());
		   }
		   else
			   System.out.println("The description is not good it mast be : " +new_adre );
		   }
	   
	   
	   public static void verification_phone() {
			 
		   String new_number = "7235689784";
		   if  (new_number.equals(New_Phone.getText())) {
			   System.out.println("The description is good :" +New_Phone.getText());
		   }
		   else
			   System.out.println("The description is not good it mast be : " +new_number);
		   }
	   
	   
	   

		public static void InvalidSiret() throws InterruptedException {
			Siret.sendKeys("123");
		}
		
		public static void InvalidSiretrmessage() throws InterruptedException {
			String message_InvalidSiret = "Le champ SIRET doit contenir uniquement 14 chiffres !" ;
			if (message_InvalidSiret.equals(message.getText())) {
				System.out.println("the message erreur is goode : "+message.getText());
			    }
				else
				{
					System.out.println("the message erreur is not goode : "+message_InvalidSiret);	
				}
			
			
	    	
	    	Thread.sleep(2000);
	    
	    
			
			btn_ok.click();
		}
		
		public static void EmptySiret() {
			Siret.sendKeys("");
		
		}
		 
		public static void InvalidNumber()  {
			Phone.sendKeys("123778");
		}
		
		public static void Invalidnumbermessage() throws InterruptedException {
		
			String message_InvalidNumber= "Le champ MOBILE doit contenir uniquement 10 chiffres !" ;
			if (message_InvalidNumber.equals(message.getText())) {
				System.out.println("the message erreur is goode : "+message.getText());
			    }
				else
				{
					System.out.println("the message erreur is not goode : "+message_InvalidNumber);	
				}
			
			
	    	
	    	Thread.sleep(2000);
	    
	    
			
			btn_ok.click();
		}
		
		
		public static void EmptyNumber() {
			Phone.sendKeys("");
		}
		
		public static void EmptyCompany() {
			Country.sendKeys("");
		}
		
		public static void Btn_insdisabl() {
			btn_registration.isDisplayed();
		}
		
		
		
		 
		   
   
	
 
	

}
