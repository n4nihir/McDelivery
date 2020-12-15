package PageBeans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {

	WebDriver driver;
	
	File src = new File("C:\\Users\\Dell\\git\\repository\\McDelivery\\PageFactory.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet cartSheet = wb.getSheetAt(1);
	
	//step 1 : identify elements
	@FindBy(name="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement pfsearch;
	
	@FindBy(name="//input[@id='menu-search']")
	@CacheLookup
	WebElement pfsearchtype;
	
	@FindBy(name="//button[contains(text(),'Done')]")
	@CacheLookup
	WebElement pfdone;
	
	WebElement pfLocation;

	//step 2 : Setters
	public void setPfsearch(String item) { // item = "burger"
		pfsearch.click();
		pfsearchtype.sendKeys(item);
	}
	
	//getters
	public WebElement getPflocation() {
		return pfLocation;
	}

	//initialization
	public SearchPageFactory(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
