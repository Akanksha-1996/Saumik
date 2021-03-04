package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cat 
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
		driver.get("https://cdn.digialm.com/EForms/configuredHtml/756/57235/login.html");
		
		//get valid username
	    driver.findElement(By.id("userid")).sendKeys("");
	    
	    //get valid password
	    driver.findElement(By.id("confData")).sendKeys("");
	    
	  //click on login button
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    
	  //Displaying title of the logged-in page 
	    String cat = driver.getTitle();  
			System.out.println(cat);
	 
	  //URL of the page
		String ucat=driver.getCurrentUrl();
		System.out.println(ucat);
		
		//Verification for logged-in page
		  if(cat.equals("CAT 2018"))
		   {
			  System.out.println("CAT 2018 test passed");
		   }
		  else
		   {
			  System.out.println("CAT 2018 test failed");
		   }   
		    
		  driver.close();	
}    
}


