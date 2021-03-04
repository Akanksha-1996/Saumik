package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bewakoof
{
static
{
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException
	{
		//launching the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("https://www.bewakoof.com/");
		driver.manage().window().maximize();
		//click on Login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//entering the email/mobile number
		driver.findElement(By.name("username")).sendKeys("9098787727");
		
		//clicking on continue button after entering mobile number
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(4000);
		
		//entering password
		driver.findElement(By.name("password")).sendKeys("9098787727");
		
		//click on login
		driver.findElement(By.xpath("//button[text()='Login']")).click();
			
		//Getting the title of the page
		String bewkoof=driver.getTitle();
		System.out.println(bewkoof);
		
		//Getting the URL
		String ubewkoof=driver.getCurrentUrl();
		System.out.println(ubewkoof);
		
		//Verification for logged-in page
		  if(bewkoof.equals("Online Fashion Shopping for Men, Women, Accessories - Bewakoof.com"))
		   {
			  System.out.println("Bewakoof test passed");
		   }
		  else
		   {
			  System.out.println("Bewakoof test failed");
		   }   
		 Thread.sleep(3000);   
		  driver.close();
		
	}

}
