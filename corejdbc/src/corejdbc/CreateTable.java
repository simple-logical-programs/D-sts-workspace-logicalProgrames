


package corejdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc Connection/Table creation");
		Connection con=null;
		//jdbc:mysql://localhost:3306/Peoples?verifyServerCertificate=false&useSSL=true
		String url="jdbc:mysql://localhost:3307/";
		String dbName="akshata";
		String driverName="com.mysql.jdbc.Driver";
		//String driverName="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="";
		
		try {
			Class.forName(driverName).newInstance();
			con=DriverManager.getConnection(url+dbName,username,password);
			try {
				Statement st=con.createStatement();
				String table="CREATE TABLE coustmer(coustmerCode int,coustmerName varchar(10))";
				st.executeUpdate(table);
				System.out.println("Table creation process sucessfuly");
				
				
				
				
			}
			catch(SQLException s) {
				System.out.println("Table all ready exist");
			}

			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
