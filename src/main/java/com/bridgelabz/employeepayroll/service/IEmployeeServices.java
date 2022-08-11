package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;

import java.util.List;

public interface IEmployeeServices {

    List<EmployeeModel> getEmployeeData();
    EmployeeModel getEmployee(int id);
    EmployeeModel addEmployee(EmployeeDTO employeeDTO);
    EmployeeModel updateEmployee(int id ,EmployeeDTO employeeDTO);
    void deleteEmployee(int id);
}
