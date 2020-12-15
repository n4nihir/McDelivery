package CustomizationGrill;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
//import PageBeans.CustomizationGrillPageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCustomizationGrill {

	private WebDriver driver;
	//CustomizationGrillPageFactory objcgpg;
	String address = "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	
	@Given("^User is on items page and adds a customizable item$")
	public void user_is_on_items_page_and_adds_a_customizable_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", address);
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.mcdelivery.co.in/home/trending");
	    File src1 = new File("C:\\Users\\Dell\\git\\repository\\McDelivery\\PageFactory.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis);
		
		XSSFSheet sheet3 = wb1.getSheetAt(3);
		
		
		String item = sheet3.getRow(1).getCell(0).getStringCellValue();
		System.out.println(item);
		
		//String password = sheet1.getRow(1).getCell(1).getStringCellValue();
	    
	}

	@When("^user chooses available customizations$")
	public void user_chooses_available_customizations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^clicks the Add to Cart button$")
	public void clicks_the_Add_to_Cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^item is added to cart with the valid customizations$")
	public void item_is_added_to_cart_with_the_valid_customizations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	/*@Given("^User is on items page and adds a customizable item and chooses the customizations$")
	public void user_is_on_items_page_and_adds_a_customizable_item_and_chooses_the_customizations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user removes the customizations$")
	public void user_removes_the_customizations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	
}
