package Signup;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Create_data_excel {
	public static void WriteData(String sheet, int row, int cell,String value) {
	
		try {	
	FileInputStream fls=new FileInputStream(".Resources/Excel/Test.xlsx" );
	//FileInputStream fls=new FileInputStream("./Excel/Test.xlsx" );
	Workbook book=WorkbookFactory.create(fls);
	    Sheet sh = book.getSheet(sheet);
		Row r = sh.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
	FileOutputStream fos=new FileOutputStream(".Resources/Excel/Test.xlsx");
	book.write(fos);	
}
	catch(Exception e) {
		
	}	
	}
	
}