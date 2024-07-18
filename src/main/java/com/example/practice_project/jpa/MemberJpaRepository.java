package com.example.practice_project.jpa;

import com.example.practice_project.domain.bank.Member;
import com.example.practice_project.domain.bank.MemberProjection;
import com.example.practice_project.domain.bank.MemberRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByIdAndStatusNot(Long id, Integer status);

    Optional<Member> findByEmailAndStatusNot(String email, Integer status);

    Optional<Member> findByPhoneAndStatusNot(String phone, Integer status);

    List<Member> findAllByStatusNot(Integer status);

    Optional<MemberRecord> findRecordByIdAndStatusNot(Long id, Integer status);
}
