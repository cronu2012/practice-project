package com.example.practice_project.repository.member;

import com.example.practice_project.domain.Member;
import com.example.practice_project.jpa.MemberJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class MemberRepositoryImpl implements MemberRepository{

    private MemberJpaRepository repository;

    @Override
    public Optional<Member> getOneById(Long id) {
        return repository.findByIdAndStatusNot(id, 0);
    }

    @Override
    public Optional<Member> getOneByEmail(String email) {
        return repository.findByEmailAndStatusNot(email, 0);
    }

    @Override
    public Optional<Member> getOneByPhone(String phone) {
        return repository.findByPhoneAndStatusNot(phone, 0);
    }

    @Override
    public List<Member> getAll() {
        return repository.findAllByStatusNot(0);
    }
}
