package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.directline.com/"); 
		   driver.manage().window().maximize();
		   driver.findElementByXPath("(//a[text()='Quote'])[2]").click();
		   Set<String> l1 = driver.getWindowHandles();
		   List<String> l2= new ArrayList(l1);
		   l2.addAll(l1);
		   driver.switchTo().window(l2.get(1));
		   System.out.println(driver.getTitle());
		   driver.findElementByXPath("//input[@id='postCode']").sendKeys("WC2N 5DU");
		   driver.findElementByXPath("//button[@id='addressLookUp']").click();
	}
}
