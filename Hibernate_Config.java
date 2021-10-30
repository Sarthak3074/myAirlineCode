package com.booking.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


import com.booking.Entity.AdminEntity;
import com.booking.Entity.Airline;
import com.booking.Entity.Airport;

@Configuration
public class Hibernate_Config {
	
	@Autowired
	DataSource datasource;
	
	@Value("${hibernate.show_sql}")
	private String HIBERNATE_SHOW_SQL;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String AutoUpdate;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		Properties properties=new Properties();
		
		properties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		properties.put("hibernate.hbm2ddl.auto", AutoUpdate);
		
		sessionFactory.setDataSource(this.datasource);
		sessionFactory.setHibernateProperties(properties);
		sessionFactory.setAnnotatedClasses(AdminEntity.class,Airline.class,Airport.class);
		
		return sessionFactory;
	}

}
