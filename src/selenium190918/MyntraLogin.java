package selenium190918;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.myntra.com");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		 driver.findElement(By.xpath("//*[@class='myntraweb-sprite desktop-iconUser sprites-user']")).click();
		driver.findElement(By.xpath("//[text()='login']")).click();
		//a.sendKeys("7077977110");
		WebElement b= driver.findElement(By.id("ch_login_password"));
		b.sendKeys("Akki123");
		WebElement c= driver.findElement(By.id("ch_login_btn"));
		c.click();
		driver.close();

	}

	}


