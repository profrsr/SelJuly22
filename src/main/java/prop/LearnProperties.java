package prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		File file= new File("./src/main/resources/config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop.getProperty("url"));		
	}
}






