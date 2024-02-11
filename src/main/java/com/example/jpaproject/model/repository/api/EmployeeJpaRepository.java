package com.example.jpaproject.model.repository.api;

import com.example.jpaproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmployeeNo(String employeeNo);

    List<Employee> findByDepartment(String department);

    List<Employee> findByBranch(String branch);

}
