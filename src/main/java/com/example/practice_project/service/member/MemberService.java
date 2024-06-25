package com.example.practice_project.service.member;

import com.example.practice_project.dto.MemberDto;
import org.springframework.stereotype.Service;

public interface MemberService {

    MemberDto getByEmail(String email);

}
