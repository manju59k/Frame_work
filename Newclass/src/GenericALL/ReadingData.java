package GenericALL;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData {

	
	public static String GetData(String sh,int r,int c ) {
		String value=null;
		try {
			FileInputStream fls=new FileInputStream("./Resources/Excel/Test.xlsx" );
			Workbook book=WorkbookFactory.create(fls);
			Sheet sheet = book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
		     value=cell.toString();

		}
		catch(Exception e) {
			System.out.println("eror in the setting value");
		}
			return value;
		
	}
}
