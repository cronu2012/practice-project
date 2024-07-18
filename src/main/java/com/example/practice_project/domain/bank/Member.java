package com.example.practice_project.domain.bank;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "t_member")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //@Column(name = "create_time", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Column(name = "createTime")
    private LocalDateTime createTime;

    //@Column(name = "update_time", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Column(name = "updateTime")
    private LocalDateTime updateTime;

    //@Column(name = "email", nullable = false, length = 100, unique = true)
    @Column(name = "email")
    private String email;

    //@Column(name = "password", nullable = false, length = 50)
    @Column(name = "password")
    private String password;

    //@Column(name = "member_name", nullable = false, length = 50)
    @Column(name = "memberName")
    private String memberName;

    //@Column(name = "age", nullable = false)
    @Column(name = "age")
    private Integer age;

    //@Column(name = "sp_email", length = 100)
    @Column(name = "spEmail")
    private String spEmail;

    //@Column(name = "phone", length = 20, unique = true)
    @Column(name = "phone")
    private String phone;

    //@Column(name = "status", nullable = false, columnDefinition = "TINYINT DEFAULT 1")
    @Column(name = "status")
    private Integer status;

}
