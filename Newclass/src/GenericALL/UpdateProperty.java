package GenericALL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UpdateProperty {

	
	public static void Updateuserdataall(String name,String Phnnumber,String age,String gender,
			String type,String country,String email,String password) {

		   Properties p=new Properties();
		   String path="./Resources/p.properties";
		   File f = new File(path);
		 try {
			 final FileInputStream configStream = new FileInputStream(f);
		     p.load(configStream);
			configStream.close();
			p.setProperty("name", name);
			p.setProperty("phonenumber",Phnnumber);
			p.setProperty("age", age);
			p.setProperty("gender", gender);
			p.setProperty("type", type);
			p.setProperty("country", country);
			p.setProperty("email", email);
			p.setProperty("password", password);
			final FileOutputStream output = new FileOutputStream(f);
	        p.store(output, "");
	        output.close();
			 } 
		 catch (IOException ex) {
			 ex.printStackTrace();
			 }
	}
	public static void updateprop(String key,String value) {
		 Properties p=new Properties();
		   String path="./Resources/p.properties";
		   File f = new File(path);
		 try {
			 final FileInputStream configStream = new FileInputStream(f);
		     p.load(configStream);
			configStream.close();
			p.setProperty(key, value);
			final FileOutputStream output = new FileOutputStream(f);
	        p.store(output, "");
	        output.close();
			 } 
		 catch (IOException ex) {
			 ex.printStackTrace();
			 }
	}
}
