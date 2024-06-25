package com.example.practice_project.jpa;

import com.example.practice_project.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByIdAndStatusNot(Long id, Integer status);

    Optional<Member> findByEmailAndStatusNot(String email, Integer status);

    Optional<Member> findByPhoneAndStatusNot(String phone, Integer status);

    List<Member> findAllByStatusNot(Integer status);
}
