package com.nagarro.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzuresqlApplication {

	@Autowired
	private EmployeeRespository employeeRespository;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRespository.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRespository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}
	
}
