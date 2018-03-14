package com.learning.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.autoconfiguration.dao.UserDAO;

@SpringBootApplication
public class AutoconfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AutoconfigurationApplication.class, args);
		
		UserDAO userDAO = applicationContext.getBean(UserDAO.class);
		
		System.out.println(userDAO.getAllUserNames());
		
		
	}
}
