package leaf.Lead;
import org.testng.annotations.Test;
import wrappers.ProjectSpecificWrapper;
public class DeleteLead extends ProjectSpecificWrapper{
	@Test
	public void deleteLead() throws Exception {
		//login();
		clickByLink("Leads");
		clickByLink("Find Leads");		
		clickByXpath("//span[contains(text(),'Phone')]");		
		enterByName("phoneNumber", "9597704568");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(2000);
		String sText = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", sText);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		verifyTextContainsByXpath("//div[@class='x-paging-info']", "No records to display");
		//closeBrowser();
	}

}
