package ReportsUsingExtentReports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext_Reports {
	@Test
	public void test1() {
	ExtentReports rep= new ExtentReports("./Resources/reports/r.html",false);
	ExtentTest t1 = rep.startTest("tc1");
t1.log(LogStatus.PASS, "Passed TC");
//t1.log(LogStatus.FAIL, "Passed TC");
t1.log(LogStatus.SKIP, "Passed TC");
rep.endTest(t1);
rep.flush();
	}
}