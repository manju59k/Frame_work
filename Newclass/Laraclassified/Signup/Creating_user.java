package Signup;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericALL.ReadingData;
import GenericALL.genricdriver;


public class Creating_user extends gen1 {
	
	@Test
	public void Create()  {
		//ArrayList<String> args=new ArrayList<String>();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pomCreatingLaraclasified p1=new pomCreatingLaraclasified(driver);
		
		//  args=userdata.Senduserdata("Sheet3", 15, 0);
	//System.out.println(args);
//		int j=0;	
		/*p1.selectGender(args.get(j));
		++j;
		p1.name_user(args.get(j));
		++j;
		p1.SelectAccountType(args.get(j));
		++j;
		p1.selectCountry(args.get(j));
		++j;
		p1.PhN_number(args.get(j));
		++j;
		p1.email(args.get(j));
		++j;
		p1.Password(args.get(j));
		++j;
		p1.CnfrmPassword(args.get(j));
		p1.ClickonTerms();
		p1.RegisterBtn();
		*/
		//p1.send(args.get(j), args.get(++j), args.get(++j), args.get(++j), args.get(++j), args.get(++j), args.get(++j), args.get(++j));
	      p1.send(getProperty1.getprop("gender"), 
			getProperty1.getprop("name"), 
			getProperty1.getprop("type"), 
			getProperty1.getprop("country"), 
			getProperty1.getprop("phonenumber"), 
			getProperty1.getprop("email"), 
			getProperty1.getprop("password"), 
			getProperty1.getprop("password"));
				} 

}
