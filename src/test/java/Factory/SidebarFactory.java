package Factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidebarFactory {
	
	
	
	@FindBy(xpath="/html/body/app-root/app-core/app-sidebar/aside/ul/li[1]/div/a/span")
	 public static WebElement Dashbord;
	
	@FindBy(xpath="/html/body/app-root/app-core/app-profil/main/section/div/div[1]")
	 public static WebElement Intervention;
	
	
	@FindBy(xpath="/html/body/app-root/app-core/app-sidebar/aside/ul/li[4]/div/a/span")
	 public static WebElement Technicien;
	
	@FindBy(xpath="/html/body/app-root/app-core/app-sidebar/aside/ul/li[4]/div/a/span/html/body/app-root/app-core/app-sidebar/aside/ul/li[5]/div")
	 public static WebElement Bpu;
	
	
	
	public static void linkDashbord() {
		Dashbord.click();
	}
	
	public static void linkIntervention() {
		Intervention.click();
	}
	
	public static void linkTechnicien () {
		Bpu.click();
	}

}


