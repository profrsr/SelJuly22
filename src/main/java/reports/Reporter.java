package reports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter {
	public ExtentReports report;
	public ExtentTest test;
	
	//@BeforeSuite
	// create html report
	public void startResult(){
		report = new ExtentReports("./report/result.html", false);
		File config = new File("./src/main/resources/extent-config.xml");
		report.loadConfig(config);		
	}
	
	//@BeforeMethod
	// create testcase report
	public void startTestCase(String testCase, String desc, String author, String category){
		test = report.startTest(testCase, desc);
		test.assignAuthor(author);
		test.assignCategory(category);		
	}
	
	//replace syso with the reportStep
	// create logs (step for each testcase
	public void reportStep(String desc, String status) {
		if(status.equalsIgnoreCase("PASS")){
			test.log(LogStatus.PASS, desc);			
		} else if(status.equalsIgnoreCase("FAIL")){
			test.log(LogStatus.FAIL, desc);
			throw new RuntimeException();
		} else if(status.equalsIgnoreCase("WARN")){
			test.log(LogStatus.WARNING, desc);			
		}
	}
	
	//@AfterMethod
	// end the testcase	
	public void endTestcase(){
		report.endTest(test);
	}
	
	//@AfterSuite
	// flush the report
	public void endResult(){		
		report.flush();
	}

}
