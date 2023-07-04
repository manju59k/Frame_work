package typesoftesting;

import org.testng.annotations.Test;
@Test(groups="all")
public class Integration {
	@Test(priority=1)
public void Integration1() {
		System.out.println("testing the data flow between modules");
	}
	@Test(priority=3)
	public void NonIncrementation() {
		System.out.println("testing the software data flow without adding new module ");
	}
	
	@Test(priority=2)
	public void Incrementation() {
		System.out.println("testing the software data flow of application adding the module ");
	}
	
	
}
