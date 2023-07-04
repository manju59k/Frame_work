package StudentPractice;

import org.testng.annotations.Test;

public class Runner extends GenericScritptS {

	@Test
	public void Runn() {
		driver.manage().window().maximize();
		PomScriptp p1=new PomScriptp(driver);
		p1.fnametxt("MANJU");
		p1.lnameTxt("manju");
		p1.Emailtxtfld("mjk@gmail.com");
		//p1.Selectgender();
		p1.phonum("9874561237");
		p1.subject("maths");
		//p1.hobies("sports", "music", "Reading");
		p1.currtentA("kamakshipalaya bangalore");
		p1.selectStatecity("Uttar Pradesh", "Lucknow");
		p1.submitf();
	}
}
