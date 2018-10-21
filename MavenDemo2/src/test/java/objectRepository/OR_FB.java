package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OR_FB {
	
	
	@FindBy(xpath = "//input[@tabindex='1']")
	public WebElement uName;
	
	@FindBy(xpath = "//input[@tabindex='2']")
	public WebElement pWord;
	
	/*		
	Select sValue = new Select(driver.findElement(By.id("day")));
	sValue.selectByValue("25");
	
	Select sText = new Select(driver.findElement(By.id("month")));
	sText.selectByVisibleText("Aug");
	
	Select sIndex = new Select(driver.findElement(By.id("year")));
	sIndex.selectByIndex(15);
	
		
	
	objFemale = driver.findElement(By.id("u_0_9"));
	objMale = driver.findElement(By.id("u_0_a"));
*/	
	@FindBy(id = "day")
	public WebElement dobDay;
	
	@FindBy(id = "month")
	public WebElement dobMonth;
	
	@FindBy(id = "year")
	public WebElement dobYear;
		
	@FindBy(id = "u_0_a")
	public WebElement oMale;
	
	@FindBy(id = "u_0_9")
	public WebElement oFemale;
	


}
