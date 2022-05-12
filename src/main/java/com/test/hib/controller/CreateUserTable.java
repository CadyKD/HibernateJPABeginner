package com.test.hib.controller;


import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Log
public class CreateUserTable {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		t.commit();
		log.info("successfully created user table");
		factory.close();
		session.close();
	} // end main
} // end class CreateUserTable
