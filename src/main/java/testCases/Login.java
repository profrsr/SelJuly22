package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers{
	
	@Test
	public void login() {		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit11111");
		clickByClassName("decorativeSubmit");
	//	clickByLink("CRM/SFA");
		
	}

}
