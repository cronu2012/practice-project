package com.example.jpaproject.model.repository.impl;

import com.example.jpaproject.model.Employee;
import com.example.jpaproject.model.repository.api.EmployeeJpaRepository;
import com.example.jpaproject.model.repository.api.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeJpaRepository repository;

    @Override
    public Employee save(Employee entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public List<Employee> saveAll(List<Employee> list) {
        return repository.saveAll(list);
    }

    @Override
    public Optional<Employee> getByEmployeeNo(String employeeNo) {
        return repository.findByEmployeeNo(employeeNo);
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    @Override
    public List<Employee> getByBranch(String branch) {
        return repository.findByBranch(branch);
    }

    @Override
    public void delete(Employee entity) {
        repository.delete(entity);
    }
}
