package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

import week2day1.Testleafxpath;

public class Deletelead {
	static Testleafxpath object1=new Testleafxpath();
	static 	ChromeDriver div;
	public static void main(String[] args) throws InterruptedException {

		object1.openChrome();
		object1.loginTestleaf();		
		deleteLead();
	}
	public static void deleteLead() throws InterruptedException {
		
		div.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(4000);
		div.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		div.findElementByXPath("//a[text()='Delete']").click();
	}
}
