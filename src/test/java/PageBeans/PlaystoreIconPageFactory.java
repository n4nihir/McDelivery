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

public class PlaystoreIconPageFactory {
	WebDriver driver;
	
	File src = new File("C:\\Users\\Dell\\git\\repository\\McDelivery\\PageFactory.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet cartSheet = wb.getSheetAt(2);
	
	//step 1 : identify elements
	@FindBy(name="//app-header/div[1]/div[1]/div[1]/div[2]/div[1]/img[2]")
	@CacheLookup
	WebElement pfplayStoreIcon;
	
	//step 2 : Setters
	public void setPfplayStoreIcon() {
		pfplayStoreIcon.click();
	}
	
	//getters
	public WebElement getPfplayStoreIcon() {
		return pfplayStoreIcon;
	}
	
	//initialization
	public PlaystoreIconPageFactory(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
