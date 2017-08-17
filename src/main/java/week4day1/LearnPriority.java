package week4day1;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority=1)
	public void editLead(){
		System.out.println("Edit Lead");
	}
	
	@Test(priority=1)
	public void createLead(){
		System.out.println("Create Lead");
	}
	

	@Test(priority=1)
	public void dcreateLead1(){
		System.out.println("Create Lead1");
	}
	
	
	
	
}
