package com.springboot.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.demo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}

//@Repository
//public class EmployeeRepository {
//	List<Employee> employeeList;
//	private int nextEmployeeId = 1;
//
//	public EmployeeRepository() {
//		employeeList = new ArrayList<Employee>();
//	}
//	
//	public List<Employee> getAllEmployees(){
//		return employeeList;
//	}
//
//	public Employee getEmployeeById(int id){
//		
//		Optional<Employee> op = employeeList.stream().filter(obj->obj.getEmployeeId()==id);
//		
//		
//		return employeeList.stream().filter(obj->obj.getEmployeeId()==id).findAny().get();
//	}
//	
//
//	public Employee modifyEmployee(Employee employee) {
//		int index = -1;
//        for (int i = 0; i < employeeList.size(); i++) {
//            if (employeeList.get(i).getEmployeeId() == employee.getEmployeeId()) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            employeeList.set(index, employee);
//            return employee;
//        } else {
//            return null; // Employee not found
//        }
//	
//	}
//	
//
//	public Employee createEmployee(Employee employee) {
//		employee.setEmployeeId(nextEmployeeId++);
//        employeeList.add(employee);
//        return employee;
//	}
//	
//
//	public String deleteEmployeeById(int id) {
//		boolean removed = employeeList.removeIf(employee -> employee.getEmployeeId() == id);
//	    if (removed) {
//	        return "Employee with ID " + id + " has been successfully removed.";
//	    } else {
//	        return "Employee with ID " + id + " was not found.";
//	    }
//	}
//
//}
