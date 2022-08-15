package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import com.bridgelabz.employeepayroll.service.IEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @Autowired
    IEmployeeServices employeeServices;

    @PostMapping("/addEmployee")
    public EmployeeModel addemployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeServices.addEmployee(employeeDTO);
    }

    @PutMapping("updateEmployee/{id}")
    public EmployeeModel updateemployee(@PathVariable int id,@RequestBody EmployeeDTO employeeDTO){
        return employeeServices.updateemployee(id,employeeDTO);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeModel deleteemployee(@PathVariable int id){
        return employeeServices.deleteemployee(id);
    }


    @GetMapping("/getemployeelist")
    public List<EmployeeModel> getEmployee(){
      return   employeeServices.getEmployeeList();
    }

    @GetMapping("/getEmployee")
    public EmployeeModel getEmployeeModel(@RequestParam(value = "id") int id){
        return employeeServices.getEmployee(id);
    }

}
