package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amcat 
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
		driver.get("https://www.myamcat.com/login?msg[]=1");
		
		//get valid username
	    driver.findElement(By.id("name")).sendKeys("ankitd514@gmail.com");
	    
	    //get valid password
	    driver.findElement(By.name("pswd")).sendKeys("ankitdas1995");
	    
	  //click on login button
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
				
	  //Displaying title of the page
	    String amct = driver.getTitle();  
		System.out.println(amct);
		  
	  //URL of the page
		String uamct=driver.getCurrentUrl();
		System.out.println(uamct);
		
		//Verification
		  if(amct.equals("Login - AMCAT"))
		   {
			  System.out.println("Amcat test passed");
		   }
		  else
		   {
			  System.out.println("Amcat test failed");
		   }    
		    
		  driver.close();

	}

}
