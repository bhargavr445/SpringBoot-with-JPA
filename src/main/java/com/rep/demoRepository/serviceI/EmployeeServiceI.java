package com.rep.demoRepository.serviceI;

import java.util.List;

import com.rep.demoRepository.entity.Employee;

public interface EmployeeServiceI {

	Employee getEmpById(int id);

	List<Employee> getAllEmp();

	Employee insertData(Employee emp);
}
