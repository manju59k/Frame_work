package log4j4;



import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class CreatReport {
	@Test
	public void test1() throws IOException {
		Layout lay=new PatternLayout("%d %c %m %n");
		Appender app= new FileAppender(lay,"./Resources/reports/l1.log");
		BasicConfigurator.configure(app);
		Logger.getLogger(this.getClass().getName());
		Logger log=Logger.getLogger(this.getClass().getName());
		log.fatal("fatal");
		log.info("info");
	
	}

}
