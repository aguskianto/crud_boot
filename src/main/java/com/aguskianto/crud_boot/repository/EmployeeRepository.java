package com.aguskianto.crud_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aguskianto.crud_boot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}