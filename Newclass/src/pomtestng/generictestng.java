package pomtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Webdriverinterface.genericWebDriverInterface;

public class generictestng implements genericWebDriverInterface {
	
	public WebDriver driver;
@BeforeMethod
public void Initialaisation() {
	System.setProperty(key, value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
}
@AfterMethod
public void closing() {
	driver.close();
}

}
