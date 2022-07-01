package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql:///demo", "root", "12345");
			Statement st = con.createStatement();
			{
				//String query = "insert into users values(5,'kitkat','kit1@gamil.com','India)";
				String query = "select id,name,email,country from users";
				
				/*int count = st.executeUpdate(query);
				if (count > 0) {
					System.out.println("record  inserted");
				} else {
					System.out.println("record not inserted");
				}*/
				ResultSet rs= st.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+ "  "+ rs.getString(3)+ "   " + rs.getString(4));
				}
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}