package com.varun.test.Smartclean.dao;

import java.util.List;

import  com.varun.test.Smartclean.model.Services;

public interface ServiceOperationsDAO {
	
	void createService(Services service);

	Services getGetService(String id);
	
	List<Services> getAllServices();
	
	void clearService();

}