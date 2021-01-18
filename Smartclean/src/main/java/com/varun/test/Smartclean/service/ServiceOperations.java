package com.varun.test.Smartclean.service;

import java.util.List;

import  com.varun.test.Smartclean.model.Services;

public interface ServiceOperations {
	
	void createService(Services service);

	Services getGetService(String id);
	
	List<Services> getAllServices();
	
	void clearService();

}