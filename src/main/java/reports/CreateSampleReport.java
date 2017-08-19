package reports;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateSampleReport {
	
	@Test
	public void createReport(){
		
		// 1) Create a HTML report
		ExtentReports report = new ExtentReports("./report/result.html", false);
		File config = new File("./src/main/resources/extent-config.xml");
		report.loadConfig(config);
		
		// 2) Start report for each testcase
		ExtentTest test = report.startTest("TC002", "Edit a Lead");
		test.assignAuthor("Babu");
		test.assignCategory("Smoke");
		
		
		// 3) Make an entry for each step with in testcase
		test.log(LogStatus.PASS, "The Company Name Entered Successfully");
		test.log(LogStatus.WARNING, "The First Name Entered Successfully");
		
		// 4) Mark the test case as complete in report
		report.endTest(test);
		
		// 5) Mark the test suite as ready
		report.flush();
		
	}

	
	
	
	
	
	
	
	
}



