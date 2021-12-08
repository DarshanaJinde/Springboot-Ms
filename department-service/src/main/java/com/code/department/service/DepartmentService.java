package com.code.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.department.entity.Department;
import com.code.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDapartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById of DepartmentService");
		return departmentRepository.findById(departmentId).get();
	}
	
}
