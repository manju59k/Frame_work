package GenericALL;

public class createData {
public static void writeDataExcel(String value) {
	//String sh="Sheet1";
	//String sh1="Sheet2";
	String sh2="Sheet3";
	int r=createData.getEmptyrow(sh2);
	Create_data_excel.WriteData(sh2, r, 0, value);
}

public static void writeDataExcel(String sheet,String value) {
	int r=createData.getEmptyrow(sheet);
	Create_data_excel.WriteData(sheet, r, 0, value);
}
public static void writeDataExcel(String sheet,int i,String value) {
	int r=createData.getEmptyrow(sheet);
	Create_data_excel.WriteData(sheet, r, i, value);
}

public static void writeDataExcel(String sheet,String array[]) {
   // int r=createData.getEmptyrow(sheet);
	//String sh=sheet;
    for(int i=0;i<array.length;i++) {
		//createData.writeDataExcel(sheet, array[i]);
		String value=array[i];
		createData.writeDataExcel(sheet,i,value);
	}
}

public static int  getEmptyrow(String sh) {
	
	int cell=0;
	int row=0;
	for(int i=0;i<100;i++) {
		String value1 = ReadingData.GetData(sh, i, cell);
		if(value1==null)
		{
			  row=i;
				break;	
		}
	}
	return row;
}

}
