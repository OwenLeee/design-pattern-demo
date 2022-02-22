package com.designpattern.bridge;

public class MongoDB implements Database {

	@Override
	public <T> T getById(int id) {
		System.out.println("MongoDBget data with id: " + id);
		return null;
	}

	@Override
	public <T> boolean save(T data) {
		// TODO Auto-generated method stub
		System.out.println("MongoDBsaved: " + data);
		return false;
	}

	@Override
	public <T> boolean updateById(T data) {
		// TODO Auto-generated method stub
		System.out.println("MongoDBupdated: " + data);
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		System.out.println("MongoDBdeleted data id: " + id);
		return false;
	}

}
