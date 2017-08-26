package week1Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		// Syntax 
	    // ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL123
	/*	driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximize
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
		
		//Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");

		Thread.sleep(5000);
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		////Click on LogOut Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//Click CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();
		
		
*/		
		
	}
}
