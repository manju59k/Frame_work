package Automating_login;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Runner2 extends GenericLoginFacebook {
@Test(dataProvider="testData")
public void test12( String un,String pwd) {
	Pom2 p1=new Pom2(driver);
  String emailid=ReadingData.GetData("Sheet2", 0, 0);
	String pwdid=ReadingData.GetData("Sheet2", 1, 0);
	p1.sendemail(emailid);
	p1.sendpwd(pwdid);

	p1.validate();
	Assert.fail();
}
@DataProvider (name="testData")
public Object[][] createData1(){
	return new Object[][] {
		{"Admin","1234"},
		{"anni","1426"},
		};
	

}

}