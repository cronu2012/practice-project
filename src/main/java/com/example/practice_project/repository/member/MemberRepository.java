package com.example.practice_project.repository.member;

import com.example.practice_project.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {

    Member getOneById(Long id);

    Member getOneByEmail(String email);

    Member getOneByPhone(String phone);

    List<Member> getAll();
}
