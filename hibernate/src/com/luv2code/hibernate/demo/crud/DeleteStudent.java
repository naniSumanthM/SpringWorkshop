package com.luv2code.hibernate.demo.crud;

import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
//			Student student = session.get(Student.class, 1);
//			session.delete(student);
			
			session.createQuery("delete from Student where id=3").executeUpdate();
			session.getTransaction().commit();
		}finally{
			factory.close();
		}

	}
}
