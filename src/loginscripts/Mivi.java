package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mivi 
{
	static
	  {
	   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	  }
	
public static void main(String[] args)
{
		//launch the browser
		WebDriver driver=new ChromeDriver();
			
		//enter the URL
		driver.get("https://www.mivi.in/login");
		
		//get valid username
	    driver.findElement(By.id("spree_user_email")).sendKeys("ankitd514@gmail.com");
	    
	    //get valid password
	    driver.findElement(By.id("spree_user_password")).sendKeys("9098787727");
	    
	  //click on login button
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	  //Displaying title of the logged-in page 
	    String miv = driver.getTitle();  
			System.out.println(miv);
	 
	  //URL of the page
		String umiv=driver.getCurrentUrl();
		System.out.println(umiv);
		
		//Verification for logged-in page
		  if(miv.equals("Mivi Quality Electronics and Mobile Accessories - Mivi"))
		   {
			  System.out.println("Mivi test passed");
		   }
		  else
		   {
			  System.out.println("Mivi test failed");
		   }   
		    
		  driver.close();	
}    
}


