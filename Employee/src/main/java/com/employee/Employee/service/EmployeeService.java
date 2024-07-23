package com.employee.Employee.service;

import com.employee.Employee.EmployeeApplication;
import com.employee.Employee.entity.EmployeeEntity;
import com.employee.Employee.repositories.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

   final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeEntity getUserbyId(Integer id) {
        EmployeeEntity employeeEntity = employeeRepo.findById(id).orElseThrow(()->new RuntimeException());
        return employeeEntity;
    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity){

        EmployeeEntity employeeEntity1 = new EmployeeEntity();
        employeeEntity1.setName(employeeEntity.getName());
        employeeEntity1.setIsActive(employeeEntity.getIsActive());

        employeeRepo.save(employeeEntity1);

        return employeeEntity1;
    }

    public List<EmployeeEntity> getAllEmployee(){
        List<EmployeeEntity> employeeEntity = employeeRepo.findAll();

        return employeeEntity;
    }

    // delete by id. . . .
    public EmployeeEntity delete(Integer id){
        EmployeeEntity employeeEntity = employeeRepo.findById(id).orElseThrow(()-> new RuntimeException());
           employeeRepo.delete(employeeEntity);
           return employeeEntity;

    }
}
