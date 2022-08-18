package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import com.bridgelabz.employeepayroll.util.Response;

import java.util.List;

public interface IEmployeeServices {

        EmployeeModel addEmployee(EmployeeDTO employeeDTO);
        EmployeeModel updateemployee(String token, EmployeeDTO employeeDTO);
        EmployeeModel deleteemployee(String token);
        List<EmployeeModel> getEmployeeList();
        EmployeeModel getEmployee(String token);
        Response login(String email,String password);

}
