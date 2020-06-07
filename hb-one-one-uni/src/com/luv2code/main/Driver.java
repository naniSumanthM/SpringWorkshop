package com.luv2code.main;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		try {
			Connection connection = (Connection) DriverManager.getConnection(factory.getProperties().get("connection.url").toString(), factory.getProperties().get("connection.username").toString(), factory.getProperties().get("connection.password").toString());
			System.out.println("Connected");
		}catch(Exception exe) {
			exe.printStackTrace();
		}finally{
			factory.close();
		}

	}
}
