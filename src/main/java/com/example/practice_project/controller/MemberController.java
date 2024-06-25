package com.example.practice_project.controller;

import com.example.practice_project.dto.MemberDto;
import com.example.practice_project.service.member.MemberService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("member")
@AllArgsConstructor
public class MemberController {

    private static final String CLASS = MemberController.class.getSimpleName();

    private MemberService memberService;

    @GetMapping("")
    public ResponseEntity<?> get(String email) {

        try {
            MemberDto memberDto = memberService.getByEmail(email);
            if (memberDto == null) {
                log.info("{} 查無資料，email:{}", CLASS, email);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.ok().body(memberDto);
        } catch (Exception e) {
            log.error("{} 處理錯誤: {}", CLASS, e.getMessage());
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }

    }
}
