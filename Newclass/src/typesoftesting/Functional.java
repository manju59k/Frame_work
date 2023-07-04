package typesoftesting;

import org.testng.annotations.Test;
@Test(groups="all")
public class Functional {
@Test()
public void overTesting() {
	System.out.println("overtesting waste of time ");
}
@Test
public void underTesting() {
	System.out.println("undertesting we will miss lots of defect");
}
@Test(priority=1)
public void optimaisingtesting() {
	System.out.println("");
	System.out.println("optimaised testing is good testing we test for both positive and negative ");	
}
}
