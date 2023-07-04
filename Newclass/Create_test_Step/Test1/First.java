package Test1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

import GenericALL.genericWebDriverInterface;

public class First implements genericWebDriverInterface {
	@Test
 public void Test1() {
	System.setProperty(key, value);
	ChromeOptions co=new ChromeOptions();
	//co.addExtensions("./Resources/browser extension/extension_1_6_0_0.crx");//crx
	co.addExtensions(new File("/E:/selenium teststudio tool/extension_1_6_0_0.crx"));
	WebDriver driver=new ChromeDriver();
	
	driver.get("chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html");
	//driver.manage().window().newWidow(WindowType.)
	//driver.manage().window().maximize();
	//driver.get("https://demoqa.com/automation-practice-form");
 }
}
