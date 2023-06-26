package com.gilbert.msa.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private String memberId;

    private String name;

    private String email;

    private String phone;

    private String address;
}