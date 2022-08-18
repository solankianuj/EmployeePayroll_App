package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import com.bridgelabz.employeepayroll.service.IEmployeeServices;
import com.bridgelabz.employeepayroll.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @Autowired
    IEmployeeServices employeeServices;

    @PostMapping("/addEmployee")
    public EmployeeModel addemployee(@Valid @RequestBody EmployeeDTO employeeDTO){
        return employeeServices.addEmployee(employeeDTO);
    }

    @PutMapping("updateEmployee")
    public EmployeeModel updateemployee(@RequestHeader String token,@RequestBody EmployeeDTO employeeDTO){
        return employeeServices.updateemployee(token,employeeDTO);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeModel deleteemployee(@RequestHeader String token){
        return employeeServices.deleteemployee(token);
    }


    @GetMapping("/getemployeelist")
    public List<EmployeeModel> getEmployee(){
      return   employeeServices.getEmployeeList();
    }

    @GetMapping("/getEmployee")
    public EmployeeModel getEmployeeModel(@RequestHeader String token){
        return employeeServices.getEmployee(token);
    }
    @PostMapping("/login")
    public Response login(@RequestParam String emile, @RequestParam String password){
        return employeeServices.login(emile,password);
    }

}
