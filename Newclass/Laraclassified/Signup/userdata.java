package Signup;

import java.util.ArrayList;

import GenericALL.ReadingData;

public class userdata {
public static ArrayList<String> Senduserdata(String sheet,int row, int cell) {
	ArrayList<String> user=new ArrayList<String>();
	for(int j=0;j<8;j++) {
	String value=ReadingData.GetData(sheet, row, j);
	user.add(value);

	}
	return user;
}
}
