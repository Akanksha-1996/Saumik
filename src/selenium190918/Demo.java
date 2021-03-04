package selenium190918;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		Demo.abc(driver);
		WebDriver driver1= new FirefoxDriver();
		Demo.abc(driver1);


	}
	public static void abc(WebDriver d)
	{
		d.get("https://www.facebook.com");
		String u = d.getCurrentUrl();
		System.out.println(u);
		String t = d.getTitle();
		System.out.println(t);
		d.close();
	}
}