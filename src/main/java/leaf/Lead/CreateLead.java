package leaf.Lead;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;
public class CreateLead extends ProjectSpecificWrapper{
	@Test(groups={"smoke"},dataProvider="fetchData")
	public void createLead(String compName,String firstname,String lastname) throws Exception{
		//login();
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",compName);
		enterById("createLeadForm_firstName", firstname);
		enterById("createLeadForm_lastName", lastname);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
		//closeBrowser();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return new Object[][]{
			{"TestLeaf","Babu","M"},
			{"TestLeaf","Lokesh","T"},
			{"TestLeaf","Sharath","T"}
			};
		
	}
}









