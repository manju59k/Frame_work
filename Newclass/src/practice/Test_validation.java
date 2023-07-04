package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericALL.Genric_for_all;

public class Test_validation extends Genric_for_all {
@Test
public void validate() {
	driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Pompractice p1=new Pompractice(driver);
    //By indusstry=By.id("country");
	/*p1.fname("manju");
	p1.lname("Krishnappa manju");
	p1.age("28");
	p1.Countrys("India");
	p1.Notes1("Students notes");
	p1.Submit();
*/
	p1.filldata("manju", "Krishnappa manju","28" ,"India", "Students notes", driver);
}
}