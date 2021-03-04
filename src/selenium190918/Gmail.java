package selenium190918;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	String u=driver.getCurrentUrl();
	System.out.println(u);
	WebElement a= driver.findElement(By.xpath("//*[@type='email']"));
	//a.sendKeys("Akanksha");
	//WebElement b= driver.findElement(By.id("pass"));
	//b.sendKeys("Asthana");
	//WebElement c= driver.findElement(By.id("loginbutton"));
	//c.click();
	//driver.close();
     
	

	}

}
