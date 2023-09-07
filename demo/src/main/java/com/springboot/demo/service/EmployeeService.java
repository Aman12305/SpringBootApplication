package com.springboot.demo.service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.exceptions.EmployeeNotFoundException;
import com.springboot.demo.model.Employee;
import com.springboot.demo.repository.EmployeeRepository;

@Service 
public class EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id){
		Optional<Employee> op = employeeRepository.findById(id);
		
		if(op.isPresent()) {
			return op.get();
		}else
			throw new EmployeeNotFoundException("No Employee found with Id:"+id);
	}
	

	public Employee modifyEmployee(int id,Employee employee) {
		
		if(employeeRepository.existsById(id)) {
			return employeeRepository.save(employee);
		}else {
			throw new EmployeeNotFoundException("No Employee found with Id:"+id);
		}
	
	}
	

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public String deleteEmployeeById(int id) {

		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			return "Employee with employeeId: " + id + " get deleted successfully.";
		}else {
			throw new EmployeeNotFoundException("No Employee found with Id:"+id);
		}
	}
	
	
	
}
//
//@Service
//public class EmployeeService {
//	
//	@Autowired
//	EmployeeRepository employeeRepository;
//	
//	public List<Employee> getAllEmployees(){
//		return employeeRepository.getAllEmployees();
//	}
//
//	public Employee getEmployeeById(int id){
//		return employeeRepository.getEmployeeById(id);
//	}
//	
//
//	public Employee modifyEmployee(Employee employee) {
//		return employeeRepository.modifyEmployee(employee);
//	}
//	
//
//	public Employee createEmployee(Employee employee) {
//		return employeeRepository.createEmployee(employee);
//	}
//	
//
//	public String deleteEmployeeById(int id) {
////		return "Delete";
//		return employeeRepository.deleteEmployeeById(id);
//	}
//	
//
//}
