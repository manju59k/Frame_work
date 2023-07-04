package Login_module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getProperty1 {
 public static String getprop(String key) {
	 Properties p=new Properties();
	 try {
		p.load(new FileInputStream("./Resources/p.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String u=p.getProperty(key);
		 return u;
 }

}
