package week2day1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class OpenWebpage {

	
	
	public static void main(String[] args) {
		//	Launch webdriver 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//	ChromeDriver driver = new ChromeDriver();

		ChromeDriver driver= new ChromeDriver();
		//Launch Webpage

		driver.get("http://leaftaps.com/opentaps/");

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vinoth");
		driver.findElementById("createLeadForm_lastName").sendKeys("Subramani");
		//driver.findElementByName("submitButton").click();
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
		dd.selectByVisibleText("Public Relations");
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mk=new Select(marketing);
		List<WebElement> opt= mk.getOptions();
		int size=opt.size();
		System.out.println(size);
		mk.selectByIndex(size-2);
		for(WebElement each: opt) {
			System.out.println(each.getText());
		}
			driver.findElementById("createLeadForm_birthDate-button").click();
		List<WebElement> value = driver.findElementsByXPath("//div[@class='calendar']/table//tr");
			
			int num=value.size();
			System.out.println(num);
			
		


	}


}
