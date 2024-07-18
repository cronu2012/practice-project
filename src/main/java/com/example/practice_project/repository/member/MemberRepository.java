package com.example.practice_project.repository.member;

import com.example.practice_project.domain.bank.Member;
import com.example.practice_project.domain.bank.MemberProjection;
import com.example.practice_project.domain.bank.MemberRecord;

import java.util.List;


public interface MemberRepository {

    Member getOneById(Long id);

    Member getOneByEmail(String email);

    Member getOneByPhone(String phone);

    List<Member> getAll();

    MemberRecord getRecordById(Long id);


}
