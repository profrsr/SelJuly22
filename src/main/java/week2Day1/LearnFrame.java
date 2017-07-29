package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement frameSrc = driver.findElementByClassName("demo-frame");
		
		//SwitchToFrame
		driver.switchTo().frame(frameSrc);
		
		System.out.println(driver.findElementById("droppable").getText());
		
		//Come Out of All Frames
		driver.switchTo().defaultContent();
		
		
	//	driver.switchTo().parentFrame();
		
		driver.findElementByLinkText("Download").click();

	}

}












