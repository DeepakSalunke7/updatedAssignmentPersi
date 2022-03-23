package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DepartmentService;
import com.example.demo.entity.Department;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	//get list of department
	@GetMapping("/department")
	public List<Department> listOfDepartment(){
		return departmentService.getDepartments();	
	}

	//add department
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);	
	}

	//update department
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}

	//get department by id
	@GetMapping("/department/{deptId}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable long deptId){
		return new ResponseEntity<Department>(departmentService.getDepartmentById(deptId), HttpStatus.OK);
	}

}
