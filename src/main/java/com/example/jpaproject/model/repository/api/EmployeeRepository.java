package com.example.jpaproject.model.repository.api;

import com.example.jpaproject.model.Employee;

import java.util.List;
import java.util.Optional;

/**
 *  The Repository interface of Entity Employee
 */
public interface EmployeeRepository {

    Employee save(Employee entity);

    List<Employee> saveAll(List<Employee> list);

    Optional<Employee> getByEmployeeNo(String employeeNo);

    List<Employee> getByDepartment(String department);

    List<Employee> getByBranch(String branch);

    void delete(Employee entity);

}
