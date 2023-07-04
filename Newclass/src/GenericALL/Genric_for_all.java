package GenericALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genric_for_all implements genericWebDriverInterface {
	protected WebDriver driver;
@BeforeMethod
public void generic() {
	System.setProperty(key, value);
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    
}
    @AfterMethod
    public void closing(ITestResult res) {
    	if(ITestResult.FAILURE==res.getStatus()) {
    		TakeScreenshot.getphoto(driver);
    	}
    	driver.close();
    }

	
	
}
