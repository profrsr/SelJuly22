package week2Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToSpecificWindow {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser and load URL, maximise
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Click Checkin to open another
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		// Get the number of opened windows
		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size());

		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);			
		}
		
		Thread.sleep(3000);

		// Now, in second window -> Click View Offer»
		driver.findElementByLinkText("View Offer»").click();
		
		System.out.println("**********************************");
		
		// Find the count of windows again
		allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);			
		}

		// Now, in third window 
		System.out.println(driver.getTitle());
		
		System.out.println("**********************************");

		
		// What if i want to go to second window now?
		
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);
			if(driver.getTitle().equals("Crystal Cruises Priority Check In & Planning Center")){
				break;
			}
		}
		
		System.out.println(driver.getTitle());

	}

}





































