package org.mql.cakes.struts.models.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Manager {
	
	public static final SessionFactory sessionFactory = buildSessionFactory();
	
	 private static SessionFactory buildSessionFactory(){
		  try {
			   Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			   ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					   								.applySettings(configuration.getProperties())
					   								.build();
			   return configuration.buildSessionFactory(serviceRegistry);
		  }catch (Exception e) {
			   System.err.println("Erreur :" +  e);
			   throw new ExceptionInInitializerError(e);
		  }
	 }
	 
	 public static SessionFactory getSessionFactory(){
	  return sessionFactory;
	 }
	 
}
