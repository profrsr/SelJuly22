package reports;

import org.testng.annotations.Test;
import wrappers.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{
	@Test(dataProvider="fetchData")
	public void createLead(String co,String fn,String ln) throws Exception{
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",co);
		enterById("createLeadForm_firstName", fn);
		enterById("createLeadForm_lastName", ln);		
		clickByName("submitButton");

	}
	
	
	
}









