package com.example.practice_project.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class MemberDto implements Serializable {
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String email;
    private String password;
    private String memberName;
    private Integer age;
    private String spEmail;
    private String phone;
    private Integer status;
}
