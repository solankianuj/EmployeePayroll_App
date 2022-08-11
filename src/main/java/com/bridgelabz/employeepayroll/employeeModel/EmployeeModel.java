package com.bridgelabz.employeepayroll.employeeModel;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Data
public class EmployeeModel {

    private int id;
    private String fname;
    private String lname;
    private String companyName;
    private long salary;

    public EmployeeModel(int id ,EmployeeDTO employeeDTO) {
        this.id=id;
        this.fname=employeeDTO.getFname();
        this.lname=employeeDTO.getLname();
        this.companyName=employeeDTO.getCompanyName();
        this.salary=employeeDTO.getSalary();
    }


}
