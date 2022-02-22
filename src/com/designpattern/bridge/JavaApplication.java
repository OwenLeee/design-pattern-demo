package com.designpattern.bridge;

public class JavaApplication {

	private Database database;

	public JavaApplication(Database database) {
		this.database = database;
	}

	public <T> T getDataById(int id) {
		return database.getById(id);
	}

	public boolean saveData(String data) {
		return database.<String>save(data);
	}

	public boolean updateDataById(String data) {
		return database.<String>updateById(data);
	}

	public boolean deleteDataById(int id) {
		return database.deleteById(id);
	}

}
