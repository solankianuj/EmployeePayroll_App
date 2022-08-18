package com.bridgelabz.employeepayroll.employeeDTO;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class EmployeeDTO {

   @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = " First Name is invalid")
    private String fname;
   @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = " Last Name is invalid")
    private String lname;
   @Pattern(regexp = "^[A-Z a-z 0-9]{2,}$", message = "Company Name is invalid")
    private String companyName;
   @Min(value = 15000,message = "Minimum Salary is must be 15000 ")
   @Max(value = 30000,message = "Salary is not more then 30000")
    private long salary;
   @NotEmpty(message = "Department can not be empty")
    private String department;
   @Pattern(regexp = "^[a-z]{1,}[@]{1}[a-z]{2,}[.]{1}[a-z]{3,}",message = "invalid")
    private String emailId;
   @Pattern(regexp = "[a-z A-Z 0-9]{4,}",message = "invalid password, password must be contain at lest 4 character")
    private String password;
}
