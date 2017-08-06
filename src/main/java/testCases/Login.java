package testCases;

import org.junit.Test;

import wrappers.ProjectSpecificWrapper;

public class Login extends ProjectSpecificWrapper{
	
	
	@Test
	public void createLead() {		
		login();
		clickByLink("Leads");
		clickByLink("Create Lead");		
	}

}
