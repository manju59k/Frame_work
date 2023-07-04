package StudentPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import GenericALL.genericWebDriverInterface;

public class GenericScritptS implements genericWebDriverInterface {
WebDriver driver;
	@BeforeMethod
public void before() {
	System.setProperty(key1, value1);
	driver=new FirefoxDriver();
	
	driver.get("https://demoqa.com/automation-practice-form");
	
}
	//@AfterMethod
	//public void dclose() {
		//driver.close();
	//}
}
