package com.juaracoding.MFKJavaWeb.repo;


import com.juaracoding.MFKJavaWeb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
