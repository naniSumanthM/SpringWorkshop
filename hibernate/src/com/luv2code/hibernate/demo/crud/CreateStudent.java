package com.luv2code.hibernate.demo.crud;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.concurrent.ExecutionException;

public class CreateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Student student = new Student("Sumanth", "Maddirala", "maddirsh@mail.uc.edu");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			factory.close();
		}

	}

}
