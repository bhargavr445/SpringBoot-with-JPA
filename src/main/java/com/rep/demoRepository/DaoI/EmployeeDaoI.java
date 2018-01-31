package com.rep.demoRepository.DaoI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rep.demoRepository.entity.Employee;

public interface EmployeeDaoI extends JpaRepository<Employee, Integer>{
	
	

}
