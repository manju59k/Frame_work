package Signup;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.testng.annotations.Test;

public class GetData_Excel {
	//static Xls_Reader  reader;
	//static OPCPackage path="./Resources/Excel/Test.xlsx";
@Test
public  void getdata_Excel(String Sheet) {
ArrayList<Object[]> mydata= new ArrayList<Object[]> ();
try {
	
		FileInputStream fls=new FileInputStream("./Resources/Excel/Test.xlsx" );
		Workbook book=WorkbookFactory.create(fls);
		Sheet sheet = book.getSheet("Sheet3");
	for(int r=2 ;r<5;r++)
	{
		Row row = sheet.getRow(r);
		 Cell cell = row.getCell(0);
	     String gender=cell.toString();
	     Cell cell2 = row.getCell(1);
	     String name=cell2.toString();
	     Cell cell3 = row.getCell(2);
	     String type=cell3.toString();
	     Cell cell4 = row.getCell(3);
	     String country=cell4.toString();
	     Cell cell5= row.getCell(4);
	     String phonenumber=cell5.toString();
	     Cell cell6 = row.getCell(5);
	     String email=cell6.toString();
	     Cell cell7= row.getCell(6);
	     String pwd=cell7.toString();
	     Cell cell8 = row.getCell(7);
	     String cnmpwd=cell8.toString();
	     Object [] obj={ gender,name,type,country,phonenumber,email,pwd,cnmpwd };
	     System.out.println(gender);
	     System.out.println(name);
	     System.out.println(type);
	    // mydata.add(obj);	
	}
	}
catch(Exception e) {
e.printStackTrace();
}
System.out.println(mydata);
//return mydata;
   }
}
