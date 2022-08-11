package com.bridgelabz.employeepayroll.service;
import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service

public class EmployeeServices  implements  IEmployeeServices{

    List<EmployeeModel> employeeModelList=new ArrayList<>();
    @Override
    public List<EmployeeModel> getEmployeeData() {
        return employeeModelList;
    }

    @Override
    public EmployeeModel getEmployee(int id) {
        return employeeModelList.get(id-1);
    }
        @Override
        public EmployeeModel addEmployee(EmployeeDTO employeeDTO) {
            EmployeeModel employeeModel= new EmployeeModel(employeeModelList.size()+1,employeeDTO);
               employeeModelList.add(employeeModel);
            return employeeModel;
        }

    @Override
    public EmployeeModel updateEmployee(int id,EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel =this.getEmployee(id);
        employeeModel.setFname(employeeDTO.getFname());
        employeeModel.setLname(employeeDTO.getLname());
        employeeModel.setCompanyName(employeeDTO.getCompanyName());
        employeeModel.setSalary(employeeDTO.getSalary());
        employeeModelList.set(id-1,employeeModel);

        return employeeModel;
    }

    @Override
    public void deleteEmployee(int id) {

        employeeModelList.remove(id-1);

    }
}
