package GenericALL;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Genricaction {
	
 public static void Enterkey(int n){
	 for(int i=0;i<n;i++)
	 {
	    try {
	    	Robot r=new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);
	 		r.keyRelease(KeyEvent.VK_ENTER);
		} 
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	 }
	}
 public static void DownKEy(int n)
 {
	 for(int i=0;i<n;i++)
	 {
		    try {
			 Robot r=new Robot();
			 r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
		        }
		    catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	 }
		 
    }
    }
 
}