//package baseclass;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class Testbase {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		
//		
//		
//		//Webdriver driver = new ChromeDriver();
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://foodcourt.expertsoftsys.com/Login/Index");
//		
//		
//		driver.findElement(By.id("login"));
//		WebElement MobileNo = driver.findElement(By.id("login"));
//		
//		driver.findElement(By.id("password"));
//		WebElement PinNo = driver.findElement(By.id("password"));
//		
//		MobileNo.sendKeys("8667413716");
//		PinNo.sendKeys("384398");
//		driver.findElement(By.id("lbtLogin")).click();
//		  Thread.sleep(2000);
//		
//		driver.findElement(By.id("O1Home")).click();
//	    Thread.sleep(2000);
//		
//        Thread.sleep(2000);
//	    driver.findElement(By.id("GagagamaLunch")).click();
//	    
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"25_table_0\"]")).click();
//	    
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("15_1_Desription")).click();
//	    
//	    //Thread.sleep(2000);
//	    //driver.findElement(By.id("15_1ddl0")).click();
//	    
//	       WebElement element = driver.findElement(By.xpath("//select[@id=\"15_1ddl0\"]"));
//		   Select sel = new Select(element);
//		   sel.selectByVisibleText("Business Meal Special Combo");
//	    
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("15_1_button")).click();
//	    
//	    
//		//SOUTH INDIAN CLASSICS
//		//Thread.sleep(2000);
//		//driver.findElement(By.xpath("//*[@id=\"26_table_2\"]")).click();
//		
//		//Thread.sleep(2000);
//		//driver.findElement(By.id("1_3_button")).click();
//		
//		
//		//Thread.sleep(2000);
//		//driver.findElement(By.id("get_in_touch")).click();
//		
//	    //VADA 
//	    //Thread.sleep(2000);
//	    //driver.findElement(By.xpath("//*[@id=\"8_table_5\"]")).click();
//	    
//	    //Thread.sleep(2000);
//	    //driver.findElement(By.id("50_9_button")).click();
//	    
//	    
//	    //FRESH JUICE
//        //Thread.sleep(2000);
//	    //driver.findElement(By.xpath("//*[@id=\"9_table_6\"]")).click();
//	    
////	    JavascriptExecutor js = (JavascriptExecutor) driver;
////	    js.executeScript("window.scrollBy(0,-170)", "");
//////	  
////	    Thread.sleep(2000);
////	    driver.findElement(By.id("56_11_button")).click();
////	    
////	    driver.findElement(By.id("57_12_button")).click();
////	    
////	    driver.findElement(By.id("58_13_button")).click();
//	    
//	  //driver.findElement(By.id("59_14_button")).click();
//	    
//	    
//	    //MILKSHAKES
////	    
////	   Thread.sleep(2000);
////	   driver.findElement(By.xpath("//*[@id=\"10_table_4\"]")).click();
////	   
////	   Thread.sleep(2000);
////	   driver.findElement(By.id("71_5_button")).click();
////	    
////	   Thread.sleep(2000);
////	   driver.findElement(By.id("72_6_button")).click();
////	    
////	   Thread.sleep(2000);
////	   driver.findElement(By.id("74_7_button")).click();
////	   
//	    
//	    
//	    
//	    
//	     Thread.sleep(2000);
//		 driver.findElement(By.id("btnContinue1")).click();
//
//		 Thread.sleep(2000);
//	     driver.findElement(By.id("btnMobileCheck")).click();
//		
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("btnOtherPayment")).click();
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
