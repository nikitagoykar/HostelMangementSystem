package mysql;
/*package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class insert {

	public static void main(String[] args) {
		// load the driver
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql:///demo", "root", "12345");
				Statement st = con.createStatement();
		{

			String query="INSERT INTO USERS(id,name,email,country) VALUES(1,'nikita','nikita12@gmail.com','India')";
			
			//st.executeUpdate(query);
			int count=st.executeUpdate(query);
			if (count==0)
			{
				System.out.println("record not inserted");
			}
			else 
			{
				System.out.println("record not inserted");
			}
			con.close();
		}
		}

		

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
		}*/
	

