package com.test.hib.controller;

import com.test.hib.model.User;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Log
public class FindingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		final int USERID = 2;
		User u = session.get(User.class, USERID);
		log.info("Fullname: " + u.getFullName());
		log.info("Email: " + u.getEmail());
		log.info("password: " + u.getPassword());

		//Close resources
		tx.commit();
		factory.close();
		session.close();
	} // end main
} // end class FindingUser
