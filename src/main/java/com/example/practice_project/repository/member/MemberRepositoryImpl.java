package com.example.practice_project.repository.member;

import com.example.practice_project.domain.bank.Member;
import com.example.practice_project.domain.bank.MemberProjection;
import com.example.practice_project.domain.bank.MemberRecord;
import com.example.practice_project.jpa.MemberJpaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@AllArgsConstructor
public class MemberRepositoryImpl implements MemberRepository{

    private static final String CLASS = MemberRepositoryImpl.class.getSimpleName();

    private MemberJpaRepository repository;

    @Override
    public Member getOneById(Long id) {
        return repository.findByIdAndStatusNot(id, 0).orElse(null);
    }

    @Override
//    @Cacheable(value = "Email", key = "#email", unless = "#result == null")
    public Member getOneByEmail(String email) {
        return repository.findByEmailAndStatusNot(email, 0).orElse(null);
    }

    @Override
    public Member getOneByPhone(String phone) {
        return repository.findByPhoneAndStatusNot(phone, 0).orElse(null);
    }

    @Override
    public List<Member> getAll() {
        return repository.findAllByStatusNot(0);
    }

    @Override
    public MemberRecord getRecordById(Long id) {
        return repository.findRecordByIdAndStatusNot(id, 0).orElse(null);
    }
}
