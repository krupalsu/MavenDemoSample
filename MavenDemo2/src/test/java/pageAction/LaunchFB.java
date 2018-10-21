package pageAction;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.TestBase;
import objectRepository.OR_FB;
import objectRepository.OR_SF;

public class LaunchFB extends TestBase{


	static WebElement objMale,objFemale;
	static Boolean objClick;
			
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	@Test
	public void facebook() throws Exception {
		//which  we want to create log file in my case Demo is classname
		Logger logger=Logger.getLogger("LaunchFB");
		
		// configure log4j properties file
	    PropertyConfigurator.configure("log4j.properties");
	    
//		String browser = "Chrome";
		String pTitleActual = "";
		String pTitleExpected = "Facebook � log in or sign up";
	
		TestBase tb = new TestBase();
		FileInputStream fis = new FileInputStream("C:\\Users\\krupal\\eclipse-workspace\\MavenDemo2\\src\\main\\java\\genericLibrary\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		tb.initialiseDriver(prop.getProperty("browserType"));
		OR_FB objFB = PageFactory.initElements(driver, OR_FB.class);
		driver.get(prop.getProperty("url_FB"));
		logger.info("Successfully navigated to facebook login page");
		//System.out.println(prop.getProperty("userName_FB"));
		
		System.out.println(prop.getProperty("pwd_FB"));
		tb.setText(objFB.uName, prop.getProperty("userName_FB"));
		logger.info("input to username is : "+ prop.getProperty("userName_FB"));
		tb.setText(objFB.pWord, prop.getProperty("pwd_FB"));
		tb.selectFromDropdown(objFB.dobDay, "25", "typeValue");
		tb.selectFromDropdown(objFB.dobMonth, "Aug", "typeText");
		tb.selectFromDropdown(objFB.dobYear, "15", "typeIndex");
		
		/*Select sValue = new Select(objFB.dobDay);
		Select sText = new Select(objFB.dobMonth);
		Select sIndex = new Select(objFB.dobYear);
		
		sValue.selectByValue("25");
		sText.selectByVisibleText("Aug");
		sIndex.selectByIndex(19);
		*/
		tb.performClick(objFB.oMale);
		if (objFB.oMale.isSelected()) {
			tb.performClick(objFB.oFemale);
			if (objFB.oMale.isSelected()) {
				System.out.println("Failed clicking radio button");
			}
		}
		pTitleActual=driver.getTitle();
		if (pTitleActual.equalsIgnoreCase(pTitleExpected)) {
			System.out.println("On Facebook login page");
		}	
		else {
			System.out.println("URL issue");
		}
		
		
	/*	tb.setText(driver.findElement(By.xpath("//input[@tabindex='1']")), "abc@hotmail.com");
		tb.setText(driver.findElement(By.xpath("//input[@tabindex='2']")), "1234");
	*/
	/*	tb.setText(objFB.uName, "abc@hotmail.com");
		tb.setText(objFB.pWord, "1234");
	
		if (driver.getTitle().equalsIgnoreCase("Facebook-log in or signup")) {
			System.out.println("Invalid login");
		}
		else {
			System.out.println("Valid login");
		}
		
		Select sValue = new Select(driver.findElement(By.id("day")));
		sValue.selectByValue("25");
		
		Select sText = new Select(driver.findElement(By.id("month")));
		sText.selectByVisibleText("Aug");
		
		Select sIndex = new Select(driver.findElement(By.id("year")));
		sIndex.selectByIndex(15);
		
			
		
		objFemale = driver.findElement(By.id("u_0_9"));
		objMale = driver.findElement(By.id("u_0_a"));
		tb.performClick(objFemale);
		if (objFemale.isSelected()) {
			System.out.println("Gender Female selected, Male Radio button selection UNSUCCESSFUL");
		}
		else if (objMale.isSelected()) {
			System.out.println("Gender Male selected");
		}
*/
		//objClick = tb.radioButtonClick(driver.findElement(By.id("u_0_a")));

/*		if (objClick) {
			System.out.println("Radio button clicked");
		} 
		else {
			System.out.println("Radio button not clicked");
		}
*/		//if driver.close() is enabled, then it skips above if statement WHY?
		//driver.close();
		//tb.takeSnapShot("facebooknew");
	}

}
