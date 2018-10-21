package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_SJ {

	@FindBy(xpath = "//label[contains(text(),'Round Trip')]")
	public WebElement flightRoundTrip;
	
	/*@FindBy(xpath="//input[contains(@id,'RoundTrip')]")
	public WebElement flightRoundTrip_RB;
	*/
	@FindBy(xpath = "//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")
	public WebElement clickDeparture;
	
	@FindBy(xpath = "//a[@value='BLR']")
	public WebElement fromCity;
	
	@FindBy(xpath = "(//a[@value='DEL'])[2]")
	public WebElement toCity;
	
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-active' and contains(text(),'27')]")
	public WebElement dtDepart;
	
	@FindBy(xpath = "//input[@id='ctl00_mainContent_view_date2']//following-sibling::button")
	public WebElement clickReturn;
	
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-active' and contains(text(),'27')]")
	public WebElement dtReturn;
	
	@FindBy(id = "divpaxinfo")
	public WebElement clickPassenger;
	
	@FindBy(id = "hrefIncAdt")
	public WebElement plusAdult;
	
	@FindBy(id = "hrefIncInf")
	public WebElement plusInfant;
	
	@FindBy(id = "btnclosepaxoption")
	public WebElement donePassenger;
	
	@FindBy(id = "ctl00_mainContent_btn_FindFlights")
	public WebElement btnSearch;
	
	
}
