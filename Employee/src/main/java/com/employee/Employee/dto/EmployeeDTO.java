package com.employee.Employee.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class EmployeeDTO {
    private int id;
    private String name;
    private Boolean isActive;
}
