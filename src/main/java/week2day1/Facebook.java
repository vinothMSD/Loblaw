package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeDriver Face=new ChromeDriver();
	
	Face.get("https://www.facebook.com");
	Face.manage().window().maximize();
	Face.findElementById("email").sendKeys("Vinoth.s183@gmail.com");
	Face.findElementById("pass").sendKeys("082837");
	Face.findElementById("loginbutton").click();
	
	
	}

}
