package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb 
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
		driver.get("https://www.facebook.com/");
		
		  
		//get valid username
	    driver.findElement(By.id("email")).sendKeys("ankitdas1995@facebook.com");
	    
	    //get valid password
	    driver.findElement(By.id("pass")).sendKeys("");
	    
	  //click on login button
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    
	  //Displaying title of the logged-in page 
	    String fb = driver.getTitle();  
			System.out.println(fb);
	 
	  //URL of the page
		String ufb=driver.getCurrentUrl();
		System.out.println(ufb);
		
		//Verification for logged-in page
		  if(fb.equals("Facebook"))
		   {
			  System.out.println("Fb test passed");
		   }
		  else
		   {
			  System.out.println("Fb test failed");
		   }    
		    
		  driver.close();
}    
}


