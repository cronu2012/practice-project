package com.example.practice_project.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class MemberDto {
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
