package demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_First {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manju", "root", "2948");
    Statement statment = con.createStatement();
     ResultSet res = statment.executeQuery("select * from Data");
   while(res.next()){
	String un=res.getString(1);
	String pwd=res.getString(2);
	System.out.println(un);
	System.out.println(pwd);
   }
	}

}
