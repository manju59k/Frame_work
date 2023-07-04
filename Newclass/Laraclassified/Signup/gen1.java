package Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericALL.genericWebDriverInterface;

public class gen1 implements genericWebDriverInterface {
public WebDriver driver;
@BeforeMethod
 public void gem() {
	System.setProperty(key, value);
    driver=new ChromeDriver();
	driver.get("http://106.51.87.42:9003/signup");
}
@AfterMethod
public void dclose() {

	//driver.close();

}
}
