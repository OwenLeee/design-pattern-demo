package com.designpattern.bridge;

public class PostgreDB implements Database {

	@Override
	public <T> T getById(int id) {
		System.out.println("PostgreDB get data with id: " + id);
		return null;
	}

	@Override
	public <T> boolean save(T data) {
		// TODO Auto-generated method stub
		System.out.println("PostgreDB saved: " + data);
		return false;
	}

	@Override
	public <T> boolean updateById(T data) {
		// TODO Auto-generated method stub
		System.out.println("PostgreDB updated: " + data);
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		System.out.println("PostgreDB deleted data id: " + id);
		return false;
	}

}
