package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericALL.ActionandSelectclass;
import GenericALL.ActionandSelectclass.action;
import GenericALL.ActionandSelectclass.slct;
import GenericALL.genericWebDriverInterface;

public class Selecttry implements genericWebDriverInterface {
	static WebDriver driver;
	@Test
	public void selectby()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//By country=By.id("country");
		WebElement ele = driver.findElement(By.id("country"));
		//doSelectvisbletext(country,"India");
		//doSelectvisbletext(ele,"India");
		int j=0;
		//rclick
		ActionandSelectclass.SelectDropdown(ele, slct.visibletxt,"Japan");
		ActionandSelectclass.SelectDropdown(ele, slct.index, "1");
		//ActionandSelectclass.deSelectDropdown(ele, slct.value, "Japan");
		//ActionandSelectclass.mouseAction(ele, driver, action.rclick);
		ActionandSelectclass.mouseAction(ele, driver, action.lclick);
		
	}
   // public static WebElement locate(By locator) {
	//	return driver.findElement(locator) ;
    
   // }
    public static void doSelectvisbletext(WebElement locator, String value) {
    	Select select= new Select(locator);
    	select.selectByValue(value);
    }
}
