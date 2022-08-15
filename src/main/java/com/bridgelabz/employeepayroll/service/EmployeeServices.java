package com.bridgelabz.employeepayroll.service;
import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import com.bridgelabz.employeepayroll.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class EmployeeServices  implements  IEmployeeServices{


    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public EmployeeModel addEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel=new EmployeeModel( employeeDTO);
        employeeRepository.save(employeeModel);
        return employeeModel;
    }
    @Override
    public List<EmployeeModel> getEmployeeList() {
        List<EmployeeModel> employeeModelList =employeeRepository.findAll();
        return employeeModelList;
    }

    @Override
    public EmployeeModel getEmployee(int id) {
        Optional<EmployeeModel> isEmployeePresent=employeeRepository.findById(id);
        return  isEmployeePresent.get();
    }

    @Override
    public EmployeeModel updateemployee(int id, EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel=this.getEmployee(id);
        employeeModel.setFname(employeeDTO.getFname());
        employeeModel.setLname(employeeDTO.getLname());
        employeeModel.setCompanyName(employeeDTO.getCompanyName());
        employeeModel.setSalary(employeeDTO.getSalary());
            employeeRepository.save(employeeModel);
            return employeeModel;

    }

    @Override
    public EmployeeModel deleteemployee(int id) {
        EmployeeModel employeeModel=this.getEmployee(id);
        employeeRepository.delete(employeeModel);
            return employeeModel;
    }

}
