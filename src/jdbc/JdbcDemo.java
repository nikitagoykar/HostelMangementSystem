package jdbc;

import java.sql.*;
import java.util.Scanner;

class JdbcDemo {
	public static void main(String args[]) throws SQLException
	{
Scanner sc=new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6974", "root", "12345");
			Statement stmt = con.createStatement();
			System.out.println("Enter Student id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student name");
			String name=sc.nextLine();
			//String query = "create table student4(id int, name varchar(20))";
		//String  query="insert into student2 values(1,'nikita')";
			//String query ="select * from student2";
			//stmt.executeUpdate(query);
			String query="insert into Student4(id,name)values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			int i=pstmt.executeUpdate();
			if(i>0) 
			{
				System.out.println("inserted");
			}
			
			/*int status=stmt.executeUpdate(query);
			if(status>0)
			{
				System.out.println("record is inserted");
			}
			else
			{
				System.out.println("record not inserted");
			}*/
		}

		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
	}
}
