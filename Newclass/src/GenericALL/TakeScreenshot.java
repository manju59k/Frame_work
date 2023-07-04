package GenericALL;

import java.io.File;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	    public static void getphoto(WebDriver driver) {
		String Photo="./Resources/Screenshot/";
		Date d=new Date();
		String d1=d.toString();
		String d2= d1.replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		try {
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(Photo+d2+".jpeg");
		FileHandler.copy(src,dst);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
}
}