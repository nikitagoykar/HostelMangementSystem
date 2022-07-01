package com.hinernate.com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		System.out.println("----------------------------------------");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// Transaction tx = session.beginTransaction();

		/*String hql = "From Student7";
		Query query = session.createQuery(hql);

		List<Student7> obj = query.list();

		for (Student7 student : obj) {
			System.out.println(student.getStudentId() + "\t" + student.getStudentName() + "\t"
					+ student.getStudentemailId() + "\t" + student.getStudentContact());
		}*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id  which you want to search");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the  name which you want to update");
		String studentName=sc.nextLine();
		Transaction tx = session.beginTransaction();
		
		//String hql = "from Student7 student where student.studentId= :studentId";
		String hql = "update Student7 student set student.studentName=1,where student.studentId=2";
		Query query = session.createQuery(hql);

		query.setParameter("1",studentName);
		query.setParameter("2", id);
		
		query.setParameter(1,id);
		int i=query.executeUpdate();
		if(i>0)
		{
			System.out.println("record updated");
		}
		
		else
		{
			System.out.println("not updated");
		}
		
		tx.commit();
		
		

		//List result = query.list();

		/*
		 * Student7 student = new Student7(); student.setStudentId(2);
		 * student.setStudentName("xyz"); student.setStudentemailId("xyz@gmail.com");
		 * student.setStudentContact("9874563214"); session.saveOrUpdate(student);
		 * tx.commit();
		 */

	}
}
