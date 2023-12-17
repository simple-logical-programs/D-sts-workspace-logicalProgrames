package corejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc Connection/Table creation");
		Connection con=null;
		String url="jdbc:mysql://localhost:3307/";
		String dbName="akshata";
		String driverName="com.mysql.jdbc.Driver";

		
		try {
			Class.forName(driverName).newInstance();
			con=DriverManager.getConnection(url+dbName,"root","");
			try {
				Statement st=con.createStatement();
				String selectSQL="SELECT *FROM Student";
				ResultSet res=st.executeQuery(selectSQL);
				
				System.out.println("Data:");
				while(res.next()) {
					int ecode=res.getInt("stdCode");
					String ename=res.getString("stdName");
					
					System.out.println("ID:"+ecode);
					System.out.println("Name:"+ename);
					
				}
				System.out.println("Data is Displayed");
			}catch(SQLException s) {
			System.out.println("SQL Statement is not executed");
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
				

}
}
