package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUIMouseOver {


		public static void main(String[] args) throws InterruptedException {	
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
			ChromeDriver driver1 = new ChromeDriver();
			driver1.get("https://www.flipkart.com/");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver1.getKeyboard().sendKeys(Keys.ESCAPE);
			WebElement electronics = driver1.findElementByXPath("//span[text()='Electronics']");
			WebElement oppo = driver1.findElementByXPath("//span[text()='OPPO']");
			Actions builder = new Actions(driver1);
			builder.moveToElement(electronics).perform();
			Thread.sleep(2000);
			builder.click(oppo).perform();
			Thread.sleep(10000);
		
		WebElement TV = driver1.findElementByXPath("//span[text()='TVs & Appliances']");
		
		builder.moveToElement(TV).perform();
		Thread.sleep(2000);
		WebElement LG = driver1.findElementByXPath("//span[text()='LG']");
		Thread.sleep(2000);
		builder.click(LG).perform();
		
		
	}

}
