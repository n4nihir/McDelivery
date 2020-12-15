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

public class UserLocationPageFactory {

	WebDriver driver;
	
	File src = new File("C:\\Users\\Dell\\git\\repository\\McDelivery\\PageFactory.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet cartSheet = wb.getSheetAt(0);
	
	//step 1 : identify elements
	@FindBy(name="//app-header/div[2]/div[1]/div[3]/app-nudge[1]/div[1]/div[3]/button[2]")
	@CacheLookup
	WebElement pflocation;
	
	@FindBy(name="//body/app-root[1]/div[1]/div[1]/app-set-location[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]")
	@CacheLookup
	WebElement pfselectlocation;
	
	@FindBy(name="//button[contains(text(),'Done')]")
	@CacheLookup
	WebElement pfdone;
	
	@FindBy(name="//app-header/div[2]/div[1]/div[3]/div[1]")
	@CacheLookup
	WebElement pfnavbar;

	//step 2 : Setters
	public void setPflocation(String location) { // location = "mumbai"
		pflocation.sendKeys(location);
		pfselectlocation.click();
		pfdone.click();
	}
	
	//getters
	public WebElement getPflocation() {
		return pfnavbar;
	}
	
	//initialization
	public UserLocationPageFactory(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
