package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttributes {
	/*@Test(invocationCount=2,threadPoolSize=2)*/
	/*@Test(invocationCount=2,invocationTimeOut=30000)*/
	/*@Test(timeOut=15000,invocationCount=2)*/
/*	@Test(expectedExceptions={NoSuchElementException.class})
*/	
	@Test(invocationCount=10,successPercentage=80)
	public void test() {
		// Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Syntax
		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize
		driver.manage().window().maximize();
		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.close();
	}

}
