package Signup;

import org.testng.annotations.Test;

import GenericALL.Generic_multiple_data;
import GenericALL.UpdateProperty;

public class TestWrite extends UpdateProperty {
	String [] aar= {"Female","sagari","Individual","India","8974456321","sagari@gmail.com","sagari","sagari"};
	@Test
	public void test1() {
		Generic_multiple_data.Write_excel("Sheet3", aar);
		
		
		int j=0;
	 Generic_multiple_data.Write_excel("Sheet3", aar);
	 updateprop("gender", aar[j]);
	 updateprop("name", aar[++j]);
	 updateprop("type", aar[++j]);
	 updateprop("country", aar[++j]);
	 updateprop("phonenumber", aar[++j]);
	 updateprop("email", aar[++j]);
	 updateprop("password", aar[++j]);

	/* age=20
			 baseURL=amazon
			 country=China
			 email=vinay@gmail.com
			 gender=Male
			 name=vinay.K
			 password=vin1234
			 phonenumber=8216476699
			 type=Individual
	 *
	 //Create_data_excel.WriteData("Sheet3", 18, 3, "manju");
	    //String sr=ReadingData.GetData("Sheet3", 18, 3);
	   */
	  }

}
