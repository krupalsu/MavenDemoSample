package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	int ddPart,mmPart,yyyyPart;
	public static WebDriver driver;
	public void initialiseDriver(String browser) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\krupal\\eclipse-workspace\\MavenDemo2\\src\\main\\java\\genericLibrary\\config.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
			driver = new ChromeDriver();								//to launch a browser
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("FFDriverPath"));
			driver = new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEDriverPath"));
			driver = new InternetExplorerDriver();
		
		}
		driver.manage().window().maximize();
		
	}
	
	public void setText(WebElement obj, String fieldValue) {
		if(obj.isDisplayed()) {
			obj.sendKeys(fieldValue);
		}
		
	}
	
	public void performClick(WebElement obj) {
		if(obj.isDisplayed()) {
			obj.click();
		}
	}
	
	public void selectFromDropdown(WebElement obj,String fieldValue,String valueType) {
		Select s = new Select(obj);
		if(valueType.equals("typeText")) {
			s.selectByVisibleText(fieldValue);
		}
		else if(valueType.equals("typeValue")) {
			s.selectByValue(fieldValue);
		}
		else if(valueType.equals("typeIndex")) {
			s.selectByIndex(Integer.parseInt(fieldValue));
		}
		
	}

	public boolean radioButtonClick(WebElement obj) {
		if (obj.isDisplayed()) {
			obj.click();
		}
		if (obj.isSelected()) {
			return (true);
		}
		else return (false);
	}
	
	public void takeSnapShot(String fileName) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\krupal\\eclipse-workspace\\MavenDemo2\\Reports\\"+fileName+".png");

                //Copy file at destination

                //FileUtils.copyFile(SrcFile, DestFile);
                FileHandler.copy(SrcFile, DestFile);

    }
	public void waitUntil(WebElement obj) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(obj));
	}
	
	public void dateFormatter(String dInput) {
		
		ddPart = Integer.parseInt(dInput.substring(0,2));
		mmPart = Integer.parseInt(dInput.substring(2,4));
		yyyyPart = Integer.parseInt(dInput.substring(4,8));
		

	}
}
