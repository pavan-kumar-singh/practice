package com.pavanks.studentbike.studentbike;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// one to one project
	public class App
	{
	public static void main(String[] args) throws HibernateException
		{
//			creating objects
		
		bike b = new bike (111,"honda");
		bike b1 = new bike (112,"tvs");
		bike b2 = new bike (113,"hero");
		
		student t = new student (111, "nishith",b);
		student t1 = new student (112, "maneesh",b1);
		student t2 = new student (113, "pavan",b2);
		
//		hibernate code
			Configuration cfg=new Configuration();  // creating object of configuration class
			cfg.configure(); // calling configuration
			SessionFactory factory=cfg.buildSessionFactory(); // building session factory
			Session sess=factory.openSession(); //opening session factory
			Transaction tx=(Transaction) sess.beginTransaction();
			sess.save(t);
			sess.save(t1);
			sess.save(t2);
			sess.save(b);
			sess.save(b1);
			sess.save(b2);
			
			tx.commit();
			
		}
	}
