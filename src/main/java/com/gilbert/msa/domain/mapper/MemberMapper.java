package com.gilbert.msa.domain.mapper;

import com.gilbert.msa.domain.dto.MemberDto;
import com.gilbert.msa.domain.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    @Mapping(source = "memberId", target = "member_id")
    Member toEntity(MemberDto memberDto);

    @Mapping(source = "member_id", target = "memberId")
    MemberDto toDto(Member member);
}
