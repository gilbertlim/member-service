package com.gilbert.msa.domain.mapper;

import com.gilbert.msa.domain.dto.MemberDto;
import com.gilbert.msa.domain.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    Member toEntity(MemberDto memberDto);
    MemberDto toDto(Member member);
}
