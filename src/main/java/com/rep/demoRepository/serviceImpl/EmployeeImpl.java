package com.rep.demoRepository.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rep.demoRepository.DaoI.EmployeeDaoI;
import com.rep.demoRepository.entity.Employee;
import com.rep.demoRepository.serviceI.EmployeeServiceI;

@Service
public class EmployeeImpl implements EmployeeServiceI {

	@Autowired
	EmployeeDaoI employeeDaoI;
	@Override
	public Employee getEmpById(int id) {
		return employeeDaoI.findOne(id);
		
	}
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> emolist= employeeDaoI.findAll();
		return emolist;
	}
	@Override
	public Employee insertData(Employee emp) {
		int inputId=emp.getId();
		Employee employee = employeeDaoI.save(emp);
			
		return employee;
	}
	
//	@Override
//	public int insertData(Employee emp) {
//		Employee empResult = employeeDaoI.save(emp);
//		return 0;
//	}

}
