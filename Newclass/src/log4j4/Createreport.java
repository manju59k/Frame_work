package log4j4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Createreport {
	@Test
	public void test2() {
		BasicConfigurator.configure(); 
		Logger log=Logger.getRootLogger();
	log.error("error");
	log.fatal("fatal");
	log.info("info");
	
	}

}
