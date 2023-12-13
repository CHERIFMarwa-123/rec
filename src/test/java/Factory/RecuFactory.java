package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.PictureTile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
public class RecuFactory {
	
	
	@FindBy(xpath="//*[@id=\"sidebar-nav\"]/li[8]/a/span")
	 public static WebElement siderecu;
	
	
	@FindBy(xpath="/html/body/app-root/app-core/app-recu/main/section/button")
	public static WebElement btn_ajouterrec;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[1]/nz-select/nz-select-top-control/nz-select-search/input")
	public static WebElement dropdown;
	
	@FindBy(xpath="/html/body/div/div[3]/div/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[6]")
	public static WebElement technicianname;
	
	
	
	@FindBy(xpath="/html/body/div/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[2]/input")
	public static WebElement dateBox;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[3]/nz-select/nz-select-top-control/nz-select-search/input")
	public static WebElement categorie;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[4]/nz-upload/div/div/button")
	public static  WebElement picture;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[5]/input")
	public static  WebElement price;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[6]/input")
	public static WebElement tva;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/div[2]/app-ajout-recu/div/div[9]/button")
	public static WebElement btn_ajouterrecu;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/nz-modal-container/div/div/button/span")
	public  static WebElement close;
	
	

	
	
	
	
    
	
	
	
	
static WebDriver driver;
	
	
	public static void SideRecu () {
		siderecu.click();
		
	} 

	
public static void clickAjouterrec () {
	btn_ajouterrec.click();
}


public static void chooseTechnician () throws InterruptedException{
	
 
	dropdown.click();
	dropdown.sendKeys("marwa");
     Thread.sleep(2000); 
    dropdown.sendKeys(Keys.ENTER);
  

 	   
 	    
}

public static void enterDate() {
	dateBox.click();
	
}


public static void chooseDate () {
	dateBox.click();
    //Fill date as jj/mm/aaaa as 19/12/2013
    dateBox.sendKeys("07/07/2023");

}

public static void enterCategorie () throws InterruptedException {
	categorie.click();
	categorie.sendKeys("gaz");
	categorie.sendKeys(Keys.ENTER);
}


public static void enterPicture () throws AWTException {
 
          // Localisez l'élément d'entrée de type "file" (utilisé pour le téléchargement)
             //click action on the button
     		picture.click();
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
             
             
             
             
             
   	}
	
 


public static void enterPrice() {
	price.sendKeys("117");
	
}


public static void enterTva() {
	 tva.sendKeys("0.0177");
	 
}



public static void clicksAjouterrecu() throws InterruptedException {
	btn_ajouterrecu.click();
	close.click();

}




public static void RecuBtnDisabled() throws InterruptedException {
	btn_ajouterrecu.isDisplayed();
	close.click();

}




    

}