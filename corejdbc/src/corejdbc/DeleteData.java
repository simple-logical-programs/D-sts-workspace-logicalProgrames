package corejdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteData {

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
					
					String sql="delete from Student where stdCode=6";
					
                      st.executeUpdate(sql);
                      
                      st.close();
					
					System.out.println("Data is Deleted");
					
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