package Module;

import Factory.LoginFactory;
import Factory.ProfilFactory;
import Factory.RecuFactory;
import Factory.SidebarFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import static Factory.LoginFactory.checkMessage;
import static Factory.LoginFactory.clickOk;
import static Factory.LoginFactory.enterEmail;
import static Factory.LoginFactory.enterPassword;
import static Factory.LoginFactory.loginIn;
import static Module.Hooks.driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;









public class Hooks {
    public static WebDriver driver;
    public LoginFactory loginfactory = new LoginFactory();
    public ProfilFactory profilfactory = new ProfilFactory();
    public RecuFactory recufactory = new RecuFactory();
    public SidebarFactory sidefactory =new SidebarFactory();
    
    private static final int IMPLICIT_WAIT = 30;
    private static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    private static final String DRIVER_PATH = "/src/test/resources/Drivers/chromedriverr.exe";
    private static final String URL_APPLICATION = "https://recaptech.fr/";
    
    


    


    @Before (order=1)
    public void setUp(){
    	
    	System.out.println("Open the browser*** ");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
       
        //PageFactory.initElements(Driver,Search);
        PageFactory.initElements(driver,loginfactory);
        PageFactory.initElements(driver,profilfactory);
        PageFactory.initElements(driver,recufactory);
        PageFactory.initElements(driver,sidefactory);

    }
    
   
    @Before(order=2)
	public void open_recaptec_Given() throws InterruptedException {
	        driver.get(URL_APPLICATION);
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	}
	        
	
    
    
    
    
    
    @Before(value="@Smoke" ,order=3)
    public void  connecter () throws InterruptedException {
    	System.out.println("Connecter**");
    	driver.findElement(By.id("email_field")).sendKeys("youssefmehri27@gmail.com");
    	driver.findElement(By.id("password_field")).sendKeys("youssefmehri27@gmail");
    	driver.findElement(By.xpath("/html/body/app-root/app-login/main/div/section/div[2]/div/div/form/div[3]/button")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
    	Thread.sleep(2000);
    	
    }
   
	
    
    

    @After (order=4)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","My screenshot");
        }
        driver.close();
    }

}

