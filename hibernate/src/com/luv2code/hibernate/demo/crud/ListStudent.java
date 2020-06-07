package com.luv2code.hibernate.demo.crud;

import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ListStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//Return all students
			List<Student> studentList = session.createQuery("from Student").getResultList();
			getStudents(studentList);

			System.out.println("------------------------------------------------");
			//All students whose last name is *
			studentList = session.createQuery("from Student s where s.lastName = 'Maddirala' ").getResultList();
			getStudents(studentList);
			session.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			factory.close();
		}
	}

	private static void getStudents(List<Student> studentList) {
		for(Student s: studentList) {
			System.out.println(s);
		}
	}

}
