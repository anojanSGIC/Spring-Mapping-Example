package com.sgic.employee.service;

public class EmployeeDto {
	private Long id;
	private String firstName;
	private String lastName; 
	private EmployeeDetailDto employeeDetail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public EmployeeDetailDto getEmployeeDetail() {
		return employeeDetail;
	}
	public void setEmployeeDetail(EmployeeDetailDto employeeDetail) {
		this.employeeDetail = employeeDetail;
	}
	
	
}
