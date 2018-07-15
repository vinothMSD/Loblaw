package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opwnwebpagewithmethod {
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		launchWebdriver();
		loginToapplication();
		createLead();
		
	}
	public static void launchWebdriver() {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();

	 driver= new ChromeDriver();
	//Launch Webpage
	}
	public static void loginToapplication() {
		// driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");

	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
	}
	public static void createLead() {
		//ChromeDriver driver= new ChromeDriver();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
	driver.findElementById("createLeadForm_firstName").sendKeys("Vinoth");
	driver.findElementById("createLeadForm_lastName").sendKeys("Subramani");
	driver.findElementByName("submitButton").click();
	driver.findElementById("reassignToForm_newPartyId").sendKeys("SABARI");
	driver.findElementByName("submitButton").click();
	}
}