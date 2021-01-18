package com.varun.test.Smartclean.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.varun.test.Smartclean.model.Services;
import com.varun.test.Smartclean.service.ServiceOperations;

@Controller
public class ServiceController {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	@Autowired
	private ServiceOperations serviceoperation;

	@GetMapping("/render")
	public String getGetAllServices(Model model) {
		List<Services> list = serviceoperation.getAllServices();
		model.addAttribute("services", list);
		return "services";
	}

	@PostMapping("/create")
	public String createService(Model model) {

		return "createService";
	}

	@GetMapping("/create")
	public String getUniqueIdAfterCreation(Model model) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String time = sdf.format(timestamp);
		String NumericString = "0123456789";
		StringBuilder sb = new StringBuilder(4);
		for (int i = 0; i < 4; i++) {
			int index = (int) (NumericString.length() * Math.random());
			sb.append(NumericString.charAt(index));
		}
		String UniqueID = sb.toString();
		
		String NumericId = "0123456789";
		StringBuilder bs = new StringBuilder(4);
		for (int i = 0; i < 1; i++) {
			int index = (int) NumericId.length();
			bs.append(NumericId.charAt(index));
		}
		String Sl = bs.toString();
		Services serv = new Services(Sl, UniqueID, time);
		serviceoperation.createService(serv);
		model.addAttribute("service", serv);
		return "createService";
	}

	@DeleteMapping("/clear/{id}")
	public String clearService(Model model) {
		return "deletedService";
	}


	@GetMapping("/check/{id}")
	public String getGetService(@PathVariable String id, Model model) {
		Services service = serviceoperation.getGetService(id);
		model.addAttribute("checkedService", service);
		return "checkService";
	}

}
