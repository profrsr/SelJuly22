package leaf.Contact;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;

public class CreateContact extends ProjectSpecificWrapper {

	@Test
	public void  createContact() throws Exception {
		//login();		
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
		//closeBrowser();
	}	
}
