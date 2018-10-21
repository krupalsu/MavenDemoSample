package pageAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLibrary.TestBase;
import genericLibrary.Xls_Reader;
import objectRepository.OR_SF;

public class LaunchSF extends TestBase{
	
	@Test
	public void salesForce() throws IOException {
		
		TestBase tb = new TestBase();
		FileInputStream fs = new FileInputStream("C:\\Users\\krupal\\eclipse-workspace\\MavenDemo2\\src\\main\\java\\genericLibrary\\config.properties");
		Properties prop = new Properties();
		prop.load(fs);
//		Xls_Reader xl = new Xls_Reader(prop.getProperty("datasheetPath"));
		tb.initialiseDriver(prop.getProperty("browserType"));
		driver.get(prop.getProperty("url_SF"));
		
		/*WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password = driver.findElement(By.name("pw"));
		WebElement login = driver.findElement(By.id("Login"));*/
/*		OR_SF objSF = PageFactory.initElements(driver, OR_SF.class);
		
		tb.setText(objSF.userName, xl.getCellData("Sheet1", "Username", 1) );
		tb.setText(objSF.password, xl.getCellData("Sheet1", "Password", 1));
		
		xl.setCellData("Sheet1", "Result", 1, "Pass");
		
		tb.performClick(objSF.login);
*/		
		
	}

}
