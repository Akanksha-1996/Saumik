import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {

	@FindBy(id="email")
	private WebElement usernametb;
	@FindBy(id="pass")
	private WebElement passwordtb;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submitbtn;
	public Sample(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void username(String dummy)
	{
		usernametb.sendKeys(dummy);
	}
	public void password(String passw)
	{
		passwordtb.sendKeys(passw);
	}
	public void submitbutton()
	{
		submitbtn.click();
}
}