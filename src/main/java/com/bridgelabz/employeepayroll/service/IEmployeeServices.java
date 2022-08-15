package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;

import java.util.List;

public interface IEmployeeServices {

        EmployeeModel addEmployee(EmployeeDTO employeeDTO);
        EmployeeModel updateemployee(int id, EmployeeDTO employeeDTO);
        EmployeeModel deleteemployee(int id);
        List<EmployeeModel> getEmployeeList();
        EmployeeModel getEmployee(int id);

}
