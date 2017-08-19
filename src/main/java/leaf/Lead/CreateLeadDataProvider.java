package leaf.Lead;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readExcel.DataInputProvider;
import wrappers.GenericWrappers;
import wrappers.ProjectSpecificWrapper;
public class CreateLeadDataProvider extends ProjectSpecificWrapper{
	@Test(dataProvider="fetchData")
	public void createLead(String co,String fn,String ln) throws Exception{
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",co);
		enterById("createLeadForm_firstName", fn);
		enterById("createLeadForm_lastName", ln);		
		clickByName("submitButton");
		
		/*System.out.println("Company Name :"+co);
		System.out.println("First Name :"+fn);
		System.out.println("Last Name "+ln);*/
		//closeBrowser();
	}
	
	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{
		DataInputProvider dp = new DataInputProvider();
		return dp.readExcel("CreateLead");
		/*return new Object[][]{
			{"TestLeaf","Babu","M"},
			{"TestLeaf","Lokesh","T"}
			};*/
		
	}
}









