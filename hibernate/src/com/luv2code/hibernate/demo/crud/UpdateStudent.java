package com.luv2code.hibernate.demo.crud;

import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		try {
			int studentId = 1;
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
//			Student student = session.get(Student.class, studentId);
//			student.setFirstName("Scooby");
			
			session.createQuery("update Student set email='foo@bar.com'").executeUpdate();
			
			session.getTransaction().commit();
		}finally{
			factory.close();
		}

	}
}
