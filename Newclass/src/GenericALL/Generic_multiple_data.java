package GenericALL;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_multiple_data extends Create_data_excel {

public static void Write_excel(String sh ,String args[]) {
	try {	
	FileInputStream fls=new FileInputStream("./Resources/Excel/Test.xlsx" );
	//FileInputStream fls=new FileInputStream("./Excel/Test.xlsx" );
	Workbook book=WorkbookFactory.create(fls);
	    Sheet sh1 = book.getSheet(sh);
	   int r =createData.getEmptyrow(sh);
       Row row=sh1.createRow(r);
       for(int i=0;i<args.length;i++)
       {
    	   Cell c=row.createCell(i);
    	   c.setCellValue(args[i]);
    	   System.out.println(args[i]);
       }
       
   	FileOutputStream fos=new FileOutputStream("./Resources/Excel/Test.xlsx");
   	book.write(fos);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
