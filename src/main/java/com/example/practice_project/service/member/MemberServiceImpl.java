package com.example.practice_project.service.member;

import com.example.practice_project.domain.Member;
import com.example.practice_project.dto.MemberDto;
import com.example.practice_project.mapstruct.MemberMapper;
import com.example.practice_project.repository.member.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

    private static final String CLASS = MemberServiceImpl.class.getSimpleName();

    private static final MemberMapper mapper = Mappers.getMapper(MemberMapper.class);

    private MemberRepository repository;

    @Override
    public MemberDto getByEmail(String email) {
        Member member = repository.getOneByEmail(email);
        log.info("{} getByEmail取出 Member: {}", CLASS, member);

        if (member == null) return null;

        return mapper.toMemberDto(member);
    }

}
