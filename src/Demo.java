import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Sample s= new Sample(driver);
	s.username("admin");
	s.password("admin");
	s.submitbutton();
	
	}

}
