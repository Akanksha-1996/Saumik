package selenium190918;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.amazon.com");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		WebElement a= driver.findElement(By.xpath("//*[@alt='L.O.L. Surprise Under Wraps Doll- Series Eye Spy 1A']"));
		a.click();
	    driver.close();
	}


	}


