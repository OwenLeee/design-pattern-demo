package com.designpattern.bridge;

public interface Database {
	public <T> T getById(int id);

	public <T> boolean save(T data);

	public <T> boolean updateById(T data);

	public boolean deleteById(int id);
}
