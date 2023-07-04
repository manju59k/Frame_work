package MerchantCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Webdriverinterface.genericWebDriverInterface;

public class CreateMerchant implements genericWebDriverInterface {
@Test
public void Create() {
	System.setProperty(key,value);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("https://shoppersstack.com/user-signin");
	pomCreateMerchant p=new pomCreateMerchant(driver);
	p.SelectMerchant();
	p.createAcc();
	p.sendAdminMAilid("mjk@gmail.com");
	p.vaildAdmin();
	
}
}
