package testLisner;

import org.testng.Assert;
import org.testng.annotations.Test;


public class runner1 {
@Test
public void test1() {
	System.out.println("test case passed tc1");
}
@Test
public void test2() {
	System.out.println("test case Skipped tc2");
	Assert.fail();
}
@Test(dependsOnMethods = "test2")
public void test3() {
	System.out.println("test case Skipped tc3");
}
}
