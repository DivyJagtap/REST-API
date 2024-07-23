package com.employee.Employee;

import com.employee.Employee.entity.EmployeeEntity;
import com.employee.Employee.repositories.EmployeeRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	@Autowired
	private EmployeeRepo employeeRepo;

//@PostConstruct
//public void create(){
//
//	EmployeeEntity employeeEntity= new EmployeeEntity();
//	employeeEntity.setId(1);
//	employeeEntity.setName("Patel");
//	employeeEntity.setIsActive("yes");
//
//	employeeRepo.save(employeeEntity);
//}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}

