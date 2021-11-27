package com.sgic.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.employee.entities.Employee;
import com.sgic.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).get();
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setFirstName(employee.getFirstName());
		employeeDto.setLastName(employee.getLastName());
		EmployeeDetailDto detailDto=new EmployeeDetailDto();
		employeeDto.setEmployeeDetail(detailDto);
		return employeeDto;
	}

}
