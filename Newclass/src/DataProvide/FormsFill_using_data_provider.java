package DataProvide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericALL.genericWebDriverInterface;

public class FormsFill_using_data_provider implements genericWebDriverInterface {

	@Test(dataProvider = "test")
	public void fill(String un,String pwd) {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}
	@DataProvider (name="test")
	public Object[][] createData1(){
		return new Object[][] 
				{{"Admin","1234"},{"anni","1426"},{"Admin","1234"}};
		
	
}
}
