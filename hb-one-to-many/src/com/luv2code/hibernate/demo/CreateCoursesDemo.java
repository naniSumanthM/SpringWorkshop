package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Course;
import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Instructor instructor = session.get(Instructor.class, 1);
			Course course1 = new Course("Math");
			Course course2 = new Course("Science");
			instructor.addCourse(course1);
			instructor.addCourse(course2);
			session.save(course1);
			session.save(course2);
			session.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			session.close();
			factory.close();
		}
	}

}
