package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///demo1","root","12345");
			Statement st= con.createStatement();
			{
				String query="insert into users values(5,'komal','karvenager')";
				int count=st.executeUpdate(query);
			
				if(count>0)
				{
					System.out.println("inserted");
				}
			else {
			System.out.println("values are not inserted");
			}
				con.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
