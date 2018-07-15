package week2day1;

import org.openqa.selenium.Keys;

//import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Irctcwebpage {

private Object keys;

public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf"); 
   driver.manage().window().maximize();
   driver.findElementByLinkText("Sign up").click();
   driver.findElementById("userRegistrationForm:userName").sendKeys("sabari94");
   driver.findElementById("userRegistrationForm:password").sendKeys("Password@1");
   driver.findElementById("userRegistrationForm:confpasword").sendKeys("Password@1");  
   
 Select dd=new Select(driver.findElementById("userRegistrationForm:securityQ"));
		   
		  dd.selectByValue("2");
		  driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Vijay");
		  driver.findElementById("userRegistrationForm:firstName").sendKeys("sabari");
		  driver.findElementById("userRegistrationForm:gender:0").click();
		  driver.findElementById("userRegistrationForm:maritalStatus").click();
		  
		  
		  Select cc=new Select(driver.findElementById("userRegistrationForm:dobDay"));
		  cc.selectByValue("07");
		  Select aa=new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		  aa.selectByValue("07");
		  Select bb=new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		  bb.selectByValue("1997");
		  Select kk=new Select(driver.findElementById("userRegistrationForm:occupation"));
		  List<WebElement> opt= kk.getOptions();
		  int size= opt.size();
		  System.out.println(size);
		  kk.selectByIndex(1);
		  Select csk=new Select(driver.findElementById("userRegistrationForm:countries"));
		  csk.selectByVisibleText("India");
		  driver.findElementById("userRegistrationForm:email").sendKeys("Vinoth.s183@gmail.com");
		  driver.findElementById("userRegistrationForm:mobile").sendKeys("9500502901");
		  Select rr=new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		  rr.selectByVisibleText("India");
		  driver.findElementById("userRegistrationForm:address").sendKeys("NMPC Romm 38");
		  driver.findElementById("userRegistrationForm:pincode").sendKeys("603103",Keys.TAB);
		  Thread.sleep(4000);
		  Select yy=new Select(driver.findElementById("userRegistrationForm:cityName"));
		  yy.selectByVisibleText("Kanchipuram");
		  Thread.sleep(4000);
		  Select xx=new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		  xx.selectByVisibleText("Navalur B.O");
		  driver.findElementById("userRegistrationForm:landline").sendKeys("7338821183");
		  
	}

}
