package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import org.springframework.stereotype.Service;

@Service

public class EmployeeServices  implements  IEmployeeServices{
    @Override
    public EmployeeModel getEmployeeData(EmployeeDTO employeeDTO) {

        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel(1, employeeDTO);
        return employeeModel;
    }

    @Override
    public EmployeeModel getEmployee(int id) {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);

        return employeeModel;
    }

    @Override
    public EmployeeModel addEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel =new EmployeeModel( 1, employeeDTO);

        return employeeModel;
    }

    @Override
    public EmployeeModel updateEmployee(int id,EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);

        return employeeModel;
    }

    @Override
    public EmployeeModel deleteEmployee(int id) {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);
        return employeeModel;
    }
}
