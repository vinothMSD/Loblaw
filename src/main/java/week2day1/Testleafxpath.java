package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testleafxpath {
	public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {

		openChrome();

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//ChromeDriver driver=new ChromeDriver();
		loginTestleaf();


	//	editLead();


	}
	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver=new ChromeDriver();

	}
	public static void loginTestleaf() {


		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id=\"username\"]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id=\"password\"]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class=\"decorativeSubmit\"]").click();
		driver.findElementByXPath("(//div[@id='label'])[1]").click();
	}
//	public static void editLead() throws InterruptedException {
//		driver.findElementByXPath("//a[text()='Leads']").click();
//		driver.findElementByXPath("//a[text()='Find Leads']").click();
//		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("prabhakaran");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(4000);
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//
//		String SS= driver.getTitle();
//		System.out.println(SS);
//		if(SS.contains("View Lead")){
//			System.out.println("Verified the title");
//		} 
//		else {
//			System.out.println("Wrong title");
//		}
//		  driver.findElementByXPath("//a[text()='Edit']").click();
//		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
//		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Delta");
//		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
//
//		String DD= driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
//		System.out.println(DD);
//		if(DD.contains("Delta")) {
//			System.out.println("Yes");
//		}
//
//		else{
//			System.out.println("No");
	//	}



//}


}




