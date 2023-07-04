package Parallel_Genreral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GenericALL.genricdriver;


public class Chrome_Firefox extends genricdriver {
	WebDriver driver;
	@Parameters({"browser"})
@Test
public void paralle(String browser) {
	
	
	if(browser.equals("firefox"))
		{
		driver= new FirefoxDriver();
	 driver.get("https://www.google.co.in/");
		}
	else {
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
}
}
