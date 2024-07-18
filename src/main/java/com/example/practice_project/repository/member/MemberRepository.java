package com.example.practice_project.repository.member;

import com.example.practice_project.domain.member.Member;
import com.example.practice_project.domain.member.MemberRecord;

import java.util.List;


public interface MemberRepository {

    Member getOneById(Long id);

    Member getOneByEmail(String email);

    Member getOneByPhone(String phone);

    List<Member> getAll();

    MemberRecord getRecordById(Long id);


}
