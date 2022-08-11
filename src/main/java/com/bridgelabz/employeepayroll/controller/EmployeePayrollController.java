package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @RequestMapping("/employee")
    public EmployeeModel employeeModel(){
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel(1, employeeDTO);
        return employeeModel;
    }

    @GetMapping("/getEmployee")
    public EmployeeModel getEmployeeModel(@RequestParam(value = "id") int id){
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);
        return employeeModel;
    }


    @PostMapping("/creatEmployee")
    public EmployeeModel getEmployeeModel(@RequestBody EmployeeDTO employeeDTO){

        EmployeeModel employeeModel =new EmployeeModel( 1, employeeDTO);
        return employeeModel;
    }

    @PutMapping("/updateEmployee/{id}")
    public EmployeeModel updateEmployeeModel(@PathVariable ("id") int id,@RequestBody EmployeeDTO employeeDTO){

        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);
        return employeeModel;
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeModel deleteEmployeeModel(@PathVariable ("id") int id){
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setFname("Anuj");
        employeeDTO.setLname("Solanki");
        employeeDTO.setCompanyName("HP");
        employeeDTO.setSalary(10000l);
        EmployeeModel employeeModel =new EmployeeModel( id, employeeDTO);
        return employeeModel;
    }


}
