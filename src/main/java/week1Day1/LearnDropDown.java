package week1Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {

		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Syntax 
		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps");

		//Maximize
		driver.manage().window().maximize();

		//Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");

		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		/*////Click on LogOut Button
				driver.findElementByClassName("decorativeSubmit").click();
		 */

		//Click CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();


		WebElement src = driver.findElementById("createLeadForm_dataSourceId");			

		Select dd = new Select(src);

		//	dd.selectByVisibleText("Partner");				
		//	dd.selectByValue("LEAD_TRADESHOW");

		List<WebElement> allOptions = dd.getOptions();				
		int optCount = allOptions.size();								
		System.out.println(optCount);								
		dd.selectByIndex(optCount-1);


	}

}









