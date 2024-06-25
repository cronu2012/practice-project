package com.example.practice_project.mapstruct;

import com.example.practice_project.domain.Member;
import com.example.practice_project.dto.MemberDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MemberMapper {

    MemberDto toMemberDto(Member source);
}
