package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Course;
import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			//create objects
			Instructor instructor = new Instructor("Mike", "Bowling", "bowling@mail.uc.edu");
			InstructorDetail instructorDetail = new InstructorDetail("Kumar Exclusive", "Coding");
			
			//associate objects
			instructor.setInstructorDetail(instructorDetail);
			
			System.out.println("Saving Instructor: " + instructor);
			session.beginTransaction();
			
			//save instructor - This will save Details since Cascade.Type = ALL
			session.save(instructor);
			
			session.getTransaction().commit();
		}finally{
			session.close();
			factory.close();
		}

	}

}
