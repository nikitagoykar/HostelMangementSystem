package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///demo1","root","12345");
		Statement st=con.createStatement();
		{
			String query ="insert into user values(12,'kiya')";
			int count=st.executeUpdate(query);
			if(count>0)
			{
				System.out.println("inserted");
			}
			else {
				System.out.println("not inserted");
			}
			con.close();
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
		}

	
	}

