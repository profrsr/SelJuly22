package week2Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {

		// Launch the browser and load URL, maximise
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size());

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		String parentWindow = driver.getWindowHandle();

		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);			
		}

		System.out.println("*************************");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		


	}

}





































