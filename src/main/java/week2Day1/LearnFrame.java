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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		throw new RuntimeException();
		
		/*WebElement frameSrc = driver.findElementByClassName("demo-frame1");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//SwitchToFrame
		driver.switchTo().frame(frameSrc);

		System.out.println(driver.findElementById("droppable").getText());

		//Come Out of All Frames
		driver.switchTo().defaultContent();


		//	driver.switchTo().parentFrame();

		driver.findElementByLinkText("Download").click();
*/
	}

}












