package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{
	static
	  {
	   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	  }
	
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Get the URL
		driver.get("http://www.makemytrip.com");
		//driver.manage().window().maximize();
		
		//Click on login button on website home-page
		 driver.findElement(By.id("ch_login_icon")).click();
		 
		 Thread.sleep(2000);
		 
		 //Get user ID
		 driver.findElement(By.id("ch_login_email")).sendKeys("ankitd514@gmail.com");
		 
		 //Get Password
		 driver.findElement(By.id("ch_login_password")).sendKeys("ankitdas123");
		 
		Thread.sleep(2000);
		
		//Click on login button	
		 driver.findElement(By.id("ch_login_btn")).click();
		 
		//Displaying title of the logged-in page 
		    String mmt = driver.getTitle();  
				System.out.println(mmt);
		 
		  //URL of the page
			String ummt=driver.getCurrentUrl();
			System.out.println(ummt);
			
		//Verification
			  if(mmt.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
			   {
				  System.out.println("MMT test passed");
			   }
			  else
			   {
				  System.out.println("MMT test failed");
			   }   
			
		 
	

	}

}
