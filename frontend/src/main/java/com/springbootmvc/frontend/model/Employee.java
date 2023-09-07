package com.springbootmvc.frontend.model;


public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private int employeeAge;
	private double employeeSalary;
	
	public Employee() {
		System.out.println("Employee class instainted.");
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeAge=" + employeeAge + ", employeeSalary=" + employeeSalary + "]";
	}

	public Employee(int employeeId, String employeeName, String employeeDepartment, int employeeAge,
			double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}
	
//	@Column(unique = true)
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	

}
