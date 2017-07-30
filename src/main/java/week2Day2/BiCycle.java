package week2Day2;

public class BiCycle {
	
	public String getColor(){		
		return "pink";		
	}
	
	/*public String getColorBSA(){
		return "black";		
	}
	
	public String getColorHER(){
		return "Red";		
	}*/
	
	public String getColor(String which){
		if(which.equals("BSA")){
			return "black";	
		}
		else return "Red";		
	}	
	
	public String getColor(int which){
		if(which==0){
			return "black";	
		}
		else return "Red";		
	}
	
	public String getColor(String which, String type){
		if(which.equals("BSA") && type.equals("sports")){
			return "black";	
		}
		else return "Red";		
	}
	
	
	

}












