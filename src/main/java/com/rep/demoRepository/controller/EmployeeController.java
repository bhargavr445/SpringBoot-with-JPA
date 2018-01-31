package com.rep.demoRepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rep.demoRepository.entity.Employee;
import com.rep.demoRepository.serviceI.EmployeeServiceI;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI employeeServiceI;
	
	@GetMapping("/getEmpById/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return employeeServiceI.getEmpById(id);
		
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() {
		return (List<Employee>) employeeServiceI.getAllEmp();
		
	}
	
	@PostMapping("/insertData")
	public Employee insertData(@RequestBody Employee emp) {
		return employeeServiceI.insertData(emp);
		
	}
	
	
	

}
