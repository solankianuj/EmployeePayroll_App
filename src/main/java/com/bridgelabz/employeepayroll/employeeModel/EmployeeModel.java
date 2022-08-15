package com.bridgelabz.employeepayroll.employeeModel;

import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employeedata")
@Data
public class EmployeeModel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String fname;
    private String lname;
    private String companyName;
    private long salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeModel( EmployeeDTO employeeDTO) {

        this.fname=employeeDTO.getFname();
        this.lname=employeeDTO.getLname();
        this.companyName=employeeDTO.getCompanyName();
        this.salary=employeeDTO.getSalary();
    }


    public EmployeeModel() {

    }
}
