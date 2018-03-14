package com.learning.autoconfiguration.configs;

import com.learning.autoconfiguration.dao.JdbcUserDAO;
import com.learning.autoconfiguration.dao.MongoUserDAO;
import com.learning.autoconfiguration.dao.UserDAO;

public class UserDAOFactory {

	private UserDAOProperties properties;

	public UserDAOFactory(UserDAOProperties properties) {
		this.properties = properties;
	}

	public UserDAO createUserDAO() {

		if (properties.getDbtype().equalsIgnoreCase("MYSQL")) {

			return new JdbcUserDAO();
		} else if(properties.getDbtype().equalsIgnoreCase("MONGO")){
			return new MongoUserDAO();
		}else {
			throw new UnsupportedOperationException("UserDAO inteface not implemented");
		}
	}

}
