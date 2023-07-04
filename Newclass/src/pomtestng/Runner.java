package pomtestng;



import org.testng.annotations.Test;

public class Runner extends generictestng {
	@Test
	public void test1() 
	{
		driver.get("https://www.amazon.in/");
		pom1 p1=new pom1(driver);
		p1.Sendto("IPHONE 13");
		TakeScreenshot.getphoto(driver);
		p1.serchClick();
	}
}
