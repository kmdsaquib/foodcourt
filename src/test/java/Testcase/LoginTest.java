package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTest {
	
	public static void main(String[] args) {
		
		LoginPage();
	}
	static WebDriver driver =null;
	public static void LoginPage()  {
		
		
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://foodcourt.expertsoftsys.com/Login/Index");
	
     
	PageFactory.initElements(driver, LoginPage.class);
	
	
	
	LoginPage.MobileNo.sendKeys("8667413716");
	LoginPage.PinNO.sendKeys("384398");
	LoginPage.Log_in.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.id("login")).sendKeys("8667413716");
//	LoginPage.MobileNo(driver).sendKeys("8667413716");
//	LoginPage.PinNO(driver).sendKeys("384398");
//	LoginPage.Log_in(driver).sendKey(Keys.RETURN);
//	
	
	 //driver.findElement(By.id("password")).sendKeys("384398");
	 //driver.findElement(By.id("lbtLogin")).click();
	


