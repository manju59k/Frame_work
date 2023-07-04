package Automating_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericALL.TakeScreenshot;
import Webdriverinterface.genericWebDriverInterface;

public class GenericLoginFacebook implements genericWebDriverInterface{
	
	public WebDriver driver;
@BeforeMethod
public void Initialaisation() {
	System.setProperty(key, value);
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("https://www.facebook.com/");
}
@AfterMethod
public void closing(ITestResult res) {
	if(ITestResult.FAILURE==res.getStatus()) {
		TakeScreenshot.getphoto(driver);
	}
	driver.close();
}

}