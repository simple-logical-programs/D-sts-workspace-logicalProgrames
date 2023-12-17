package corejdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;



public class InsertValues {

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
				String inst="INSERT INTO  Student(stdCode ,stdName )VALUES(5,'varun')";
				int val=st.executeUpdate(inst);
				st.close();
				System.out.println("Data is Added");
			}
			catch(SQLException s) {
				System.out.println("SQL Statement is not executed");
			}
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
				
			}
				

	}

}
