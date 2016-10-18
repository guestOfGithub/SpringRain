package com.person.service;


public interface BaseService<T> {
	// 新增
	public  void addObject(T t);
	
	//删除
	public void deleteObject(Long id);
	
	//更新
	public void updateObject(T t);
	
}
