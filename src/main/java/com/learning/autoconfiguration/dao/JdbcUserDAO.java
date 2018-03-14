package com.learning.autoconfiguration.dao;

import java.util.List;

import org.assertj.core.util.Arrays;

public class JdbcUserDAO implements UserDAO{

	@Override
	public List<String> getAllUserNames() {
		
		List list = Arrays.asList(new String[]{"MYSQL User 1", "MYSQL User 2"});
		return (List<String>) list;
	}

}
