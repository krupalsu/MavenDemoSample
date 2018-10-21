package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_SF {
	
	/*WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
	WebElement password = driver.findElement(By.name("pw"));
	WebElement login = driver.findElement(By.id("Login"));*/
	
	//driver.findElement(By.xpath("//input[@type='email']"))
	@FindBy(xpath = "//input[@type='email']")
	public WebElement userName;
	
	//WebElement password = driver.findElement(By.name("pw"));
	
	@FindBy(name="pw")
	public WebElement password;
	
	//WebElement login = driver.findElement(By.id("Login"));
	
	@FindBy(id="Login")
	public WebElement login;
	
	
}
