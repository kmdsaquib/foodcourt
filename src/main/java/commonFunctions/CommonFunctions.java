package commonFunctions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	
	static Properties properties = null;
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("config.properties"); 
		Properties properties  = new Properties();
		properties.load(fileInputStream);
		return properties;
		
		
		
		
	}
	
	@BeforeSuite
	public void launchBrowser() {
		
		
		
		
	}
	
	
	
	
	
	
	@AfterSuite
	public void tearDown() {
		
		
	 
	
	
}}
