package Properties2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Prop1 {

	@Test	
	public void test() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		//InputStream in = getClass().getResourceAsStream("./Resources/p.properties");
		//String path="./Resources/p.properties";
		// File f = new File(path);
		
		p.load(new FileInputStream("./Resources/p.properties"));
		String u=p.getProperty("baseURL");
		System.out.println(u);
		/* try {
		 final FileInputStream configStream = new FileInputStream(f);
	     p.load(configStream);
		configStream.close();
		p.setProperty("name", "vinay.K");
		p.setProperty("phonenumber","8216476699");
		p.setProperty("age", "20");
		p.setProperty("gender", "Female");
		p.setProperty("type", "Individual");
		p.setProperty("country", "China");
		p.setProperty("email", "vinay@gmail.com");
		p.setProperty("password", "vin1234");
		final FileOutputStream output = new FileOutputStream(f);
        p.store(output, "");
        output.close();
		 } catch (IOException ex) {
		        ex.printStackTrace();
		    }*/
	}
}
