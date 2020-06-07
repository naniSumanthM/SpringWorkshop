package com.luv2code.hibernate.demo.crud;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Student student = new Student("Buggs", "Bunny", "bunny@mail.uc.edu");
			session.beginTransaction();
			session.save(student);
			Student s = session.get(Student.class, student.getId());
			System.out.println(s);
			session.getTransaction().commit();
		}finally{
			factory.close();
		}

	}

}
