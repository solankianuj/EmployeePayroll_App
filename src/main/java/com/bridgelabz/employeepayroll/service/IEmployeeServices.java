package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;

public interface IEmployeeServices {

    EmployeeModel getEmployeeData(EmployeeDTO employeeDTO);
    EmployeeModel getEmployee(int id);
    EmployeeModel addEmployee(EmployeeDTO employeeDTO);
    EmployeeModel updateEmployee(int id ,EmployeeDTO employeeDTO);
    EmployeeModel deleteEmployee(int id);
}
