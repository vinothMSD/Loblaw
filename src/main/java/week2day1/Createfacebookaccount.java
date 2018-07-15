package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createfacebookaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver Face=new ChromeDriver();
		
		Face.get("https://www.facebook.com");
		Face.manage().window().maximize();
		Face.findElementByName("firstname").sendKeys("Kassi");
		Face.findElementByName("lastname").sendKeys("vannan");
		Face.findElementByName("reg_email__").sendKeys("7338821183");
		Face.findElementByName("reg_passwd__").sendKeys("Dhoni@183");
		
		Select dd=new Select(Face.findElementById("day"));
		
		dd.selectByValue("13");
Select mm=new Select(Face.findElementById("month"));
		
		mm.selectByValue("6");
Select yy=new Select(Face.findElementById("year"));
		
		yy.selectByValue("1994");
		Face.findElementByXPath("//*[@id=\"u_0_a\"]").click();
		Face.findElementByXPath("(//button[text()='Sign Up'])[1]").click();
		
		
	}

}
