package Login_module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericALL.Genric_for_all;
import GenericALL.ReadingData;
import GenericALL.getProperty1;
import Webdriverinterface.genericWebDriverInterface;

public class Login extends Genric_for_all implements genericWebDriverInterface {
@Test
	public void loginLara() {
	//System.setProperty(key, value);
	//WebDriver driver= new ChromeDriver();
	driver.get("http://106.51.87.42:9003/login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	PomLoginLara p=new PomLoginLara(driver);
	//String Email=ReadingData.GetData("Sheet3", 15,5);
	//String pwd=ReadingData.GetData("Sheet3", 15,6);
	String Email=getProperty1.getprop("email");
	String pwd=getProperty1.getprop("password");
	System.out.println(Email+" "+pwd);
	p.email_id(Email);
	p.psswordfeild(pwd);
    p.LoginBtn();
   
}
}
