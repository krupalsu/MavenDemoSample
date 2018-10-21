package pageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLibrary.TestBase;
import objectRepository.OR_SJ;


public class Spicejet extends TestBase{

/*	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
*/
    @Test
	public void SpiceJ() throws IOException, InterruptedException {
//		int incAdults, incChildren, incInfants;
//		String browser="chrome";
//		WebElement numAdults,numChildren,numInfants;

		FileInputStream fs = new FileInputStream("C:\\Users\\krupal\\eclipse-workspace\\MavenDemo2\\src\\main\\java\\genericLibrary\\config.properties");
		Properties prop = new Properties();
		prop.load(fs);		
		
		TestBase tb = new TestBase();
		tb.initialiseDriver(prop.getProperty("browserType"));
		
		OR_SJ objSJ = PageFactory.initElements(driver, OR_SJ.class);
		driver.get(prop.getProperty("url_SJ")); 
		

		
		
		if (driver.getTitle().equalsIgnoreCase("Book Low Cost Air Tickets Online on Domestic & International Flights – SpiceJet")) {
			System.out.println("In Home page");
		}
		Thread.sleep(3000);
		tb.performClick(objSJ.flightRoundTrip);
		tb.performClick(objSJ.clickDeparture);
 		tb.performClick(objSJ.fromCity);
		tb.performClick(objSJ.toCity);
		tb.performClick(objSJ.dtDepart);
		tb.performClick(objSJ.clickReturn);
		tb.performClick(objSJ.dtReturn);
		tb.performClick(objSJ.clickPassenger);
		tb.performClick(objSJ.plusAdult);
		tb.performClick(objSJ.plusInfant);
		tb.performClick(objSJ.donePassenger);
		tb.performClick(objSJ.btnSearch);
		
			
	
		if (driver.getTitle().equalsIgnoreCase("Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines")) {
			System.out.println("In Search results page");
		}
		
		
/*		tb.performClick(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		Thread.sleep(3000);
		tb.performClick(driver.findElement(By.xpath("//a[@value=\"BLR\"]")));
		tb.performClick(driver.findElement(By.xpath("(//a[@value='DEL'])[2]")));
		tb.performClick(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[7]/a")));
*/		
		
		
		
/*		tb.waitUntil(driver.findElement(By.xpath("//div[@id='divpaxinfo']")));
		tb.performClick(driver.findElement(By.xpath("//div[@id='divpaxinfo']")));
		numAdults=driver.findElement(By.id("spanAudlt"));
		
		incAdults=1;
		while (incAdults <= 3)
		{
			if (incAdults == 3) break;//Breaking loop once count equals 3
			tb.performClick(driver.findElement(By.xpath("//*[@id='hrefIncAdt']")));
			incAdults++;
		}
//		System.out.println("Number of Adults = "+numAdults.getText());
		
		incInfants=1;
		while (incInfants < 2)
		{
			if (incInfants == 2) break;//Breaking loop once count equals 2
			tb.performClick(driver.findElement(By.xpath("//*[@id='hrefIncInf']")));
			incInfants++;
		}
//		System.out.println("Number of Infants = "+numAdults.getText());
		tb.performClick(driver.findElement(By.id("btnclosepaxoption")));
		tb.performClick(driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")));
		if (driver.getTitle().equalsIgnoreCase("Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines")) {
			System.out.println("In Search results page");
		}
		List <WebElement> tRows =driver.findElements(By.xpath("//*[@id=\"availabilityTable0\"]/tbody/tr/td[1]"));
		int numRows = tRows.size();
		System.out.println("No of table rows: "+numRows);
		
		List <WebElement> tCols =driver.findElements(By.xpath("//*[@id=\"availabilityTable0\"]/tbody/tr/th"));
		int numCols = tCols.size();
		System.out.println("No of table columns: "+numCols);
*/		
/*		int rowNum=1, colNum=1;
		for (WebElement tR:tRows) {
			for (WebElement tD:tCols) {
				System.out.println("Row #"+rowNum+", Col #"+colNum+" text is "+driver.findElement(By.xpath("//*[@id='availabilityTable0']/tbody/tR[rowNum]/tD[colNum]/p/label/span")));
				colNum++;
			}
			rowNum++;
		}
		
		int startRow = 4;
		for (int i=startRow; i<numRows;i++) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"availabilityTable0\"]/tbody/tr[i]/td[4]/p/label/span")).getText());
		}
*/		
	} // End spiceJ class
	
}// End of spice jet Class
