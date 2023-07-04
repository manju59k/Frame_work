package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Webdriverinterface.genericWebDriverInterface;

public class Testcase1 implements genericWebDriverInterface {
	@Test
	public void gettst() throws AWTException {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.87.42:9003/");
		driver.findElement(By.xpath("//a[.='Signup']")).click();
		/*WebElement ele=driver.findElement(By.id("select2-gender-container"));
		ele.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		WebElement ele = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		ele.sendKeys("Hungary");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    
}
}
