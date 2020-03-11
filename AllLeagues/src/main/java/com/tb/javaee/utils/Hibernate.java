package com.tb.javaee.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.trainingbasket.javaee.modal.Player;

public class Hibernate {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory(){
		
		if(sessionFactory==null)
		{
			
			try {
			Configuration configuration=new Configuration();
			Properties properties=new Properties();
			properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			properties.put(Environment.URL,"jdbc:mysql://localhost:3306/league?useSSL=false");
			properties.put(Environment.USER,"root");
			properties.put(Environment.PASS,"raman");
			
			properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
			properties.put(Environment.SHOW_SQL,"true");
			properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			properties.put(Environment.HBM2DDL_AUTO,"create");
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Player.class);
			ServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			System.out.println("Hibernate Connection Is Created");
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Not working");
			
		}
		
		return sessionFactory;
		
		
		
		
		
	}

}
