package com.example.practice_project.repository.member;

import com.example.practice_project.domain.Member;
import com.example.practice_project.jpa.MemberJpaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    @Cacheable(value = "Member", key = "#email", unless = "#result == null")
    public Member getOneByEmail(String email) {
        log.info("{} getOneByEmail 執行未取得緩存",CLASS);
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
}
