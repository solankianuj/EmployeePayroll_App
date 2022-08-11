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

        @RequestMapping("/seeEmployees")
        public List<EmployeeModel> employeeModel(){
        return employeeServices.getEmployeeData();
    }

        @GetMapping("/getEmployee")
        public EmployeeModel getEmployeeModel(@RequestParam(value = "id") int id){

            return employeeServices.getEmployee(id);
        }


        @PostMapping("/creatEmployee")
        public EmployeeModel getEmployeeModel(@RequestBody EmployeeDTO employeeDTO){

            return employeeServices.addEmployee(employeeDTO);
        }

        @PutMapping("/updateEmployee/{id}")
        public EmployeeModel updateEmployeeModel(@PathVariable ("id") int id,@RequestBody EmployeeDTO employeeDTO){

            return employeeServices.updateEmployee(id, employeeDTO);
        }

        @DeleteMapping("/deleteEmployee/{id}")
        public void deleteEmployeeModel(@PathVariable ("id") int id){
            employeeServices.deleteEmployee(id);
        }


}
