package com.learning.autoconfiguration.configs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.autoconfiguration.dao.UserDAO;

@Configuration
@ConditionalOnClass(UserDAO.class)
@EnableConfigurationProperties(UserDAOProperties.class)
public class UserDAOAutoConfig {

	private final UserDAOFactory daoFactory;

	public UserDAOAutoConfig(UserDAOProperties properties) {
		this.daoFactory = new UserDAOFactory(properties);
	}

	@Bean
	@ConditionalOnMissingBean
	public UserDAO userDAO() throws Exception {
		return this.daoFactory.createUserDAO();
	}
}
