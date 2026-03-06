package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employees;

import util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
//	 Configuration config = new Configuration();
//	 config.configure("hibernate.cfg.xml");
//	 config.addAnnotatedClass(Employees.class);
//	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//	 Session session = sessionFactory.openSession();
//	 Employees emp = new Employees(12, "fgh@gmail.com", 29000);
//	 
//	 session.beginTransaction();
//	 session.persist(emp);  //insert
//	 session.getTransaction().commit();
//	 
//	 System.out.println("Data inserted");

		// getData();
		//updateData();
		deleteData();
	}

	public static void getData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employees employees = session.find(Employees.class, 1);
		System.out.println(employees);
	}

	public static void updateData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employees emp = session.find(Employees.class, 1);
		emp.setSalary(100000);

		session.beginTransaction();
		session.merge(emp);
		session.getTransaction().commit();

	}
	
	public static void deleteData() {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Employees emp = new Employees(12,"",0);
	
	session.beginTransaction();
	session.remove(emp);
	session.getTransaction().commit();
	
	}
	}

