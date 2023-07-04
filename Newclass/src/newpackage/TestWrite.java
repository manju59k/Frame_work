package newpackage;

import org.testng.annotations.Test;

import GenericALL.Generic_multiple_data;

public class TestWrite {
	String [] aar= {"Female","sagari","Individual","India","8974456321","sagari@gmail.com","sagari","sagari"};
	@Test
	public void test1() {
	 Generic_multiple_data.Write_excel("Sheet3", aar);
	
	 //Create_data_excel.WriteData("Sheet3", 18, 3, "manju");
	    //String sr=ReadingData.GetData("Sheet3", 18, 3);
	   
	  }

}
