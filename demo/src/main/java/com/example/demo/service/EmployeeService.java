package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();
}
