package wrappers;

public class ProjectSpecificWrapper extends GenericWrappers {
	
	public void login(){
		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		
	}

}
