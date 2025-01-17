package com.springboot.EMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.EMS.model.Application;
import com.springboot.EMS.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	public List<Application> insertInBatch(List<Application> list) {
		return applicationRepository.saveAll(list);
	}

	public List<Application> getAllApplication() {
		return applicationRepository.findAll();
	}
}
