package com.example.jpaproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Setter
@Getter
@ToString
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLOYEE_ID")
    @SequenceGenerator(name = "SEQ_EMPLOYEE_ID", sequenceName = "SEQ_EMPLOYEE_ID", allocationSize = 1)
    @Column(name = "EMPLOYEE_ID")
    private Long employee_id;

    @Column(name = "EMPLOYEE_NO")
    private String employeeNo;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMPLOYEE_EMAIL")
    private String employeeEmail;

    @Column(name = "SYSTEM_PASSWORD")
    private String systemPassword;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Column(name = "HIRE_DATE")
    private String hireDate;

    @Column(name = "SALARY_YEAR")
    private BigDecimal salaryYear;

    @Column(name = "LAST_MODIFY_TIME")
    private ZonedDateTime lastModifyTime;
}
