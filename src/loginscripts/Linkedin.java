package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin 
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
		driver.get("https://www.linkedin.com/");
		
		//get valid username
	    driver.findElement(By.id("login-email")).sendKeys("ankitd514@gmail.com");
	    
	    //get valid password
	    driver.findElement(By.id("login-password")).sendKeys("9098787727");
	    
	  //click on login button
	    driver.findElement(By.xpath("//input[@id='login-submit']")).click();
	    
	  //Displaying title of the page
	    String lkd = driver.getTitle();  
		System.out.println(lkd);
		  
	  //URL of the page
		String ulkd=driver.getCurrentUrl();
		System.out.println(ulkd);
		
		//Verification
		  if(lkd.equals("LinkedIn"))
		   {
			  System.out.println("Linkedin test passed");
		   }
		  else
		   {
			  System.out.println("Linked test failed");
		   }    
		    
		  driver.close();
		
	}

}
