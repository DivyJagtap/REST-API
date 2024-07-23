package com.employee.Employee.controller;

import com.employee.Employee.entity.EmployeeEntity;
import com.employee.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployee(@PathVariable Integer id){ // id se get kr rhe the
        return employeeService.getUserbyId(id);
    }

    @PostMapping("/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeEntity);

    }

    @GetMapping("/all")
    public List<EmployeeEntity> getAll(){

        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/delete/{id}")
    public EmployeeEntity delete(@PathVariable Integer id){
        return employeeService.delete(id);
    }

}
