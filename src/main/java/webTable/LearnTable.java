package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SCT",Keys.TAB);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());		
		WebElement secondRow = rows.get(1);
		
		List<WebElement> columns = secondRow.findElements(By.tagName("td"));
		System.out.println(columns.size());
		System.out.println(columns.get(1).getText());
		
		
		
		
		
	}
}
