package com.learning.autoconfiguration.dao;

import java.util.List;

import org.assertj.core.util.Arrays;

public class MongoUserDAO implements UserDAO {

	@Override
	public List<String> getAllUserNames() {
		// TODO Auto-generated method stub
		List list = Arrays.asList(new String[]{"Mongo User 1", "Mongo User 2"});
		return (List<String>) list;
	}

}
