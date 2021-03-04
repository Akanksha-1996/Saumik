package selenium190918;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.bigbasket.com");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		 driver.findElement(By.xpath("//*[text()='Login']"));
		WebElement a= driver.findElement(By.id("email"));
		a.sendKeys("Akanksha");
		WebElement b= driver.findElement(By.id("pass"));
		b.sendKeys("Asthana");
		WebElement c= driver.findElement(By.xpath("//*[@class='btn btn-default login-btn fixed-btn']"));
		c.click();
		driver.close();
		}
}
