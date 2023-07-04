package newpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase {
@BeforeMethod
public void before() {
	Reporter.log("hi");
	System.out.println("hi");
}


@AfterMethod
public void after() {
	Reporter.log("Bye");
	System.out.println("Bye");
}
}
