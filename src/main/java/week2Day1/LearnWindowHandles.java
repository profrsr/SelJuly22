package week2Day1;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws IOException {

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
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap1.jpg");		
		FileUtils.copyFile(src, desc);
		


	}

}





































