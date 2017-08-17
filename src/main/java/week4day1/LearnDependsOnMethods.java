package week4day1;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {
	@Test
	public void editLead(){
		System.out.println("Edit Lead");
	}
	
	@Test()
	public void createLead(){
		System.out.println("Create Lead");
		throw new RuntimeException();
	}
	

	@Test(dependsOnMethods={"createLead"},alwaysRun=true)
	public void deleteLead(){
		System.out.println("Delete Lead");
	}
	
	@Test(enabled=false)
	public void mergeLead(){
		System.out.println("Merge Lead");
	}
	
	
	
	
	
	
	
	
	
	
	
}
