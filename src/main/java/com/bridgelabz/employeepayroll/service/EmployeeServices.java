package com.bridgelabz.employeepayroll.service;
import com.bridgelabz.employeepayroll.employeeDTO.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import com.bridgelabz.employeepayroll.exception.EmployeeNotFoundException;
import com.bridgelabz.employeepayroll.repository.IEmployeeRepository;
import com.bridgelabz.employeepayroll.util.Response;
import com.bridgelabz.employeepayroll.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class EmployeeServices  implements  IEmployeeServices{


    @Autowired
    IEmployeeRepository employeeRepository;
    @Autowired
    TokenUtil tokenUtil;

    @Override
    public EmployeeModel addEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel=new EmployeeModel( employeeDTO);
        employeeRepository.save(employeeModel);
        return employeeModel;
    }
    @Override
    public List<EmployeeModel> getEmployeeList() {
        List<EmployeeModel> employeeModelList =employeeRepository.findAll();
       if (employeeModelList.size()>0){
           return employeeModelList;
       }
       else throw new EmployeeNotFoundException(400,"No Data Present !!");
    }

    @Override
    public EmployeeModel getEmployee(String token)  {
        int id=tokenUtil.decodeToken(token);
        Optional<EmployeeModel> isEmployeePresent=employeeRepository.findById(id);
        if(isEmployeePresent.isPresent()) {
            return isEmployeePresent.get();
        }
        else throw new EmployeeNotFoundException(400,"Employee Not Found !!");
    }

    @Override
    public Response login(String email, String password) {

        Optional<EmployeeModel> isEmailPresent=employeeRepository.findByEmailId(email);
        if (isEmailPresent.isPresent()){
            if (isEmailPresent.get().getPassword().equals(password)){
                String token= tokenUtil.createToken(isEmailPresent.get().getId());
                return new Response("Login Succcess Full",200,token);
            }
            throw new EmployeeNotFoundException(400,"Invalid Cedential");
        }
        return null;
    }

    @Override
    public EmployeeModel updateemployee(String token, EmployeeDTO employeeDTO) {
        int id= tokenUtil.decodeToken(token);
        Optional<EmployeeModel> isEmployeePresent=employeeRepository.findById(id);
        isEmployeePresent.get().setFname(employeeDTO.getFname());
        isEmployeePresent.get().setLname(employeeDTO.getLname());
        isEmployeePresent.get().setDepartment(employeeDTO.getDepartment());
        isEmployeePresent.get().setEmailId(employeeDTO.getEmailId());
        isEmployeePresent.get().setPassword(employeeDTO.getPassword());
        isEmployeePresent.get().setCompanyName(employeeDTO.getCompanyName());
        isEmployeePresent.get().setSalary(employeeDTO.getSalary());
            employeeRepository.save(isEmployeePresent.get());
            return isEmployeePresent.get();

    }

    @Override
    public EmployeeModel deleteemployee(String token) {
        int id= tokenUtil.decodeToken(token);
        Optional<EmployeeModel> isEmployeePresent=employeeRepository.findById(id);
        employeeRepository.delete(isEmployeePresent.get());
            return isEmployeePresent.get();
    }

}
