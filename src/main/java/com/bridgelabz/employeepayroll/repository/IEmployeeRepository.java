package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.employeeModel.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
    Optional<EmployeeModel> findByEmailId(String email);
}
