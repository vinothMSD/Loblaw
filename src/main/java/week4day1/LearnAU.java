package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAU {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://jqueryui.com/droppable/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.switchTo().frame(0);
		//WebElement draggable = driver1.findElementById("draggable");
		//WebElement droppable = driver1.findElementById("droppable");
		
		WebElement draggable = driver1.findElementByXPath("//div[@id='draggable']");
		WebElement droppable = driver1.findElementByXPath("//div[@id='droppable']");
		
		
		Actions a =new Actions (driver1);
		a.dragAndDrop(draggable,droppable ).perform();
			
	}

}
