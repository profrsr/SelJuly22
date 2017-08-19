package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import readExcel.DataInputProvider;

public class ProjectSpecificWrapper extends GenericWrappers {
	
	@BeforeMethod
	public void login(){	
		startTestCase("TC001", "CreateLead", "Babu", "Smoke");
		invokeApp("chrome","http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}
	
	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}	
		
	@AfterSuite
	public void afterSuite(){
		endResult();		
	}
	
	@AfterMethod
	public void afterMethod(){
		quitBrowser();		
		endTestcase();
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData() throws InvalidFormatException, IOException{
		return new DataInputProvider().readExcel("CreateLead");		
	}	
}
