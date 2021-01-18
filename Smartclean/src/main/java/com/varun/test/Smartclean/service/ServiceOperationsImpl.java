package com.varun.test.Smartclean.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.varun.test.Smartclean.dao.ServiceOperationsDAO;
import  com.varun.test.Smartclean.model.Services;

public class ServiceOperationsImpl implements ServiceOperations{
	
	@Autowired
	private ServiceOperationsDAO serviceoperationdao;
	
	@Override
	public void createService(Services service) {
		serviceoperationdao.createService(service);
	}
	
	@Override
	public Services getGetService(String id) {
		return serviceoperationdao.getGetService(id);
	}
	@Override
	public List<Services> getAllServices() {
		return serviceoperationdao.getAllServices();
	}

	@Override
	public void clearService() {
		serviceoperationdao.clearService();
	}
}
