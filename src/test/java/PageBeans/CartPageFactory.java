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

public class CartPageFactory {

	WebDriver driver;
	
	File src = new File("C:\\Users\\Dell\\git\\repository\\McDelivery\\PageFactory.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet cartSheet = wb.getSheetAt(4);
	
	
	//identify elements
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/app-home-page[1]/div[1]/div[4]/app-menu-popup[1]/div[1]/div[1]/div[1]/div[2]/app-menu-items[1]/div[1]/app-menu-item[10]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement pfAddHotChocolate;
	
	@FindBy(xpath="//button[contains(text(),'View Cart')]")
	@CacheLookup
	WebElement pfViewCart;
	
	@FindBy(xpath="//button[contains(text(),'+')]")
	@CacheLookup
	WebElement pfAddQuantity;
	
	@FindBy(xpath="//button[contains(text(),'-')]")
	@CacheLookup
	WebElement pfRemoveQuantity;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/app-cart-page[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement pfItemQuantity;
	
	
	
	public void setPfAddHotChocolate() {
		pfAddHotChocolate.click();
	}



	public void setPfViewCart() {
		pfViewCart.click();
	}



	public void setPfAddQuantity() {
		pfAddQuantity.click();
	}



	public void setPfRemoveQuantity() {
		pfRemoveQuantity.click();
	}



	public WebElement getPfItemQuantity() {
		return pfItemQuantity;
	}



	//initialization
	public CartPageFactory(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
