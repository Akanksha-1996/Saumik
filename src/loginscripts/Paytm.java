package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm
{
	static
	  {
	   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	  }

	public static void main(String[] args) throws InterruptedException
	{
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("https://paytm.com/");
		//driver.manage().window().maximize();

		//type="search"
		 driver.findElement(By.xpath("//*[@type='search']")).sendKeys("das.ankit@1227");

		 //click on login button on home-page
	    driver.findElement(By.xpath("//div[.='Log In/Sign Up']")).click();
				
	    Thread.sleep(5000);
				  
		//get valid username
	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("9098787727");
			    
	    //get valid password
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
			    
	  //Displaying title of the logged-in page 
	    String pyt = driver.getTitle();  
			System.out.println(pyt);
	 
	  //URL of the page
		String upyt=driver.getCurrentUrl();
		System.out.println(upyt);
		
		//Verification for logged-in page
		  if(pyt.equals(" "))
		   {
			  System.out.println("Paytm test passed");
		   }
		  else
		   {
			  System.out.println("Paytm test failed");
		   }    
		    
		  driver.close();
			  
				

	}

}
