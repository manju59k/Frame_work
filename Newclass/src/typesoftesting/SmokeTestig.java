package typesoftesting;

import org.testng.annotations.Test;
@Test(groups="all")
public class SmokeTestig {
@Test(priority=1)
public void Smoke() {
	System.out.println("");
	System.out.println("testing the basic critical functionlities of an application is called");
}
}
